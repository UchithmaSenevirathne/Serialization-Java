package org.example;

public class Employee implements java.io.Serializable{
    public String name;
    public String address;
    public transient int NIC;
    public int number;

}