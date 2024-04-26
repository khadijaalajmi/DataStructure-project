/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package party;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author linasmacbook
 */
public class OrderList {

    //this is an array list of order object 
    ArrayList<Order> orderList = new ArrayList<Order>();

    public void AddOrder(Order order) {
        orderList.add(order);
        System.out.println("\n\t\t\tYour order has been added successfully !!");
        System.out.println("\n_______________________________________________________________________________________");

    }

    //this method chiecks if the name is correct and then display all the order requarments  
    public void displayOrder(Name n) {
        for (int i = 0; i < orderList.size(); i++) {
            if (orderList.get(i).getClient().equals(n)) {
                System.out.println(orderList.get(i));
                System.out.println("\n_______________________________________________________________________________________");

            }
        }
    }

    //this method chiecks if the name is correct and then delete the order  
    public void DeletOrder(Name n) {
        for (int i = 0; i < orderList.size(); i++) {
            if (orderList.get(i).getClient().equals(n)) {
                orderList.remove(i);
                System.out.println("\n_______________________________________________________________________________________");
                System.out.println("\n\t\t\tYour Order Has Been Deleted ");
                System.out.println("\n_______________________________________________________________________________________");

            } else {
                System.out.println("\nThe Entered Name Is Not Available!!\n");
            }
        }
    }

    public void search() {
        Scanner scanner = new Scanner(System.in);

        // prompt the user to enter the order number
        System.out.print("Enter the order number: ");

        // read the input from the user
        int searchNumber = scanner.nextInt();

        // search for the order number in the array
        boolean found = false;

        for (int i = 0; i < orderList.size(); i++) {
            if (orderList.get(i).getOrderNumber() == searchNumber) {
                found = true;
                System.out.println("Order " + searchNumber + " found at index " + i);
                break;
            }
        }

        if (!found) {
            System.out.println("Order " + searchNumber + " not found");
        }
    }

    public void InsertionSort() {
        ArrayList<Order> a = this.orderList;
        Order temp;
        int i, j, k;
        for (i = 1; i < a.size(); i++) {
            temp = a.get(i);
            for (j = 0; j < i; j++) {

                if (a.get(j).getOrderNumber() > temp.getOrderNumber()) {
                    break;
                }
            }

            for (k = i; k > j; k--) {
                a.set(k, a.get(k - 1));
            }
            a.set(j, temp);
        }
    }

    public void printAllOrders() {
        for (int i = 0; i < orderList.size(); i++) {
            System.out.println("---------------------------------------------------------------------------------");
            System.out.println(orderList.get(i).getOrderNumber() + "\t\t" + orderList.get(i).getDiscription());
        }

    }

    @Override
    public String toString() {
        return orderList + "";
    }
}

