package com.example.demo.data;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by Administrator on 2017/9/16 0016.
 */

@Entity
@Table(
        name = "Department"
)
public class Department {
    private String name;
    private String ParentName;
    private String grade;
    private String message;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getParentName() {
        return ParentName;
    }

    public void setParentName(String parentName) {
        ParentName = parentName;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
