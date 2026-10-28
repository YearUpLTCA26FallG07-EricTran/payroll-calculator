package com.pluralsight;

import java.io.*;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {


        FileReader employeeReader = new FileReader("employee.csv");
        FileReader inventoryReader = new FileReader("inventory.csv");
        FileReader productsReader = new FileReader("products.csv");

        BufferedReader employeeBufferReader = new BufferedReader(employeeReader);
        BufferedReader inventoryBufferReader = new BufferedReader(employeeReader);
        BufferedReader productsBufferReader = new BufferedReader(employeeReader);



        Employees employee1 = new Employees(String);

        System.out.println(employee1.getGrossPay());



    }
}
