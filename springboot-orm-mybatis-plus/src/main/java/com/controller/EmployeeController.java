package com.controller;

import com.entity.Employee;
import com.mapper.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author YanZhao
 * @description
 * @date 2022年05月11日 20:51
 */

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeMapper employeeMapper;

    @GetMapping("findall")
    public List<Employee> selectAllEmployee(){
        List<Employee> employeeList = employeeMapper.selectList(null);
        return employeeList;
    }

    @GetMapping("findname")
    public List<Employee> contextLoads() {
        List<Employee> list = employeeMapper.selectAllByLastName("tom");
        return list;
    }
}
