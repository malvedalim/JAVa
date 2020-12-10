package com.malvedalimcodes;

import org.w3c.dom.Node;

public class Main {

    public static void main(String[] args) {
        BinarySearchTrees tree = new BinarySearchTrees();
        tree.insert(15);
        tree.insert( 7);
        tree.insert(21);
        tree.insert(4);
        tree.insert(13);
        tree.insert(18);
        tree.insert(25);
        tree.insert(5);
        System.out.println("Original tree: ");
        tree.traversePreOrder();
        System.out.println("Pre Order Traversal  Done.");
        tree.traverseInOrder();
        System.out.println("In Order Traversal Done.");

        tree.delete(5); //delete a leaf node

        System.out.println("After deleting 5:");
        tree.traversePreOrder();
        System.out.println("Pre Order Traversal Done.");
        tree.traverseInOrder();
        System.out.println("In Order Traversal Done.");

        tree.delete(7); // delete 2 node that has 2 children

        System.out.println("After deleting 7:");
        tree.traversePreOrder();
        System.out.println("Pre Order Traversal Done.");
        tree.traverseInOrder();
        System.out.println("In Order Traversal Done.");

        System.out.println("Minimum value of the tree = " + tree.min());

    }
}

class BinarySearchTrees{
    private class Node{
        private int value;
        private Node leftChild;
        private Node rightChild;

        public Node(int value){
            this.value = value;
        }
        @Override
        public String toString(){ //Override method to show the value of each node
            return "Node=" + value;
        }

    }
    private Node root;

    public void insert(int value){
        var node = new Node(value); //Add entered value to the constructor which is stored in the new variable node
        if(root == null){
            root = node;
            return;
        }
        var current = root;
        while(true){
            //Iterate and  checks if the entered value is either a leftChild or righChild node
            if (value < current.value){
                if(current.leftChild == null){ // Checks if rightChild node is empty. .
                    current.leftChild = node; // Then make it as the parent node of the new value you want to insert.
                    break;
                }
                current = current.leftChild; // Assign the entered value as the leftChild node
            }
            else{
                if(current.rightChild == null){ // Checks if rightChild node is empty. .
                    current.rightChild = node; // Then make it as the parent node of the new value you want to insert.
                    break;
                }
                current = current.rightChild; // Assign the entered value as the rightChild node
            }


        }
    }
    public void  traversePreOrder(){
       traversePreOrder(root);
    }
    private void traversePreOrder(Node root){
        if(root == null)
            return;
        System.out.print(root.value + ", ");
        traversePreOrder(root.leftChild);
        traversePreOrder(root.rightChild);
    }
    public void traverseInOrder(){
        traverseInOrder(root);
    }
    private void traverseInOrder(Node root){
        if(root.leftChild != null)
            traverseInOrder(root.leftChild);
        System.out.print(root.value + ", ");
        if(root.rightChild != null)
            traverseInOrder(root.rightChild);

    }
    private boolean isLeaf(Node node){
        return node.leftChild == null && node.rightChild == null;
    }
    public int min(){
        if(isLeaf(root)){
            return 0;
        }
        return min(root);
    }
    private int min(Node root)
    {
        int minv = root.value;
        while (root.leftChild != null)
        {
            minv = root.leftChild.value;
            root = root.leftChild;
        }
        return minv;
    }

    private Node delete (Node root , int value){
        if(root == null)
            return root;
        if(value < root.value){
            root.leftChild =  delete(root.leftChild , value);
        }
        else if(value > root.value){
            root.rightChild = delete(root.rightChild , value);
        }
        else{ // Delete when node is a leaf node or has 1 child.
            if(root.leftChild == null){
                return root.leftChild;
            }
            else if(root.rightChild == null){
                return root.rightChild;
            }
            // Delete a node that has 2 children
            root.value = min(root.rightChild);

            root.rightChild = delete(root.rightChild , root.value);
        }
        return root;
    }
    public void delete(int value){
        root = delete(root, value);
    }
}
