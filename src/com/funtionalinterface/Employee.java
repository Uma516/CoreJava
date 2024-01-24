package com.funtionalinterface;

public class Employee {
    public int id;
    public String name;
    public int age;
    public float salary;
    public Employee(int id,String name,int age){
        super();
        this.id=id;
        this.age=age;
        this.name=name;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee[id= Integer.parseInt(" + id +"), age= Integer.parseInt(" + age + "), name=" + name + "]";
    }
}
