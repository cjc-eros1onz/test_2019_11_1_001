package com.czxy.service.impl;

import com.czxy.dao.AclassDao;
import com.czxy.dao.StudentDao;
import com.czxy.domain.Aclass;
import com.czxy.domain.Student;
import com.czxy.service.StudnetService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional
public class StudnetServiceImpl implements StudnetService {
    @Resource
    private StudentDao studentDao;
    @Resource
    private AclassDao aclassDao;

    @Override
    public PageInfo<Student> FindStudnetForPageInfo(Integer pageNum,Integer pageSize) {
        PageHelper.startPage(pageNum,pageSize);
       List<Student> slist =  studentDao.FindStudnetForPageInfo();
       return new PageInfo<Student>(slist);
    }

    @Override
    public Student FindStudentBystudentID(Integer studentID) {
        Student student = studentDao.selectByPrimaryKey(studentID);
        return student;
    }

    @Override
    public List<Aclass> FindAclass() {
        List<Aclass> aclasses = aclassDao.selectAll();
        return aclasses;
    }

    @Override
    public void update(Student student) {
        studentDao.updateByPrimaryKeySelective(student);
    }

    @Override
    public void deleteBystudentID(Integer studentID) {
        studentDao.deleteByPrimaryKey(studentID);
    }
}
