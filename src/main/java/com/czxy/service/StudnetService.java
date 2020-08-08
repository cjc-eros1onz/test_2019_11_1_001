package com.czxy.service;

import com.czxy.domain.Aclass;
import com.czxy.domain.Student;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface StudnetService {
    PageInfo<Student> FindStudnetForPageInfo(Integer pageNum,Integer pageSize);

    Student FindStudentBystudentID(Integer studentID);

    List<Aclass> FindAclass();

    void update(Student student);

    void deleteBystudentID(Integer studentID);
}
