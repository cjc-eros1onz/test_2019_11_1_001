package com.czxy.domain;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.ArrayList;

@Table(name = "tab_class")
public class Aclass implements Serializable {
    @Id
    @Column(name = "classID")
    private String classID;
    @Column(name = "class_name")
    private String className;
    @Column(name = "")
    private String classRoom;
    private String teacher;
    private ArrayList<Student> slist = new ArrayList<Student>();

    public ArrayList<Student> getSlist() {
        return slist;
    }

    public void setSlist(ArrayList<Student> slist) {
        this.slist = slist;
    }

    @Override
    public String toString() {
        return "AclassDao{" +
                "classID='" + classID + '\'' +
                ", className='" + className + '\'' +
                ", classRoom='" + classRoom + '\'' +
                ", teacher='" + teacher + '\'' +
                '}';
    }

    public String getClassID() {
        return classID;
    }

    public void setClassID(String classID) {
        this.classID = classID;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getClassRoom() {
        return classRoom;
    }

    public void setClassRoom(String classRoom) {
        this.classRoom = classRoom;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public Aclass(String classID, String className, String classRoom, String teacher) {

        this.classID = classID;
        this.className = className;
        this.classRoom = classRoom;
        this.teacher = teacher;
    }

    public Aclass() {

    }
}
