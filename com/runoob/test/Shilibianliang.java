package com.runoob.test;

import java.io.*;

public class Shilibianliang {
    public String name;
    private double salary;
    public Shilibianliang(String empName){
        name = empName;
    }
    public void setSalary(double empSal){
        salary = empSal;
    }
    public void printEmp(){
        System.out.println("���� ��" + name);
        System.out.println("нˮ ��" + salary);
    }
    public static void main(String[] args){
        Shilibianliang empOne = new Shilibianliang("Mr.Lin");
        empOne.setSalary(9999.99);
        empOne.printEmp();
    }

}
