package com.mycompany.mavenproject8;
/**
 *
 * @author sgpalima
 */
public class Person {
    private String fname;
    private String lname;
    
    public Person(String fname, String lname){
        this.fname = fname;
        this.lname = lname;
    }
    
    public String getfname(){
        return fname;
    }
    public String setfname(){
        return fname;
    }
    public String getlname(){
        return lname;
    }
    public String setlname(){
        return lname;
    }
    
    public void fname(String fname){
        this.fname = fname;
    }
    public void lname(String lname){
        this.lname = lname;
    }
}
