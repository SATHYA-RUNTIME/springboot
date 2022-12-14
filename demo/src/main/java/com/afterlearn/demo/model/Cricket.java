package com.afterlearn.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Cricket {
    @Id
    private int cid;
    private String name;
    private String catogary;
    private int age;
    public int getCid() {
        return cid;
    }
    public void setCid(int cid) {
        this.cid = cid;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getCatogary() {
        return catogary;
    }
    public void setCatogary(String catogary) {
        this.catogary = catogary;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    @Override
    public String toString() {
        return "Cricket [cid=" + cid + ", \n name=" + name + ", \ncatogary=" + catogary + ", \nage=" + age + "]";
    }


}
