/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package party;

public class cake {

    NodeTree root; //creat root
    int choice;

    public cake(NodeTree root, int choice) {    //tree save tybe cake by index
        this.root = root;
        this.choice = choice;
    }

    public void addNode(NodeTree newNode, NodeTree rootex) {
        if (root == null) //if the tree empty
        {
            return;
        }

        if (newNode.value > rootex.value) {   //value larger than the root 
            if (rootex.right == null) // add it in right side
            {
                rootex.right = newNode;
            } else {
                addNode(newNode, rootex.right); //call function again
            }
        }

        if (newNode.value < rootex.value) {   //value smaller than the root 
            if (rootex.left == null) // add it in lift side
            {
                rootex.left = newNode;
            } else {
                addNode(newNode, rootex.left); //call function again
            }
        }
    }

    public void searchNode(int value, NodeTree rootex) {
        if (rootex == null) {  //if the tree empty

            return;
        }
        if (root.value == value) {

            return;
        }

        if (value > rootex.value) {   //value larger than the root 

            searchNode(value, rootex.right); //call function again
        }
        //----------------------------------------------
        if (value < rootex.value) {   //value smaller than the root 

            searchNode(value, rootex.left); //call function again
        }
    }

    public String choice() {
        String s = "";
        if (choice == 1) {
            s = "˚₊vanilla cake with Nutella filling₊˚";
        }
        if (choice == 2) {
            s = "˚₊vanilla cake with berries filling₊˚";
        }
        if (choice == 3) {
            s = "˚₊chocolate cake with kinder filling₊˚";
        }
        if (choice == 4) {
            s = "˚₊chocolate cake with caramel filling₊˚";
        }
        if (choice == 5) {
            s = "˚₊strawberry cake with white chocolate filling₊˚";
        }
        if (choice == 6) {
            s = "˚₊strawberry cake with berries filling₊˚";
        }
        return s;
    }

    @Override
    public String toString() {
        return "\nyour cake is : " + choice();
    }

}
