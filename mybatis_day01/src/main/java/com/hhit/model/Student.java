package com.hhit.model;
import lombok.Data;

// 使用Data注解可以省略编写 构造函数 、get、set、toString方法等内容
@Data
public class Student {
    private int id;
    private String name;
    private int age;
    private String gender;
}
