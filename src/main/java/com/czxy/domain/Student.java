package com.czxy.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Table(name = "tab_student")
public class Student implements Serializable {
    @Id
    @Column(name = "studentID")
  private  Integer studentID;
    @Column(name = "student_name")
    private   String studentName ;
    @Column(name = "student_age")
    private  Integer studentAge;
    @Column(name = "student_birthday")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date studentBirthday ;
    private   Double score;
    @Column(name = "classID")
    private  String classID;
    private Aclass aclass;

    public Aclass getAclass() {
        return aclass;
    }

    public void setAclass(Aclass aclass) {
        this.aclass = aclass;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentID=" + studentID +
                ", studentName='" + studentName + '\'' +
                ", studentAge=" + studentAge +
                ", studentBirthday=" + studentBirthday +
                ", score=" + score +
                ", classID='" + classID + '\'' +
                '}';
    }

    public Integer getStudentID() {
        return studentID;
    }

    public void setStudentID(Integer studentID) {
        this.studentID = studentID;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public Integer getStudentAge() {
        return studentAge;
    }

    public void setStudentAge(Integer studentAge) {
        this.studentAge = studentAge;
    }
    @JsonFormat(pattern = "yyyy-MM-dd")
    public Date getStudentBirthday() {
        return studentBirthday;
    }

    public void setStudentBirthday(Date studentBirthday) {
        this.studentBirthday = studentBirthday;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public String getClassID() {
        return classID;
    }

    public void setClassID(String classID) {
        this.classID = classID;
    }

    public Student(Integer studentID, String studentName, Integer studentAge, Date studentBirthday, Double score, String classID) {

        this.studentID = studentID;
        this.studentName = studentName;
        this.studentAge = studentAge;
        this.studentBirthday = studentBirthday;
        this.score = score;
        this.classID = classID;
    }

    public Student() {

    }
}
