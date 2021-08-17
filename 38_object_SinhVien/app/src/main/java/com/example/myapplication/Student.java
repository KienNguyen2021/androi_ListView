package com.example.myapplication;

public class Student {

    private String FullName;
    private String Address;
    private int YearOfBirth;

    public String getFullName() {
        return FullName;
    }

    public void setFullName(String fullName) {
        FullName = fullName;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public int getYearOfBirth() {
        return YearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        YearOfBirth = yearOfBirth;
    }

    public Student(String fullName, String address, int yearOfBirth) {
        FullName = fullName;
        Address = address;
        YearOfBirth = yearOfBirth;
    }

  /*  public void SetYearOfBirth(int ns){
        if(ns > 1999){
            ns = 1999;
        }

        YearOfBirth = ns;
    }

    public int GetYearOfBirth(){
        return YearOfBirth;
    }*/
}
