package com.mycompany.model;

import javax.persistence.Entity;

@Entity
public class Employee {  
    private int univercityid;  
    private int collegeid;  
    private String collegename;
    public int getUnivercityid() {
        return univercityid;
    }
    public void setUnivercityid(int univercityid) {
        this.univercityid = univercityid;
    }
    public int getCollegeid() {
        return collegeid;
    }
    public void setCollegeid(int collegeid) {
        this.collegeid = collegeid;
    }
    public String getCollegename() {
        return collegename;
    }
    public void setCollegename(String collegename) {
        this.collegename = collegename;
    }  



    }  
    