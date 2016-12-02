package com.example.darktosee.recyclerviewdemo;

import android.support.v7.app.AppCompatActivity;

/**
 * Created by HJUser on 2016/12/01.
 */
public class Student  extends AppCompatActivity {
    private String name;
    private String grade;


    public Student(String name, String grade) {
        this.setGrade(grade);
        this.setName(name);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGrade() {
        return "年级："+grade;
    }

    public String getName() {
        return "姓名："+name;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }




}