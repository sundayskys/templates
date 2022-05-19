package com.locks;

import com.locks.utils.RedisLockHelper;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * @author YanZhao
 * @description
 * @date 2022年05月19日 18:03
 */

public class RedisLocksTest {

    private ExecutorService executorService = Executors.newFixedThreadPool(200);
    private JedisPool jedisPool;

    private RedisLocksTest() {
        JedisPoolConfig config = new JedisPoolConfig();
        config.setMaxTotal(60);
        config.setMaxIdle(60);
        config.setTestOnReturn(true);
        config.setTestOnBorrow(true);
        // String password = "123456";
        jedisPool = new JedisPool(config, "127.0.0.1", 6379, 10000);
    }

    public static void main(String[] args) throws InterruptedException {
        RedisLocksTest redisLockTest = new RedisLocksTest();
        RedisLockHelper redisLockHelper = new RedisLockHelper();
        for (int i = 0; i < 100; i++) {
            redisLockTest.executorService.execute(()->{
                try (Jedis jedis = redisLockTest.jedisPool.getResource()){
                    redisLockHelper.Lock_with_lua(jedis, "pjmike", "1", 20);
                    System.out.println("加锁成功");
                    redisLockHelper.unlock(jedis, "pjmike", "1");
                }
            });
        }
        redisLockTest.executorService.awaitTermination(1, TimeUnit.SECONDS);
        redisLockTest.executorService.shutdown();
    }
}
