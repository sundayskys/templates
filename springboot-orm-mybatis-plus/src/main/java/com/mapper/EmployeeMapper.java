package com.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.entity.Employee;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author YanZhao
 * @description
 * @date 2022年05月11日 20:50
 */

@Mapper
@Repository
public interface EmployeeMapper extends BaseMapper<Employee> {


    List<Employee> selectAllByLastName(@Param("lastName") String lastName);
}
