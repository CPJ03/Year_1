import java.util.Scanner;

class Bag {
  // Attributes
  private int[] arrBag;
  private int currentItemLoc;

  // Method
  /*
   * Postcondition: The Bag has been initialized
   * and it is now empty.
   */
  public Bag(int size) {
    currentItemLoc = 0;
    arrBag = new int[size];
  }

  /*
   * Precondition: The bag is not full
   * Postcondition: The item (represent in integer) is being
   * added to the array (bag)
   */
  public void add(int entry) {
    if (currentItemLoc < arrBag.length) {
      arrBag[currentItemLoc] = entry;
      currentItemLoc++;
    } else {
      System.out.println("The bag is full");
    }
  }

  /*
   * Precondition: The element must exist inside the bag.
   * Postcondition: If target was in the Bag, then
   * one copy of target has been removed from the
   * Bag, and the return value is true; otherwise the
   * Bag is unchanged and the return value is false.
   */
  public boolean remove(int entry) {
    if (countOccur(entry) > 0) {
      for (int i = 0; i < arrBag.length; i++) {
        if (entry == arrBag[i]) {
          for (int j = i; j < currentItemLoc; j++) {
            arrBag[j] = arrBag[j + 1];
          }
        }
      }
      return true;
    } else {
        System.out.println("The item is not in the bag. ");
      return false;
    }
  }

  /*
   * Precondition: Do not count the empty space.
   * Postcondition: The return value is the number
   * of integers in the Bag.
   */
  public int calcSize() {
    int counter = 0;
    for (int i = 0; i < currentItemLoc; i++) {
      if (arrBag[i] != 0) {
        counter++;
      }
    }
    return counter;
  }

  /*
   * Postcondition: The return value is the number
   * of copies of target in the Bag.
   */
  public int countOccur(int entry) {
    int counter = 0;
    for (int i = 0; i < arrBag.length; i++) {
      if (entry == arrBag[i]) {
        counter++;
      }
    }
    return counter;
  }

  public void printAllItems() {
    for (int i = 0; i < currentItemLoc; i++) {
      if (arrBag[i] != 0) {
        System.out.print(arrBag[i] + " ");
      }
    }
  }

  /* Precondition: Item position shold be known
   * Postcondition: return the position of the item;
   */
  public int positionOf(int entry) {
    int position = 0;
    for (int i = 0; i < currentItemLoc; i++) {
      if (arrBag[i] == entry) {
        position = i + 1;
        break;
      }
    }
    return position;
  }

  /* Use a 'temp' variable to store the original array.
   * and then swap the element with the last element of the
   * original element. 
   */
  public void reverse(){
    for (int i = 0; i < currentItemLoc/2; i++){
      int temp;
      temp = arrBag[i];
      arrBag[i] = arrBag[currentItemLoc-i-1];
      arrBag[currentItemLoc-i-1] = temp;
    }
  }
  /* PreCondition: THe bag is not full
   * PostCondition: The item has been added to the front. 
   */
  public void addToFront(int entry){
      if (currentItemLoc < arrBag.length){
          for (int i = 0; i < currentItemLoc; i++){
              int temp = 0;
              temp = arrBag[currentItemLoc - i -1];
              arrBag[currentItemLoc - i] = temp;
          }
          arrBag[0] = entry;
          currentItemLoc++;
      }
      else {
          System.out.println("The bag is full. Do not be greedy. Remove some items first.");
      }
  }
  
  /* Precondition: The bag is not full
   * Postcondition: The item (represent in integer) is being
   * added to the end of array (bag)
   */
  public void addToEnd(int entry){
      add(entry);
  }
  
  /* PreCondition: The bag is not full
   * PostCondition: The item is added after the value
   */
  public void addAfterValue(int entry, int value){
      if (currentItemLoc < arrBag.length){     
          if (countOccur(value)==0){
              System.out.println("Value not found.");
              return;
          }
          for (int i = 0; i < positionOf(value); i++){
              int temp = 0;
              temp = arrBag[currentItemLoc - i -1];
              arrBag[currentItemLoc - i] = temp;
          }
          arrBag[positionOf(value)] = entry;
          currentItemLoc++;
      }else{
        System.out.println("The bag is full. Do not be greedy. Remove some items first.");
      }
  }
  
  /* PreCondition: The bag is not full
   * PostCondition: The item is being added to specific location
   */
  public void addToSpecLoc(int entry, int loc){
      if (currentItemLoc < arrBag.length){
          if(loc < 0 || loc >= currentItemLoc){
              System.out.println("Location is out of bound.");
              return;
          }
          for (int i = 0; i < arrBag[loc]; i++){
              int temp = 0;
              temp = arrBag[currentItemLoc - i -1];
              arrBag[currentItemLoc - i] = temp;
          }
          arrBag[loc-1] = entry;
          currentItemLoc++;
      }else{
        System.out.println("The bag is full. Do not be greedy. Remove some items first.");
      }
  }
  
  /* Precondition: The element must exist inside the bag.
   * Postcondition: The first item is removed. 
   */
  public void removeFront(){
     remove(arrBag[0]); 
  }
  
  /* PreCondition: The element must exist inside the bag.
   * PostCOndition: The last item is removed. 
   */
  public void removeEnd(){
      remove(arrBag[currentItemLoc-1]);
  }
  /* PreCondition: The element must exist inside the bag.
   * PostCOndition: The value is removed. 
   */
  public void removeValue(int entry){
     remove(entry);
  }
 
  /* PreCondition: The element must exist inside the bag.
   * PostCOndition: The last item is removed at the location.
   */
  public void removeAtLoc(int loc){
      if (loc < 0 || loc >= currentItemLoc){
          System.out.println("Location is out of bound.");
          return;
      }
      remove(arrBag[loc]);
  }
}

public class Array {

  public static void main(String[] args) {
    Bag bag = new Bag(10);

    // Use while loop to keep on asking user until user ends.
    while (true) {
      System.out.println("__________BAG_________");
      System.out.println("[1] Add items");
      System.out.println("[2] Remove items");
      System.out.println("[3] Size of bag");
      System.out.println("[4] Find the occurance of items");
      System.out.println("[5] Find the position of item");
      System.out.println("[6] Reverse the items in the bag");
      System.out.println("[7] Add item to the front of the bag");
      System.out.println("[8] Add item to the end of the bag");
      System.out.println("[9] Add item after specific value");
      System.out.println("[10] Add item to specific location");
      System.out.println("[11] Remove the front item"); // Remove front
      System.out.println("[12] Remove the last itemn"); // Remove end
      System.out.println("[13] Remove a specific item"); // Remove value
      System.out.println("[14] Remove a specific item based on location"); // Remove at loc
      System.out.println("[15] List all items in the bag");
      System.out.println("[16] Quit program");

      // Use scanner to get user input
      Scanner obj = new Scanner(System.in);
      System.out.println("Enter your option: ");
      String in = obj.nextLine(); 
      int inInt = Integer.parseInt(in);

      // Use switch case to alter the option and do the following:
      switch (inInt) {
        case 1: // Add item
          System.out.println("What item you want to add: ");
          Scanner obj1 = new Scanner(System.in);
          System.out.println("Enter your item: ");
          String in1 = obj1.nextLine();
          int inInt1 = Integer.parseInt(in1);
          bag.add(inInt1);
          System.out.println(" ");
          continue;
        case 2: // Remove item
          System.out.println("What item you want to remove: ");
          Scanner obj2 = new Scanner(System.in);
          System.out.println("Enter your item: ");
          String in2 = obj2.nextLine();
          int inInt2 = Integer.parseInt(in2);
          bag.remove(inInt2);
          System.out.println(" ");
          continue;
        case 3: // Calculate size of bag
          bag.calcSize();
          System.out.println("The size of the bag now is: " + bag.calcSize());
          System.out.println(" ");
          continue;
        case 4: // Find occur
          System.out.println("What item you want to count: ");
          Scanner obj4 = new Scanner(System.in);
          System.out.println("Enter your item: ");
          String in4 = obj4.nextLine();
          int inInt4 = Integer.parseInt(in4);
          System.out.println("The occurance of the item is " + bag.countOccur(inInt4));
          System.out.println(" ");
          continue;
        case 5: // Find position
          System.out.println("What item you want to find: ");
          Scanner obj5 = new Scanner(System.in);
          System.out.println("Enter your item: ");
          String in5 = obj5.nextLine();
          int inInt5 = Integer.parseInt(in5);
          System.out.println("The position of the item is " + bag.positionOf(inInt5));
          System.out.println(" ");
          continue;
        case 6: // Reverse the bag
          bag.reverse();
          System.out.println("The items in the bag have been reversed.");
          System.out.println(" ");
          continue;
        case 7: // Add item to the front
          Scanner obj6 = new Scanner(System.in);
          System.out.println("Enter your item: ");
          String in6 = obj6.nextLine();
          int inInt6 = Integer.parseInt(in6);
          bag.addToFront(inInt6);
          System.out.println("Item is being added to the front of the bag.");
          System.out.println(" ");
          continue;
        case 8: // Add item to the end
          Scanner obj8 = new Scanner(System.in);
          System.out.println("Enter your item: ");
          String in8 = obj8.nextLine();
          int inInt8 = Integer.parseInt(in8);
          bag.addToEnd(inInt8);
          continue;
        case 9: // Add after value
          System.out.println("Which value you want to add after: ");
          Scanner obj9 = new Scanner(System.in);
          String value = obj9.nextLine();
          int intValue = Integer.parseInt(value);
          System.out.println("Enter your item you want to add: ");
          String in9 = obj9.nextLine();
          int inInt9 = Integer.parseInt(in9);
          bag.addAfterValue(inInt9, intValue);
          System.out.println(" ");
          continue;
        case 10: // Add at specific location
          System.out.println("Which location you want to add: ");
          Scanner obj10 = new Scanner(System.in);
          String loc = obj10.nextLine();
          int intLoc = Integer.parseInt(loc);
          System.out.println("Enter your item you want to add: ");
          String in10 = obj10.nextLine();
          int inInt10 = Integer.parseInt(in10);
          bag.addToSpecLoc(inInt10, intLoc);
          System.out.println(" ");
          continue;
        case 11: // Remove front
          bag.removeFront();
          System.out.println(" ");
          continue;
        case 12: // Remove end
           bag.removeEnd();
           System.out.println(" ");
           continue;
        case 13: // Remove value
           Scanner obj13 = new Scanner(System.in);
           System.out.println("Enter your item you want to remove: ");
           String in13 = obj13.nextLine();
           int inInt13 = Integer.parseInt(in13);
           bag.removeValue(inInt13);
           System.out.println(" ");
           continue;
        case 14: // Remove at loc
           Scanner obj14 = new Scanner(System.in);
           System.out.println("Enter the location you want to remove: ");
           String in14 = obj14.nextLine();
           int inInt14 = Integer.parseInt(in14);
           bag.removeAtLoc(inInt14);
           System.out.println(" ");
           continue;
        case 15: // List all item
            System.out.println("Items in the bag: ");
            bag.printAllItems();
            System.out.println(" ");
            continue;
        case 16: // Quit program
          System.out.println("Thank you!");
          return;
      }
    }
  }
}