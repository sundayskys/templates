package com.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author YanZhao
 * @description
 * @date 2022年05月11日 20:45
 */

@Data
@TableName("tbl_employee")
public class Employee {

    private Long id;
    private String lastName;
    private String email;
    private Integer age;
}
