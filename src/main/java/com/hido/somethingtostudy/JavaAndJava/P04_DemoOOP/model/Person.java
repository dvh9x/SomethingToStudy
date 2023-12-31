package com.hido.somethingtostudy.JavaAndJava.P04_DemoOOP.model;

import lombok.Getter;

import java.util.Scanner;

public class Person {
    private String name;
    private int age;
    private String address;
    @Getter
    static String school = "PTIT";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public static void setSchool(String school) {
        Person.school = school;
    }
    static void setSchool(){
        school = "PTITHCM";
    }

    public Person() {
        System.out.println("Đây là constructor mặc định");
    }

    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên: ");
        name = sc.nextLine();
        System.out.println("Nhập tuổi: ");
        age = Integer.valueOf(sc.nextLine());
        System.out.println("Nhập địa chỉ: ");
        address = sc.nextLine();

    }
    public void show(){
        System.out.println("Name: " + name );
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
        System.out.println("School: " + school);
    }
}
