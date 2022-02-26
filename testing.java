import java.util.*;
import java.util.ArrayList;

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


    mainMenu(collection);
   }

  public static String getInput(){
      
      System.out.println("Please enter a command:");
      Scanner input = new Scanner(System.in);
      input.nextLine();
      String choice = input.nextLine();
      //input.close();

      return (choice);


  }

   
   public static void mainMenu(ArrayList<ArrayList<Integer>> collection){
    System.out.println("\n\nThe commands are:\n \nshow \nnew \nselect \ndelete \nsort \nreverse \nrandomize \nsave \nrestore \nquit.\n");

    String choice = getInput();
       switch(choice){
           case "show":
           show(collection);
           break;
           case "new":

           ArrayList<Integer> tempArray = menuNew(collection);

           collection.add(tempArray);
           System.out.println(collection);
           mainMenu(collection);
           break;
       }
       //myObj.close();
       


   }
   
   public static void show(ArrayList<ArrayList<Integer>> collection){
    collection.size();
    for (int i = 0; i < collection.size(); i++) {
        System.out.println((collection.get(i)));
    }
    
    mainMenu(collection);
   }
   
   public static ArrayList menuNew(ArrayList<ArrayList<Integer>> collection) {
    Scanner myObj = new Scanner(System.in);

    ArrayList<Integer> temp = new ArrayList<Integer>();

    myObj.nextLine();
    System.out.println("\n What is the length of the Array List");
    Integer arraySize = myObj.nextInt();
    for (int i = 0; i < arraySize; i++) {
        myObj.nextLine();
        System.out.println("\n What is elment #"+i);
        Integer quickTemp = myObj.nextInt();
        temp.add(quickTemp);

        
    }

    System.out.println(temp);


    myObj.close();
    return (temp);


   }
   
   
   
   
   public static void select() {
   }
   
   public static void delete() {
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
