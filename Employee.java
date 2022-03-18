// import java.io.*;

public class Employee {
    static String name;
    static int age;
    static String designation;
    static double salary;
    public void Employee(String name){
        this.name = name;
    }
    public void empAge(int empAge){
        age = empAge;
    }
    public void empDesignation(String empDesig){
        designation = empDesig;
    }
    public void empsSalary(double empSalary){
        salary = empSalary;
    }
    public static void main(String[] args){
        System.out.println("名字：" + name);
        System.out.println("年龄：" + age);
        System.out.println("职位：" + designation);
        System.out.println("薪水：" + salary);
    }
}
