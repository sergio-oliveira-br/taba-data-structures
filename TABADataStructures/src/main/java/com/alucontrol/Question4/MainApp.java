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

/** This is my Application */
public class MainApp
{
    public static void main(String[] args)
    {
        System.out.println("This is TABA - Data Structures" +
                "\nQuestion 4 - Binary Search Tree" +
                "\nStudent: Sergio Oliveira - x23170981\n---");

        /** Instantiate a Tree */
        BinarySearchTree<Employee> myTree = new BinarySearchTree<>();

        /** Crete new Employee */
        Employee myEmployee1 = new Employee(1234, "Sergio", "Development");
        Employee myEmployee2 = new Employee(5678, "Nelly", "HR");
        Employee myEmployee3 = new Employee(3876, "John", "Sales");
        Employee myEmployee4 = new Employee(6876, "Maria", "Finance");
        Employee myEmployee5 = new Employee(1111, "Sean", "Sales");

        /** Question 4 - b) Insert the Employee into the Tree*/
        myTree.insert(myEmployee1);
        myTree.insert(myEmployee2);
        myTree.insert(myEmployee3);
        myTree.insert(myEmployee4);
        myTree.insert(myEmployee5);

        /** Question 4 - b) Searching for an employee based on their employee ID. */
        System.out.println("Searching for the employee via ID...");
        myTree.contains(1234);

        /** Question 4 - c) Printing all employee records in the BST and print details based on ID */
        System.out.println("\nPrinting all employees...");
        myTree.inOrder();

        /** Question 4 - d) Deleting an employee by ID */
        System.out.println("\nDeleting employee via ID...");
        myTree.remove(myEmployee2);

        //printing again to check if the element was deleted
        System.out.println("\nPrinting all employees after removed...");
        myTree.inOrder();
    }
}
