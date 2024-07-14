package com.mycompany.mavenproject8;

/**
 *
 * @author sgpalima
 */
public class Patient extends Person{
    private String patientid;
    private double height;
    private double weight;
    
    public Patient(String fname, String lname, String patientid, double height, double weight){
        super(lname, fname);
        this.patientid = patientid;
        this.height = height;
        this.weight = weight;
    }
    
    public String getpatientid(){
        return patientid;
    }
    public void setpatientid(String patientid){
        this.patientid = patientid;
    }
    public double getheight(){
        return height;
    }
    public void setheight(double height){
        this.height = height;
    }
    public double getweight(){
        return weight;
    }
    public void setweight(double weight){
        this.weight = weight;
    } 
}

