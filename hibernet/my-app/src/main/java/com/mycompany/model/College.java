package com.mycompany.model;

import javax.persistence.Entity;

@Entity
public class College {
   private int collegeid;
   private String collegename;
   private int numofdep;
   private int numofstudent;
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
public int getNumofdep() {
    return numofdep;
}
public void setNumofdep(int numofdep) {
    this.numofdep = numofdep;
}
public int getNumofstudent() {
    return numofstudent;
}
public void setNumofstudent(int numofstudent) {
    this.numofstudent = numofstudent;
}

}
