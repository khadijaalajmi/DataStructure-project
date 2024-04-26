/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package party;

import java.util.HashMap;
import java.util.Map;

public class Client {

    private static HashMap<Integer, String> clientList = new HashMap<Integer, String>();
    private String Name;
    private Name nameOfClient;
    private Integer numberOfClient;
    private Address addressOfClient;

    public Client() {
        String[] names = {"Sara", "shahad", "Noor", "Hala", "Fahad", "Salem", "Ahmad", "Malak", "Yasmeen", "Lena", "Reham", "Rehab", "Khadejah", "Salma", "Futon",
            "Emma", "Olivia", "Ava", "Isabella", "Sophia", "Mia", "Charlotte", "Amelia", "Harper", "Evelyn", "Nadeen", "Esam",
            "Abigail", "Emily", "Elizabeth", "Mila", "Ella", "Avery", "Sofia", "Camila", "Aria", "Scarlett", "Ammar", "Farah",
            "Victoria", "Madison", "Luna", "Grace", "Chloe", "Penelope", "Layla", "Riley", "Zoey", "Nora", "Nisrin", "Budour"};
        for (int i = 0; i < names.length; i++) {
            clientList.put(050352332 + i, names[i]);
        }
    }

    public Client(Integer numberOfClient, String Name) {
        this.numberOfClient = numberOfClient;
        this.Name = Name;
    }

    public Client(Name nameOfClient, Integer numberOfClient, Address addressOfClient) {
        this.nameOfClient = nameOfClient;
        this.numberOfClient = numberOfClient;
        this.addressOfClient = addressOfClient;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getName() {
        return Name;
    }

    public Name getNameOfClient() {
        return nameOfClient;
    }

    public void setNameOfClient(Name nameOfClient) {
        this.nameOfClient = nameOfClient;
    }

    public int getNumberOfClient() {
        return numberOfClient;
    }

    public void setNumberOfClient(Integer numberOfClient) {
        this.numberOfClient = numberOfClient;
    }

    public Address getAddressOfClient() {
        return addressOfClient;
    }

    public void setAddressOfClient(Address addressOfClient) {
        this.addressOfClient = addressOfClient;
    }

    public void addClient() {
        clientList.put(numberOfClient, Name);
    }

    public String numberSearch(Integer number) {
        return "the first name of the client who has this phone number is : " + clientList.get(number);
    }

    public void printClientList() {
        System.out.println("\t\tThe client List");
        System.out.println("Phone Number\t Name");
        for (Map.Entry< Integer, String> entry : clientList.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    @Override
    public String toString() {
        return "---Clinet information: "
                + "\n" + "Name: " + nameOfClient
                + "\n" + "Phone Number: " + numberOfClient
                + "\n" + "Address: " + addressOfClient;
    }

    public boolean equals(Name n) {
        return this.getNameOfClient().equals(n);
    }
}

