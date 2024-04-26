/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package party;

public class Dinner {

    private int typeOfDish;
    private int numOfDishe;

    public Dinner(int typeOfDish, int numOfDishe) {
        this.typeOfDish = typeOfDish;
        this.numOfDishe = numOfDishe;
    }

    public void setTypeOfDish(int typeOfDish) {
        this.typeOfDish = typeOfDish;
    }

    public void setNumOfDishe(int numOfDishe) {
        this.numOfDishe = numOfDishe;
    }

    public int getTypeOfDish() {
        return typeOfDish;
    }

    public int getNumOfDishe() {
        return numOfDishe;
    }

    public String typeOfDish() {
        String s = null;
        if (typeOfDish == 1) {
            s = "appetizer";
        }
        if (typeOfDish == 2) {
            s = "burger";
        }
        if (typeOfDish == 3) {
            s = "pasta";
        }
        if (typeOfDish == 4) {
            s = "pizza";
        }
        if (typeOfDish == 5) {
            s = " salad";
        }
        if (typeOfDish == 6) {
            s = "meat Balls";
        }
        if (typeOfDish == 7) {
            s = "potato Balls";
        }
        if (typeOfDish == 8) {
            s = "rice";
        }
        if (typeOfDish == 9) {
            s = "steak";
        }
        if (typeOfDish == 10) {
            s = "fried Potatoes";
        }
        return s;
    }

    @Override
    public String toString() {
        return "\n" + numOfDishe + "  Dishes of " + typeOfDish();
    }

}
