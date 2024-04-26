/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package party;

public class Drinks {

    private int typeofdrinks;
    private int numofCubs;

    public Drinks(int typeofdrinks, int numofCubs) {
        this.typeofdrinks = typeofdrinks;
        this.numofCubs = numofCubs;
    }

    public void setTypeofdrinks(int typeofdrinks) {
        this.typeofdrinks = typeofdrinks;
    }

    public void setNumofCubs(int numofCubs) {
        this.numofCubs = numofCubs;
    }

    public int getTypeofdrinks() {
        return typeofdrinks;
    }

    public int getNumofCubs() {
        return numofCubs;
    }

    public String typeofdrinks() {
        String s = "";
        if (typeofdrinks == 1) {
            s = "tea";
        }
        if (typeofdrinks == 2) {
            s = "coffee";
        }
        if (typeofdrinks == 3) {
            s = "juice";
        }
        if (typeofdrinks == 4) {
            s = "soft drinks";
        }
        return s;
    }

    @Override
    public String toString() {
        return "\n" + numofCubs + " cubs of " + typeofdrinks();
    }

}
