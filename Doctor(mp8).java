package com.mycompany.mavenproject8;

/**
 *
 * @author sgpalima
 */
public class Doctor extends Person {
    private String specialization;
    
    public Doctor(String fname, String lname, String specialization){
        super(lname, fname);
        this.specialization = specialization;
    }
    
    public String getspecialization(){
        return specialization;
    }
    public void setspecialization(String specialization){
        this.specialization = specialization;
    }
}
