package com.czxy.controller;

import com.czxy.domain.Aclass;
import com.czxy.domain.Student;
import com.czxy.service.StudnetService;
import com.github.pagehelper.PageInfo;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/student")
@CrossOrigin
public class StudentController {
    @Resource
    private StudnetService studnetService;

    @GetMapping("/FindStudnetForPageInfo/{pageNum}/{pageSize}")
    public ResponseEntity<PageInfo<Student>> FindStudnetForPageInfo(@PathVariable("pageNum")Integer pageNum,@PathVariable("pageSize") Integer pageSize) {
        PageInfo<Student> pii = studnetService.FindStudnetForPageInfo(pageNum,pageSize);
        for (Student student : pii.getList()) {
            System.out.println(student.toString());
        }
        return ResponseEntity.ok(pii);
    }

    @GetMapping("/FindStudentBystudentID/{studentID}")
    public ResponseEntity<Student> FindStudentBystudentID(@PathVariable("studentID") Integer studentID){
       Student student =  studnetService.FindStudentBystudentID(studentID);
       return ResponseEntity.ok(student);
    }

    @GetMapping("/FindAclass")
    public ResponseEntity<List<Aclass>> FindAclass(){
       List<Aclass> alist =  studnetService.FindAclass();
       return ResponseEntity.ok(alist);
    }
    @PutMapping("/update")
    public ResponseEntity<String> update(@RequestBody Student student){
        studnetService.update(student);
        return ResponseEntity.ok("修改成功");
    }
    @DeleteMapping("/deleteBystudentID/{studentID}")
    public ResponseEntity<String> deleteBystudentID(@PathVariable("studentID") Integer studentID){
        studnetService.deleteBystudentID(studentID);
        return ResponseEntity.ok("删除成功");
    }
}
