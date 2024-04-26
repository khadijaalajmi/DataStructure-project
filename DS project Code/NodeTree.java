/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package party;

public class NodeTree {

    int value;        // node value root
    NodeTree left;   //left pointer
    NodeTree right;  //right pointer

    public NodeTree(int value, NodeTree left, NodeTree right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }
}
