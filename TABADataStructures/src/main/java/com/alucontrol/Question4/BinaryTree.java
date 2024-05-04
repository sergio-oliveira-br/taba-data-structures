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

public interface BinaryTree <T extends Comparable <T>>
{
    public void insert(T newEmployee);//This will insert an element into the tree
    public boolean isEmpty();         //This returns true if there are no nodes in the tree otherwise it will be false
    public int size();                //This returns a count of every node in the tree
    public void inOrder();            //This sort in the ascending order of their values
    public boolean contains(int id); //This returns true if the element can be found in the tree otherwise false
    public T findMax();               //This locates and returns the largest value stored
    public T findMin();               //This locates and returns the smallest value stored
    public boolean remove(T value);   //This removes the node which stores the element from the tree
}




