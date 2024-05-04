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

/** This is the node that will use for Binary Tree*/
public class BTNode<T>
{
    //instances variables...we have a object of type T and then also we are referring to a left and a right node...
    protected T element;            //The Data
    protected BTNode<T> left;       //Node point to left
    protected BTNode<T> right;      //Node point to right

    //constructor
    public BTNode(T element)
    {
        this.element = element;
    }

    //getters and setters


    public T getElement() {
        return element;
    }

    public void setElement(T element) {
        this.element = element;
    }

    public BTNode<T> getLeft() {
        return left;
    }

    public void setLeft(BTNode<T> left) {
        this.left = left;
    }

    public BTNode<T> getRight() {
        return right;
    }

    public void setRight(BTNode<T> right) {
        this.right = right;
    }

    @Override
    public String toString() {
        String leftVal = (left == null ? "NULL" : left.element.toString());
        String rightVal = (right == null ? "NULL" : right.element.toString());
        return "BTNode{" + "element=" + element + ", left=" + leftVal + ", right=" + rightVal + '}';
    }
}




