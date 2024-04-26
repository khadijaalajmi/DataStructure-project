/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package party;

public class Party {

    private Dinner[] dinner;
    private cake cake;
    private Drinks[] drink;
    private Balloon[] ballon;
    private Date date;

    public Party(Dinner[] dinner, cake cake, Drinks[] drink, Balloon[] ballon, Date date) {
        this.dinner = dinner;
        this.cake = cake;
        this.drink = drink;
        this.ballon = ballon;
        this.date = date;

    }

    public Dinner[] getDinner() {
        return dinner;
    }

    public void setDinner(Dinner[] dinner) {
        this.dinner = dinner;
    }

    public cake getCake() {
        return cake;
    }

    public void setCake(cake cake) {
        this.cake = cake;
    }

    public Drinks[] getDrink() {
        return drink;
    }

    public void setDrink(Drinks[] drink) {
        this.drink = drink;
    }

    public Balloon[] getBallon() {
        return ballon;
    }

    public void setBallon(Balloon[] ballon) {
        this.ballon = ballon;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    //this method to display all the elements in the dinner array
    public String dinnerDisplaying() {
        String s = "";
        for (int i = 0; i < dinner.length; i++) {
            s += dinner[i].toString();
        }
        return s;
    }

    //this method to display all the elements in the drinks array
    public String drinksDisplaying() {
        String s = "";
        for (int i = 0; i < drink.length; i++) {
            s += drink[i].toString();
        }
        return s;
    }

    //this method to display all the elements in the balloon array
    public String balloonDisplaying() {
        String s = "";
        for (int i = 0; i < ballon.length; i++) {
            s += ballon[i].toString();
        }
        return s;
    }

    @Override
    public String toString() {
        return "\n" + "The date of the party: " + date
                + "\n" + "------------The cake-----------" + cake
                + "\n" + "------------The dinner---------" + dinnerDisplaying()
                + "\n" + "------------The drinks---------" + drinksDisplaying()
                + "\n" + "------------The ballons--------" + balloonDisplaying();
    }
}
