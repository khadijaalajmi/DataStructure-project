/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package party;

public class Balloon {

    private String Color;
    private int numOfBalloon;
    private int HeliumOrNot;

    public Balloon(int numOfBallon, String Color, int HeliumOrNot) {
        this.numOfBalloon = numOfBallon;
        this.Color = Color;
        this.HeliumOrNot = HeliumOrNot;
    }

    public void setNumOfBalloon(int numOfBallon) {
        this.numOfBalloon = numOfBallon;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public void setHeliumOrNot(int HeliumOrNot) {
        this.HeliumOrNot = HeliumOrNot;
    }

    public int getHeliumOrNot() {
        return HeliumOrNot;
    }

    public int getNumOfBalloon() {
        return numOfBalloon;
    }

    public String getColor() {
        return Color;
    }

    public String HeliumOrNot() {
        String s = "";
        if (HeliumOrNot == 1) {
            s = "with helium";
        }
        if (HeliumOrNot == 2) {
            s = "with out helium";
        }
        return s;
    }

    @Override
    public String toString() {
        return "\n" + numOfBalloon + " " + Color + " balloons " + HeliumOrNot();
    }

}
