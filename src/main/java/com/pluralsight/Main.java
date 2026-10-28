package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        try {
            FileReader fr = new FileReader("employees.csv");
            BufferedReader br = new BufferedReader(fr);

            br.readLine();

            String line;


            while((line = br.readLine()) != null ) {
                String[] parts = line.split("\\|");
                int employeeId = Integer.parseInt(parts[0]);
                String name = parts[1];
                double hoursWorked = Double.parseDouble(parts[2]);
                double payRate = Double.parseDouble(parts[3]);

                Employee employee = new Employee(employeeId, name, hoursWorked, payRate);
                System.out.printf("ID |%d| %s worked %.2f hours and $%.2f an hour, Gross pay is $%.2f.%n",  employee.getEmployeeId(), employee.getName(), employee.getHoursWorked(), employee.getPayRate(), (employee.getHoursWorked() * employee.getPayRate()));
            }




        } catch (Exception e) {

            System.out.println("There was an error with the message of: " + e.getMessage());
        }
    }
}


