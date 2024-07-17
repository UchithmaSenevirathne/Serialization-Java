package org.example;

import java.io.*;

public class DeserializeDemo {
    public static void main(String[] args) {
        //create variable for assign the deserialized object
        Employee e = null;

        try {
            //create object to input ser file we want read
            FileInputStream fileIn = new FileInputStream("employee.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);

            //cast the object to Employee type and assign to e
            e = (Employee) in.readObject();

            in.close();
            fileIn.close();

        } catch (IOException i){
            i.printStackTrace();
            return;
        }catch (ClassNotFoundException c){
            System.out.println("employee class not found");
            c.printStackTrace();
            return;
        }
        System.out.println("Deserialized Employee...");
        System.out.println("name : " + e.name);
        System.out.println("address : " + e.address);
        System.out.println("ssn : " + e.NIC);
        System.out.println("number : " + e.number);
    }
}
