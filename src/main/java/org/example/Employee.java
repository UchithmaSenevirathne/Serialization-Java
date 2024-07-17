package org.example;

//we need to implement serializable interface to Employee class for serialize the object of that class
public class Employee implements java.io.Serializable{
    public String name;
    public String address;
    public transient int NIC;
    public int number;
    public void mailCheck(){
        System.out.println("Mailing a check to " + name + " " + address);
    }
}