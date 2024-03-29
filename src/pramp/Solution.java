package pramp;

import Andela.Node;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/***********************************************************
 * CODE INSTRUCTIONS:                                      *
 * 1) The method findLargestSmallerKey you're              *
 *    asked to implement is located at line 36.            *
 * 2) Use the helper code below to implement it.           *
 * 3) In a nutshell, the helper code allows you to         *
 *    to build a Binary Search Tree.                       *
 * 4) Jump to line 82 to see an example for how the        *
 *    helper code is used to test findLargestSmallerKey.   *
 ***********************************************************/


class Solution {

    static class Node {
        int key;
        Node left;
        Node right;
        Node parent;

        Node(int key) {
            this.key = key;
            left = null;
            right = null;
            parent = null;
        }
    }

    static class BinarySearchTree {

        Node root;

        int findSmalleset(int num,Node root){
            int result = -1;
            while (root !=null){
                if (num > root.key){
                    //---> go right
                    result = root.key;
                    root = root.right;
                }
                else {
                    root = root.left;
                }

            }

            return result;
        }

        //-----

        public void preOrderTraversal(Node root,List<Integer> result) {
            if (root == null) {
                return;
           }

            if (root.key %2 == 0){
                result.add(root.key);
            }
            preOrderTraversal(root.left,result);
            preOrderTraversal(root.right,result);

        }

        //--------> Find all even numbers ------
        List<Integer> findEven(){
            List<Integer> result = new ArrayList<Integer>();
            preOrderTraversal(root,result);

            return result;
        }


        List<Integer> findEvenSS(){
            return findEven();
        }
        int findLargestSmallerKey(int num) {
            return findSmalleset(num,root);
        }

        //  inserts a new node with the given number in the
        //  correct place in the tree
        void insert(int key) {

            // 1) If the tree is empty, create the root
            if(this.root == null) {
                this.root = new Node(key);
                return;
            }

            // 2) Otherwise, create a node with the key
            //    and traverse down the tree to find where to
            //    to insert the new node
            Node currentNode = this.root;
            Node newNode = new Node(key);

            while(currentNode != null) {
                if(key < currentNode.key) {
                    if(currentNode.left == null) {
                        currentNode.left = newNode;
                        newNode.parent = currentNode;
                        break;
                    } else {
                        currentNode = currentNode.left;
                    }
                } else {
                    if(currentNode.right == null) {
                        currentNode.right = newNode;
                        newNode.parent = currentNode;
                        break;
                    } else {
                        currentNode = currentNode.right;
                    }
                }
            }
        }
    }

    /*********************************************
     * Driver program to test above function     *
     *********************************************/

    public static void main(String[] args) {

        // Create a Binary Search Tree
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(20);
        bst.insert(9);
        bst.insert(25);
        bst.insert(5);
        bst.insert(12);
        bst.insert(11);
        bst.insert(14);

        int result = bst.findLargestSmallerKey(17);
        List<Integer> evenItems = bst.findEvenSS();
        System.out.println("Largest smaller number is " + result);
        System.out.println("EVEN NUMBERS IN TRESS " + evenItems);

    }
}