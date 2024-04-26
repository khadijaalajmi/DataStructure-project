/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package party;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

/**
 *
 * @author linasmacbook
 */
public class PartyPlannerSystemDS {

    public static void main(String[] args) throws FileNotFoundException {

        OrderList list = new OrderList();

        out:
        
        while (true) {
            Scanner in = new Scanner(System.in);
            System.out.print("\n1-Add a new order "
                    + "\n2-check if the order is inserted  "
                    + "\n3-Display an order "
                    + "\n4-delete an order "
                    + "\n5-Print all orders"
                    + "\n6-customer list"
                    + "\n7-exit");

            System.out.print("\nPlease put your choice here: ");
            int choese = in.nextInt();

            
            switch (choese) {
                
//case 1 **********************************************************************************************************************************
                case 1://Add a new order
                    
                    System.out.println("\n_______________________________________________________________________________________\n");
                    
                    System.out.println("\n--------------------------------------------- order number ---------------------------------------------\n");
                    
                    System.out.print("Please write here the order number : ");
                    int orderNumber = in.nextInt();
                    
                    System.out.println("\n--------------------------------------------- name ---------------------------------------------\n");
                   
                    DoublyLinkedList<String> StringDList2 = new DoublyLinkedList<>();

                    System.out.print("please enter your first name: ");
                    String FN = in.next();
                    StringDList2.addFirst(FN);
                    
                    System.out.print("please enter your mid name: ");
                    String MN = in.next();
                    StringDList2.addLast(MN);
                    
                    System.out.print("please enter your last name : ");
                    String LN = in.next();
                    StringDList2.addLast(LN);
                    
                    StringDList2.printListForward();

                    Name name = new Name(FN, MN, LN);

                    int ch2 = 0;
                    while (ch2 != 5) {
                        
                        System.out.println("\nif you want to update the name please choose what do you want to update : ");
                        System.out.println("1)First name\n"
                                + "2)mid name\n"
                                + "3)last name \n"
                                + "4)All name \n"
                                + "5)save and Exit\n");
                        System.out.print("Please put your choice here: ");
                        ch2 = in.nextInt();
                        
                        switch (ch2) {
                            case 1://First name

                                System.out.print("please enter your first name: ");
                                String FN1 = in.next();

                                long startTime5 = System.nanoTime();
                                
                                StringDList2.removeFirst();
                                StringDList2.addFirst(FN1);

                                long endTime5 = System.nanoTime();
                                
                                System.out.println("Time is :" + (endTime5 - startTime5) + " in nano second ");
                                
                                StringDList2.printListForward();
                                
                                break;

                            case 2://mid name

                                System.out.print("please enter your mid name: ");
                                String MN1 = in.next();

                                System.out.print("please enter your last name : ");
                                String LN1 = in.next();

                                long startTime6 = System.nanoTime();
                                
                                StringDList2.removeLast();
                                StringDList2.removeLast();
                                StringDList2.addLast(MN1);
                                StringDList2.addLast(LN1);
                                
                                long endTime6 = System.nanoTime();
                                
                                System.out.println("Time is :" + (endTime6 - startTime6) + " in nano second ");
                                
                                StringDList2.printListForward();

                                break;
                                
                            case 3://last name

                                System.out.print("please enter your last name : ");
                                String LN2 = in.next();

                                long startTime7 = System.nanoTime();
                                
                                StringDList2.removeLast();
                                StringDList2.addLast(LN2);

                                long endTime7 = System.nanoTime();
                                
                                System.out.println("Time is :" + (endTime7 - startTime7) + " in nano second ");
                                
                                StringDList2.printListForward();

                                break;
                                
                            case 4://All name

                                System.out.print("please enter your first name: ");
                                String FN3 = in.next();

                                System.out.print("please enter your mid name: ");
                                String MN3 = in.next();

                                System.out.print("please enter your last name : ");
                                String LN3 = in.next();

                                long startTime8 = System.nanoTime();

                                StringDList2.removeFirst();
                                StringDList2.addFirst(FN3);
                                StringDList2.removeLast();
                                StringDList2.removeLast();
                                StringDList2.addLast(MN3);
                                StringDList2.addLast(LN3);
                                
                                long endTime8 = System.nanoTime();
                                
                                System.out.println("Time is :" + (endTime8 - startTime8) + " in nano second ");
                                
                                StringDList2.printListForward();
                                
                                break;
                                
                            case 5://save and Exit

                                break;
                                
                        }
                        
                    }
                    
                    
                    
                    System.out.println("\n--------------------------------------------- phone number ---------------------------------------------\n");
                    
                    System.out.print("please enter your phone number : ");
                    Integer PhoneNumber = in.nextInt();

                    
                    
                    System.out.println("\n--------------------------------------------- Address ---------------------------------------------\n");
                    DoublyLinkedList<String> StringDList = new DoublyLinkedList<>();
                    
                    System.out.print("Please enter the name of country: ");
                    String contry = in.next();
                    StringDList.addFirst(contry);
                    
                    System.out.print("Please enter the name of city: ");
                    String city = in.next();
                    StringDList.addLast(city);
                    
                    System.out.print("Please enter the name of district: ");
                    String district = in.next();
                    StringDList.addLast(district);
                    
                    System.out.print("Please enter the name of street: ");
                    String street = in.next();
                    StringDList.addLast(street);

                    StringDList.printListForward();

                    Address address = new Address(contry, city, street, district);

                    int ch = 0;
                    while (ch != 5) {
                        
                        System.out.println("\nif you want to update the Address please choose what do you want to update : ");
                        System.out.println("1)country\n"
                                + "2)city\n"
                                + "3)district\n"
                                + "4)street\n"
                                + "5)save and Exit\n");
                        System.out.print("Please put your choice here: ");
                        ch = in.nextInt();
                        
                        switch (ch) {
                            
                            case 1://country

                                if (ch == 1) {

                                    System.out.print("\nPlease enter the name of country: ");
                                    String contry1 = in.next();

                                    long startTime1 = System.nanoTime();
                                    
                                    StringDList.removeFirst();
                                    StringDList.addFirst(contry1);
                                    
                                    long endTime1 = System.nanoTime();
                                    
                                    System.out.println("Time is :" + (endTime1 - startTime1) + " in nano second ");
                                    
                                    StringDList.printListForward();

                                }

                                break;

                            case 2://city

                                System.out.print("Please enter the name of city: ");
                                String city1 = in.next();

                                System.out.print("Please enter the name of district: ");
                                String district1 = in.next();

                                System.out.print("Please enter the name of street: ");
                                String street1 = in.next();

                                long startTime2 = System.nanoTime();
                                
                                StringDList.removeLast();
                                StringDList.removeLast();
                                StringDList.removeLast();
                                StringDList.addLast(city1);
                                StringDList.addLast(district1);
                                StringDList.addLast(street1);
                                
                                long endTime2 = System.nanoTime();
                                
                                System.out.println("Time is :" + (endTime2 - startTime2) + " in nano second ");
                                
                                StringDList.printListForward();

                                break;
                                
                            case 3://district

                                System.out.print("Please enter the name of district: ");
                                String district2 = in.next();

                                System.out.print("Please enter the name of street: ");
                                String street2 = in.next();

                                long startTime3 = System.nanoTime();
                                
                                StringDList.removeLast();
                                StringDList.removeLast();
                                StringDList.addLast(district2);
                                StringDList.addLast(street2);
                                
                                long endTime3 = System.nanoTime();
                                
                                System.out.println("Time is :" + (endTime3 - startTime3) + " in nano second ");
                                
                                StringDList.printListForward();

                                break;
                                
                            case 4://street

                                System.out.print("Please enter the name of street: ");
                                String street3 = in.next();

                                long startTime4 = System.nanoTime();
                                
                                StringDList.removeLast();
                                StringDList.addLast(street3);

                                long endTime4 = System.nanoTime();
                                
                                System.out.println("Time is :" + (endTime4 - startTime4) + " in nano second ");
                                
                                StringDList.printListForward();
                                
                                break;
                                
                            case 5://save and Exit

                                break;
                        }
                    }

                    Client client = new Client(name, PhoneNumber, address);
                    
                    
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
                    System.out.println("\n--------------------------------------------- date of the party ---------------------------------------------\n");
                    // TODO code application logic here
                    Date d = new Date();
                    //date of the party
                    // رقم افتراضي من مخي

                    
                    int total = 31;

                    int array[] = new int[total];
                    int temp[] = new int[total];

                    try {
                        // FileReader: انشىء اوبجكت من فايل
                        // BufferedReader:اوبجكت يقرا من الفايل
                        FileReader f = new FileReader("/Users/macbookpro/Desktop/date.txt");
                        BufferedReader b = new BufferedReader(f);
                        int r = 0;
                        // String line: حطيناه عشان يقرا سطر سطر
                        String line;
                        while ((line = b.readLine()) != null && r < total) {
                            array[r] = Integer.parseInt(line.trim());//trim: اشيل المسافات,, parseIntP: احوله لرقم
                            r++;
                        }

                        b.close();
                        f.close();
                        
                    } catch (Exception ex) {// رسالة الايرور
                        System.out.println("Unable to open file ");
                    }
                    
                    System.out.println("Available dates in january: ");
                    
                    for (int r = 0; r < total; r++) {
                                    System.out.print(array[r]+"  ");
                                }
                    
                    int ff = 0;
                    while (ff != 5) {

                        System.out.println("\n1)Date order using Merge sort algorithm.\n"
                                + "2)Date order using Insert sort algorithm.\n"
                                + "3)Print Date\n"
                                + "4)save ");
                        System.out.print("Please put your choice here: ");
                        ff = in.nextInt();
                        
                        switch (ff) {
                            
                            case 1://Date order using Merge sort algorithm
                                
                                long start1 = System.nanoTime();// دالة موجودة في الجافا لحساب الوقت

                                d.MergeSort(array, temp, 0, total - 1);
                                
                                long end1 = System.nanoTime();// دالة موجودة في الجافا لحساب الوقت
                                
                                System.out.println("Excecution Time is :" + (end1 - start1)+" nano seconds ");
                                //  ينقص الوقت الابتدائي من النهائي
                                break;
                                
                            case 2://Date order using Insert sort algorithm
                                
                                long start2 = System.nanoTime();

                                d.InsertionSort(array);
                                
                                long end3 = System.nanoTime();// دالة موجودة في الجافا لحساب الوقت
                                
                                System.out.println("Excecution Time is :" + (end3 - start2)+" nano seconds ");
                                
                                break;
                                
                            case 3://Print Date
                                
                                for (int r = 0; r < total; r++) {
                                    System.out.print(array[r]+"  ");
                                }
                                
                                break;
                                
                            case 4://save 
                                
                                try {
                                FileWriter f = new FileWriter("out.txt");
                                BufferedWriter b = new BufferedWriter(f);
                                for (int r = 0; r < array.length; r++) {
                                    b.write(Integer.toString(array[r]));
                                    b.newLine();
                                }
                                b.close();
                                } catch (Exception ex) {
                                System.out.println("Error writing to file ");
                                }
                                
                                ff = 5;
                                
                                break;
                        }
                        
                    }
                    
                    System.out.print("\nEnter the day of the party: ");
                    int day = in.nextInt();
                    
                    System.out.print("Enter the month of the party: ");
                    int month = in.nextInt();
                    
                    System.out.print("Enter the year of the party: ");
                    int year = in.nextInt();

                    Date dateOfParty = new Date(day, month, year);

                    System.out.println("\n--------------------------------------------- cake ---------------------------------------------\n");

                    NodeTree root = new NodeTree(5, null, null);

                    System.out.println("What tybe of cake you like 🎂?"
                            + "\n 1.vanilla cake with Nutella filling"
                            + "\n 2.vanilla cake with berries filling"
                            + "\n 3.chocolate cake with kinder filling"
                            + "\n 4.chocolate cake with caramel filling"
                            + "\n 5.strawberry cake with white chocolate filling"
                            + "\n 6.strawberry cake with berries filling");
                    
                    System.out.print("Please put your choice here: ");
                    int r = in.nextInt();

                    cake b = new cake(root, r);

                    for (int ik = 1; ik < 6; ik++) {
                        NodeTree newnode = new NodeTree(ik, null, null);
                        b.addNode(newnode, b.root);
                    }

                    while (r > 6 || r < 1) {   //if user enter wrong number
                        System.out.println("sorry you enter wrong number try again "
                                + "\n 1.vanilla cake with Nutella filling"
                                + "\n 2.vanilla cake with berries filling"
                                + "\n 3.chocolate cake with kinder filling"
                                + "\n 4.chocolate cake with caramel filling"
                                + "\n 5.strawberry cake with white chocolate filling"
                                + "\n 6.strawberry cake with berries filling");
                        
                        System.out.print("Please put your choice here: ");
                        r = in.nextInt();
                    }

                    long startTime1 = System.nanoTime();

                    if (r == 1) {
                        b.searchNode(1, b.root);

                    } else if (r == 2) {
                        b.searchNode(2, b.root);

                    } else if (r == 3) {
                        b.searchNode(3, b.root);

                    } else if (r == 4) {
                        b.searchNode(4, b.root);

                    } else if (r == 5) {
                        b.searchNode(5, b.root);

                    } else {
                        b.searchNode(6, b.root);

                    }

                    long endTime1 = System.nanoTime();

                    System.out.println("\ntree search time:" + (endTime1 - startTime1) + " nona seconds");
                    
                    

                    System.out.println("\n--------------------------------------------- drinks ---------------------------------------------\n");
                    
                    System.out.println("How many type of drink you want ? up to 4 ");
                    
                    System.out.print("Please write here: ");
                    int numOfTypeOfDrinks = in.nextInt();

                    Drinks[] drink = new Drinks [numOfTypeOfDrinks];
                    recurciveDrinks(numOfTypeOfDrinks , drink);
                    
                    for (int i = 0 ; i<drink.length ; i++){
                        System.out.println(drink[i]);
                    }

                    System.out.println("\n--------------------------------------------- dinner ---------------------------------------------\n");
                    
                    System.out.println("How many type of dishes you want ? up to 10 ");
                    
                    System.out.print("Please write here: ");
                    int numOfTypeOfDishes = in.nextInt();

                    Dinner[] dinner = new Dinner [numOfTypeOfDishes];
                    recurciveDinner(numOfTypeOfDishes , dinner);

                    System.out.println("\n--------------------------------------------- balloons ---------------------------------------------\n");
                    
                    System.out.println("how many color of balloon you want ? ");
                    
                    System.out.print("Please write here: ");
                    int numOfColorOfBalloon = in.nextInt();

                    Balloon[] balloon = new Balloon [numOfColorOfBalloon];
                    recurciveBalloons(numOfColorOfBalloon , balloon);
                    

                    Party party = new Party(dinner, b, drink, balloon, dateOfParty);
                    
                    
                    Order order = new Order(orderNumber, party, client);

                    
                    list.AddOrder(order);

                    
                    break;
                    
                    
//case 2 **********************************************************************************************************************************
                case 2://check if the order is insertet
                    
                    System.out.println("\n_______________________________________________________________________________________\n");
                    long start2 = System.nanoTime();
                    list.search();
                    long end2 = System.nanoTime();// دالة موجودة في الجافا لحساب الوقت
                    
                    System.out.println("array list search time = " + (end2 - start2) + " in nano seconds");
                    break;
                    
                    
//case 3 **********************************************************************************************************************************
                case 3: //Display an order

                    System.out.println("\n_______________________________________________________________________________________\n");
                    
                    System.out.print("Please enter your first name: ");
                    String FN1 = in.next();
                    
                    System.out.print("Please enter your mid name: ");
                    String MN1 = in.next();
                    
                    System.out.print("Please enter your last name: ");
                    String LN1 = in.next();
                    
                    Name name1 = new Name(FN1, MN1, LN1);
                    
                    //calling display order method
                    list.displayOrder(name1);

                    break;
                    
                    
//case 4 **********************************************************************************************************************************
                case 4://delete an order

                    System.out.println("\n_______________________________________________________________________________________\n");
                    
                    System.out.print("Please enter your first name: ");
                    String FN2 = in.next();
                    
                    System.out.print("Please enter your mid name: ");
                    String MN2 = in.next();
                    
                    System.out.print("Please enter your last name: ");
                    String LN2 = in.next();
                    
                    Name name2 = new Name(FN2, MN2, LN2);

                    //calling the delet an order method
                    list.DeletOrder(name2);

                    break;
                    
                    
//case 5 **********************************************************************************************************************************
                case 5: //Print all orders
                    
                    System.out.println("\n_______________________________________________________________________________________\n");
                    
                    int cont = 100;
                    
                    File file = new File("/Users/macbookpro/Desktop/orderNum.txt");
                    
                    System.out.println("dose file canRead? " + file.canRead());
                    
                    int n = 0; // a valible saves a number Temporarily
                    int[] A = new int[cont];

                    Scanner s21 = new Scanner(file);
                    while (s21.hasNextInt()) {
                        for (int iw = 0; iw < cont; iw++) {
                            n = s21.nextInt();
                            A[iw] = n;
                        }
                    }
                    
                    Scanner s2 = new Scanner(file);
                    
                    File file2 = new File("/Users/macbookpro/Desktop/description.txt");
                    
                    Scanner sc2 = new Scanner(file2);
                    
                    String[] dis = new String[cont];
                    
                    String s = ""; // a valible saves a description Temporarily
                    
                    while (sc2.hasNextLine()) {
                        for (int l = 0; l < cont; l++) {
                            n = Integer.parseInt(s2.next());
                            A[l] = n;
                            s = sc2.nextLine();
                            dis[l] = s;
                            list.orderList.add(new Order(A[l], dis[l]));
                        }
                    }
                    
                    long start = System.nanoTime();// دالة موجودة في الجافا لحساب الوقت
                    
                    list.InsertionSort();
                    
                    long end = System.nanoTime();// دالة موجودة في الجافا لحساب الوقت
                    
                    System.out.println("ArrayList sort time = " + (end - start) + " nano seconds");

                    System.out.println("the order number	the description");

                    
                    list.printAllOrders();
                    
                    break;
                    
                    
//case 6 **********************************************************************************************************************************
                case 6://customer list
                    
                    System.out.println("\n_______________________________________________________________________________________\n");
                    long start4 = System.nanoTime();
                    Client clientList = new Client();
                    
                    clientList.printClientList();
                    
                    System.out.print("Enter a client number to search : ");
                    Integer num1 = in.nextInt();
                    
                    String clientName = clientList.numberSearch(num1);
                    long end4 = System.nanoTime();// دالة موجودة في الجافا لحساب الوقت
                    
                    System.out.println("hash search time = " + (end4 - start4) + " in nano seconds");
                    
                    if (clientName == null) {
                        System.out.println("the number is not found..");
                    }
                    
                    System.out.println(clientName);

                    break;
                    
                    
//case 7 **********************************************************************************************************************************
                case 7://exit

                    System.out.println("\n_______________________________________________________________________________________");
                    
                    System.out.println("\n\t\t\tThank you for choosing us!!");
                    
                    System.out.println("\n_______________________________________________________________________________________");

                    break out;
                    
                    
            }// end the main switch
            
            
        }//end the for loop 
        
        
    } // end the main methd 
    
    
    
    
    
    
    
    
    
    
    

        public static void recurciveDrinks(int numOfDrinks, Drinks[] arrOfDrinks) {
        Scanner in = new Scanner(System.in);

        if (numOfDrinks == 0) {
            
            return;
        }

        System.out.print("\n1-tea "
                + "\n2-coffee"
                + "\n3-juice "
                + "\n4-soft drinks\n");

        System.out.print("\nPlease enter the type of drink: ");
        int typeOfDrink = in.nextInt();
        System.out.print("How many cups of this type of drink do you want: ");
        int numOfCups = in.nextInt();

        arrOfDrinks[numOfDrinks - 1] = new Drinks(typeOfDrink, numOfCups);

        recurciveDrinks(numOfDrinks - 1, arrOfDrinks);
    }
 
    
    
    
    public static void recurciveDinner(int numOfTaypsOfDishes, Dinner[] arrOfDinner) {
        Scanner in = new Scanner(System.in);

        if (numOfTaypsOfDishes == 0) {
            
            return;
            
        } else {

            System.out.println("\n1-appetizer "
                    + "\n2-burger"
                    + "\n3-pasta"
                    + "\n4-pizza"
                    + "\n5-salad"
                    + "\n6-meat Balls"
                    + "\n7-potato Balls"
                    + "\n8-rice"
                    + "\n9-steak"
                    + "\n10-fried Potatoes");

            System.out.print("\nEnter the type of dish you want: ");
            int typeOfDish = in.nextInt();
            System.out.print("How many blate of this type you want: ");
            int numOfBlate = in.nextInt();

            arrOfDinner[numOfTaypsOfDishes - 1] = new Dinner(typeOfDish, numOfBlate);

            recurciveDinner(numOfTaypsOfDishes - 1, arrOfDinner);

        }

    }

    
    
    
        public static void recurciveBalloons(int numOfColors, Balloon[] arrOfBalloons) {
        Scanner in = new Scanner(System.in);

        if (numOfColors == 0) {
            
            return;
            
        } else {
            
            System.out.println("\nchoose number to fill the ballon  \n");
            System.out.println("1- ballons full of helium"
                    + "\n2- ballons with out helium");
            System.out.print("\nPlease put your choice here:  ");
            int helium = in.nextInt();

            System.out.print("\nPlease Enter the color of balloon: ");
            String colorOfBalloon = in.next();

            System.out.print("How many " + colorOfBalloon + " ballons you want?");
            System.out.print("\nPlease write here: ");
            int numOfballoons = in.nextInt();

            arrOfBalloons[numOfColors - 1] = new Balloon(numOfballoons, colorOfBalloon, helium);

            recurciveBalloons(numOfColors - 1, arrOfBalloons);

        }

    }

    
    
    
    

}//end the class

