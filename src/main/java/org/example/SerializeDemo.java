package org.example;

import java.io.*;

public class SerializeDemo {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.name = "Uchithma Senevirathne";
        e.address = "Galle";
        e.NIC = 112233;
        e.number = 119;

        try {
            //create object from FileOutputStream and give the serializable type file name
            FileOutputStream fileOut = new FileOutputStream("employee.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            //pass the object that we want to write
            out.writeObject(e);
            //close the FileOutputStream and ObjectOutputStream
            out.close();
            fileOut.close();

            System.out.println("serialized date is saved in employee.ser");

        }catch (IOException i){
            i.printStackTrace();
        }
    }
}
