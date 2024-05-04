/**
 * HD in Computing Software Development
 *          HDCSDEV_INT
 *   Terminal Assessment - 2023/2024
 *      Due: Sat 4 May 2024
 *        Data Structures
 *   Lecture: Dr Keith Maycock
 *            ---
 *  Student: Sergio Vinicio da Silva Oliveira
 *  ID: x23170981
 *            ---
 * Question 4 - Binary Search Tree
 *  a) Employee class that will hold employee information.
 *  b) Implement methods for inserting and for searching.
 *  c) Provide a method to return and print details.
 *  d) Allow for deleting an employee.
 */

package com.alucontrol.Question4;

import java.util.Arrays;

/** Employee class that will hold employee information.*/
public class Employee implements Comparable<Employee>
{
    /** Instance Variables */
    private int id;
    private String name;
    private String department;

    //Valid Departments
    private String [] validDepartments = {"HR", "Development", "Sales", "Finance"};


    /** Constructor */
    public Employee(int id, String name, String department)
    {
        this.id = id;
        this.name = name;

       //Check if the Department is valid
        if(Arrays.asList(validDepartments).contains(department))
        {
            this.department = department;
        }

        else
        {
            throw new IllegalArgumentException("Invalid Department: " + department);
        }
    }

    /** Getters and Setters */
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department)
    {
        this.department = department;
    }

    /** ToString */
    @Override
    public String toString()
    {
        return "Employee{" + "id=" + id + ", name='" + name + '\'' + ", department='" + department + '\'' + '}';
    }

    @Override
    public int compareTo(Employee o)
    {
        return Integer.compare(this.id, o.id);
    }
}


