/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package party;

public class Order {

    private int OrderNumber;
    private Party party;
    private Client client;
    private String discription;

    public Order(int OrderNumber, Party party, Client client) {
        this.OrderNumber = OrderNumber;
        this.party = party;
        this.client = client;
    }

    public Order(int OrderNumber, String discription) {
        this.OrderNumber = OrderNumber;
        this.discription = discription;

    }

    public String getDiscription() {
        return discription;
    }

    public void setDiscription(String discription) {
        this.discription = discription;
    }

    public int getOrderNumber() {
        return OrderNumber;
    }

    public void setOrderNumber(int OrderNumber) {
        this.OrderNumber = OrderNumber;
    }

    public Party getParty() {
        return party;
    }

    public void setParty(Party party) {
        this.party = party;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public String toString() {
        if (discription == null) {
            return "----------------------------- your Order -------------------------"
                    + "\n---the order number is :" + OrderNumber
                    + "\n" + client
                    + "\n-----------------------------* The Partys *--------------------------- "
                    + party
                    + "\n--------------------------------------------------------------";
        } else {

            return OrderNumber + "\t\t" + discription
                    + "\n";
        }
    }
}
