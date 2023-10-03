package com.example.example001.People;

public class People {
    private Long id;
    private String name;
    private  double salary;
    private  String email;
    private  String address;

    public People() {
    }

    public People(Long id,
                  String name,
                  double salary,
                  String email,
                  String address) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.email = email;
        this.address = address;
    }

    public People(String name,
                  double salary,
                  String email,
                  String address) {
        this.name = name;
        this.salary = salary;
        this.email = email;
        this.address = address;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", email='" + email + '\'' +
                ", address='" + address + '\'';
    }
}
