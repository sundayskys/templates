package com.jdbc;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author YanZhao
 * @description
 * @date 2022年05月11日 9:56
 */

@Data
@NoArgsConstructor
public class User {
    private int id;
    private String name;
    private int age;
    private String email;
}
