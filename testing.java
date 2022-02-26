import java.util.*;
import java.util.ArrayList;
import java.util.Scanner;  // Import the Scanner class
 
public class testing{

   public static void main(String[] args) {
    int n = 3;
    String name;

    ArrayList<String> collectionName = new ArrayList<String>();

    ArrayList<ArrayList<Integer>> collection = new ArrayList<ArrayList<Integer>>(n);

    ArrayList<Integer> a1 = new ArrayList<Integer>();
    name = "First Array";
    a1.add(412);
    a1.add(5);
    a1.add(-6);
    collection.add(a1);
    collectionName.add(name);
      
    ArrayList<Integer> a2 = new ArrayList<Integer>();
    name = "2nd array";
    a2.add(20);
    a2.add(-34);
    a2.add(-123);
    collection.add(a2);
    collectionName.add(name);

    ArrayList<Integer> a3 = new ArrayList<Integer>();
    name = "3rd array";
    a3.add(2000);
    a3.add(-1499);
    a3.add(-109223);
    collection.add(a3);
    collectionName.add(name);

    Scanner myObj = new Scanner(System.in);
    Integer selected = 1;

    mainMenu(collection,selected);
   }



   
   public static void mainMenu(ArrayList<ArrayList<Integer>> collection,Integer selected){
    System.out.println("\n\nThe commands are:\n \nshow \nnew \nselect \ndelete \nsort \nreverse \nrandomize \nsave \nrestore \nquit.\n");

    System.out.println("Please enter a command:");
    Scanner input = new Scanner(System.in);
    String choice = input.nextLine();
    input.close();
       switch(choice){
           case "show":
           show(collection,selected);
           break;

           case "new":
           menuNew(collection);
           System.out.println(collection);
           break;
       }
       //myObj.close();
       


   }
   
   public static void show(ArrayList<ArrayList<Integer>> collection,Integer selected){

    collection.size();
    String[] alphabet = {"A. ","B. ","C. ","D. ","E. ","F. ","G. ","H. ","I. ","J. " ,"K. ","L. ","M. ","N. ","O. ","P. ","Q. ","S. ","T. ","U. ","V. ","W. ","X. ","Y. ","Z. "};
    for (int i = 0; i < collection.size(); i++) {
        if (i-1 == selected){
        System.out.println("*"+alphabet[i]+(collection.get(i)));
        }
    }
    mainMenu(collection,selected);
   }
   
   public static void menuNew(ArrayList<ArrayList<Integer>> collection) {
    Scanner myObj = new Scanner(System.in);



    ArrayList<Integer> temp = new ArrayList<Integer>();

    System.out.println("\n What is the length of the Array List");
    Integer arraySize = myObj.nextInt();

    for (int i = 0; i < arraySize; i++) {
        System.out.println("\n What is elment #"+i);
        Integer quickTemp = myObj.nextInt();
        temp.add(quickTemp);

        
    }
    myObj.close();

    System.out.println(temp);
    collection.add(temp);
    //mainMenu(collection);

   }
      
   public static void select(ArrayList<ArrayList<Integer>> collection,Integer selected) {
        Scanner myObj = new Scanner(System.in);
       show(collection, selected);
       System.out.println("Which ArrayList would you like to make yours? (A-Z)");
       String selection = myObj.nextLine();

 

       show(collection,selected);



   }
   
   public static void delete(ArrayList<ArrayList<Integer>> collection,Integer selected) {
        Scanner myObj = new Scanner(System.in);


       show(collection,selected);
       System.out.println("Which would you like to delete> (A-Z)");
       String choice = myObj.nextLine();
        selected = alphaToInt(choice);

   }
   
   public static int alphaToInt(String selection){
    int selected = 0;
    switch(selection){
        case "A": selected = 1;
        case "B": selected = 2;
        case "C": selected = 3; 
        case "D": selected = 4;
        case "E": selected = 5;
        case "F": selected = 6;
        case "G": selected = 7;
        case "H": selected = 8;
        case "I": selected = 9;
        case "J": selected = 10; 
        case "K": selected = 11;
        case "L": selected = 12;
        case "M": selected = 13;
        case "N": selected = 14;
        case "O": selected = 15;
        case "P": selected = 16;
        case "Q": selected = 17; 
        case "R": selected = 18;
        case "S": selected = 19;
        case "T": selected = 20;
        case "U": selected = 21;
        case "V": selected = 22;
        case "W": selected = 23;
        case "X": selected = 24; 
        case "Y": selected = 25;
        case "Z": selected = 26;
   }
   return selected ;
   }

   public static void sort() {
   }
   
   public static void reverse() {
   }
   
   public static void randomize() {
   }

   public static void save() {
   }
   
   public static void restore() {
   }
   
   public static void quit() {
   }


   

}
