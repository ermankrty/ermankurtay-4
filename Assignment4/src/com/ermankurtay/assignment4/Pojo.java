package com.ermankurtay.assignment4;

import java.io.Serializable;

public class Pojo implements Serializable{
	private static final long serialVersionUID = 1L;
	private String studentid;
    private String studentname;
    private String studentcourse;
    private String studentgrade;

    public Pojo(String studentid, String studentname, String studentcourse,String studentgrade) {
    	
        this.studentid = studentid;
        this.studentname = studentname;
        this.studentcourse = studentcourse;
        this.studentgrade = studentgrade;
    }

    public String getStudentid() {
        return studentid;
    }

    public String getStudentName() {
        return studentname;
    }

    public String getStudentCourse() {
        return studentcourse;
    }

    public String getStudentGrade() {
    	
    	return studentgrade;
    }
}
