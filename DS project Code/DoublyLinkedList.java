/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package party;

import java.util.NoSuchElementException;

public class DoublyLinkedList<E> {

    //---------------- nested Node class ----------------
    /**
     * Node of a doubly linked list, which stores a reference to its element and
     * to both the previous and next node in the list.
     */
    private static class Node<E> {

        /**
         * The element stored at this node
         */
        private E element;               // reference to the element stored at this node

        /**
         * A reference to the preceding node in the list
         */
        private Node<E> prev;            // reference to the previous node in the list

        /**
         * A reference to the subsequent node in the list
         */
        private Node<E> next;            // reference to the subsequent node in the list

        /**
         * Creates a node with the given element and next node.
         *
         * @param e the element to be stored
         * @param p reference to a node that should precede the new node
         * @param n reference to a node that should follow the new node
         */
        public Node(E e, Node<E> p, Node<E> n) {
            element = e;
            prev = p;
            next = n;
        }

        // public accessor methods
        /**
         * Returns the element stored at the node.
         *
         * @return the element stored at the node
         */
        public E getElement() {
            return element;
        }

        /**
         * Returns the node that precedes this one (or null if no such node).
         *
         * @return the preceding node
         */
        public Node<E> getPrev() {
            return prev;
        }

        /**
         * Returns the node that follows this one (or null if no such node).
         *
         * @return the following node
         */
        public Node<E> getNext() {
            return next;
        }

        // Update methods
        /**
         * Sets the node's previous reference to point to Node n.
         *
         * @param p the node that should precede this one
         */
        public void setPrev(Node<E> p) {
            prev = p;
        }

        /**
         * Sets the node's next reference to point to Node n.
         *
         * @param n the node that should follow this one
         */
        public void setNext(Node<E> n) {
            next = n;
        }
    } //----------- end of nested Node class -----------

    // instance variables of the DoublyLinkedList
    /**
     * Sentinel node at the beginning of the list
     */
    private Node<E> header;                    // header sentinel

    /**
     * Sentinel node at the end of the list
     */
    private Node<E> trailer;                   // trailer sentinel

    /**
     * Number of elements in the list (not including sentinels)
     */
    private int size = 0;                      // number of elements in the list

    /**
     * Constructs a new empty list.
     */
    public DoublyLinkedList() {

        header = new Node(null, null, null);
        trailer = new Node(null, null, null);
        header.next = trailer;
        trailer.prev = header;

    }

    // public accessor methods
    /**
     * Returns the number of elements in the linked list.
     *
     * @return number of elements in the linked list
     */
    public int size() {
        return size;
    }

    /**
     * Tests whether the linked list is empty.
     *
     * @return true if the linked list is empty, false otherwise
     */
    public boolean isEmpty() {
        return size == 0;
    }

    // public update methods
    /**
     * Adds an element to the front of the list.
     *
     * @param e the new element to add
     */
    public void addFirst(E e) {
        header = new Node<E>(e, null, header);
        header.next.prev = header;

        if (isEmpty()) {
            trailer = header;
        }
        size++;
    }

    /**
     * Adds an element to the end of the list.
     *
     * @param e the new element to add
     */
    public void addLast(E e) {
        if (isEmpty()) {
            addFirst(e);
        } else {
            trailer = new Node<E>(e, trailer, null);
            trailer.prev.next = trailer;
            size++;
        }

    }

    /**
     * Removes and returns the last element of the list.
     *
     * @return the removed element (or null if empty)
     */
    public E removeLast() {
        E last = trailer.getElement();
        trailer.prev.next = null;
        trailer = trailer.prev;
        size--;
        return last;

    }

    public E removeFirst() {
        if (size == 0) {
            throw new NoSuchElementException();
        }
        Node tmp = header;
        header = header.next;
        header.prev = null;
        size--;
        return (E) tmp.element;
    }

    //print the lists in forward order
    public void printListForward() {
        Node currentNode = header;
        while (currentNode != null) {
            System.out.print(currentNode.getElement() + "-> ");
            currentNode = currentNode.next;
        }
        System.out.println();
    }

    // print the lists in reverse order
    public void printListReverse() {

        Node currentNode = trailer;
        while (currentNode != null) {
            System.out.print(currentNode.getElement() + "<-");
            currentNode = currentNode.prev;

        }
        System.out.println();
    }

} //----------- end of DoublyLinkedList class -----------

