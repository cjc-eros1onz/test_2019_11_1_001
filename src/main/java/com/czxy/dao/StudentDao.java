package com.czxy.dao;

import com.czxy.domain.Student;
import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

@org.apache.ibatis.annotations.Mapper
public interface StudentDao extends Mapper<Student> {
    @Select("select * from tab_student")
    @Results({
            @Result(property = "studentID",column = "studentID"),
            @Result(property = "studentName",column = "student_name"),
            @Result(property = "studentAge",column = "student_age"),
            @Result(property = "studentBirthday",column = "student_birthday"),
            @Result(property = "score",column = "score"),
            @Result(property = "classID",column = "classID"),
            @Result(property = "aclass",one=@One(select= "com.czxy.dao.AclassDao.selectByPrimaryKey"),column = "classID")
    })
    List<Student> FindStudnetForPageInfo();
}
