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

public class BinarySearchTree <T extends Comparable<T>> implements BinaryTree<T>
{
    protected BTNode<T> root;

    /**Method: This will insert an element into the tree */
    @Override
    public void insert(T newEmployee)
    {
        if(isEmpty())
        {
            root = new BTNode<>(newEmployee); //update root node
        }

        else
        {
            insertNode(newEmployee,root);
        }
    }

    private void insertNode(T newEmployee, BTNode<T> current)
    {
        //find a place to insert the element and, compare the element with the root
        if (newEmployee.compareTo(current.element) == -1)
        {
            //add to the left
            if (current.left == null)
            {
                current.left = new BTNode<>(newEmployee);
            }

            else
            {
                insertNode(newEmployee, current.left); //recurse down the subtree rooted at current.left
            }
        }

        else
        {
            //add to right
            if (current.right == null)
            {
                current.right = new BTNode<>(newEmployee);
            }

            else
            {
                insertNode(newEmployee, current.right); //recurse down the subtree rooted at current.left
            }
        }
    }

    /**Method: Check if there are no nodes in the tree */
    @Override
    public boolean isEmpty()
    {
        return root == null;
    }

    @Override
    public int size()
    {
        return size(root);
    }

    private int size(BTNode<T> current)
    {
        if(current == null)
        {
            return 0;
        }

        else
        {
            return 1 + size(current.left) + size(current.right);
        }
    }

    @Override
    public void inOrder()
    {
        inOrder(root);
    }

    private void inOrder(BTNode<T> current)
    {
        //base case
        if(current == null)
        {
            return;
        }

        inOrder(current.left);
        System.out.println(current);
        inOrder(current.right);
    }

    @Override
    public boolean contains(int id)
    {
        return contains(id, root);
    }

    private boolean contains(int searchId, BTNode<T> current)
    {
        int currentID = ((Employee) current.element).getId();

        if (searchId == currentID)
        {
            System.out.println("Employee found: " + current.element);
            return true;
        }

        else if (searchId < currentID)
        {
            //System.out.println("Going to left side");
            return contains(searchId, current.left);
        }

        else
        {
            //System.out.println("Going to right side");
            return contains(searchId, current.right);
        }
    }

    @Override
    public T findMax() {
        return null;
    }

    @Override
    public T findMin() {
        return null;
    }


    /** Method: removes a node from the tree
     * -> Case 1: Remove a leaf node
     * -> Case 2: Remove a node with one child
     * -> Case 3: Remove a node with two children
     */
    @Override
    public boolean remove(T value)
    {
        //Search if the element in the tree
        BTNode<T> current = this.root;
        BTNode<T> fatherCurrent = null;

        while(current != null)
        {
            if(current.getElement().equals(value))
            {
                break;
            }

            //goes to the left side
            else if (value.compareTo(current.getElement()) == -1)
            {
                fatherCurrent = current;
                current = current.getLeft();
            }

            //goes to the right
            else
            {
                fatherCurrent = current;
                current = current.getRight();
            }
        }
        //Check if the element exist
        if(current != null) {
            //the element has 2 children or only the right)
            if (current.getRight() != null) {
                BTNode<T> replacement = current.getRight();
                BTNode<T> fatherReplacement = current;
                while (replacement.getLeft() != null) {
                    fatherReplacement = replacement;
                    replacement = replacement.getLeft();
                }
                replacement.setLeft(current.getLeft());

                if (fatherCurrent != null) {
                    if (current.getElement().compareTo(fatherCurrent.getElement()) == -1) {
                        fatherCurrent.setLeft(replacement);
                    } else {
                        fatherCurrent.setRight(replacement);
                    }
                } else //this is the root
                {
                    this.root = replacement;
                    fatherReplacement.setLeft(null);
                    this.root.setRight(fatherReplacement);
                    this.root.setLeft(current.getLeft());
                }

                //here I removed the element
                if (replacement.getElement().compareTo(fatherReplacement.getElement()) == -1) {
                    fatherReplacement.setLeft(null);
                } else {
                    fatherReplacement.setRight(null);
                }
            }
            //if the element has only one child (here is on the left side)
            else if (current.getLeft() != null) {
                BTNode<T> replacement = current.getLeft();
                BTNode<T> fatherReplacement = current;
                while (replacement.getRight() != null) {
                    fatherReplacement = replacement;
                    replacement = replacement.getRight();
                }

                if (fatherCurrent != null) {
                    if (current.getElement().compareTo(fatherCurrent.getElement()) == -1) {
                        fatherCurrent.setLeft(replacement);
                    } else {
                        fatherCurrent.setRight(replacement);
                    }
                } else {
                    this.root = replacement;
                }

                //here I removed the element
                if (replacement.getElement().compareTo(fatherReplacement.getElement()) == -1) {
                    fatherReplacement.setLeft(null);
                } else {
                    fatherReplacement.setRight(null);
                }
            }

            //if the element has no child
            else {
                if (fatherCurrent != null) {
                    if (current.getElement().compareTo(fatherCurrent.getElement()) == -1) {
                        fatherCurrent.setLeft(null);
                    } else {
                        fatherCurrent.setRight(null);
                    }
                } else { //this is root
                    this.root = null;
                }
            }
            return true;
        }
        else
        {
            return false;
        }
    }
}
