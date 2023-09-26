class Bag {
  // Attributes
  private int[] arrBag;
  private int currentItemLoc;

  // Method
  /* Postcondition: The Bag has been initialized 
   * and it is now empty.*/
  public Bag(int size) {
    currentItemLoc = 0;
    arrBag = new int[size];
  }

  /* Precondition: The bag is not full
   * Postcondition: The item (represent in integer) is being 
   * added to the array (bag) */
  public void add(int entry) {
    if (currentItemLoc < arrBag.length) {
      arrBag[currentItemLoc] = entry;
      currentItemLoc++;

    } else {
      System.out.println("The bag is full");
    }
  }

  /* Precondition: The element must exist inside the bag.
   * Postcondition: If target was in the Bag, then
   * one copy of target has been removed from the
   * Bag, and the return value is true; otherwise the
   * Bag is unchanged and the return value is false.*/
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
      return false;
    }
  }

  /* Precondition: Do not count the empty space.
   * Postcondition: The return value is the number 
   * of integers in the Bag.*/ 
  public int calcSize() {
    int counter = 0;
    for (int i = 0; i < currentItemLoc; i++) {
      if (arrBag[i] != 0) {
        counter++;
      }
    }
    return counter;
  }

  /* Postcondition: The return value is the number 
   * of copies of target in the Bag.*/ 
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
        System.out.println(arrBag[i]);
      }
    }
  }

  public int positionOf(int entry){
    int position = 0;
    for (int i = 0; i < currentItemLoc; i++){
      if (arrBag[i] == entry){
        i = position+1;
        break;
      }
    }
    return position;
  }
}

public class Main {

  public static void main(String[] args) {
    Bag bag = new Bag(10);

    System.out.println("Current all items in bag: ");
    bag.printAllItems();
    System.out.println();

    bag.add(2); System.out.println("Now adding 2...");
    bag.add(3); System.out.println("Now adding 3...");
    bag.add(3); System.out.println("Now adding 3...");
    bag.add(4); System.out.println("Now adding 4...");
    bag.add(5); System.out.println("Now adding 5...");
    bag.add(6); System.out.println("Now adding 6...");
    bag.add(7); System.out.println("Now adding 7...");
    bag.add(8); System.out.println("Now adding 8...");
    bag.add(8); System.out.println("Now adding 8...");
    System.out.println();
    
    System.out.println("Size of bag after adding: " + bag.calcSize());
    System.out.println("Current all items in bag: ");
    bag.printAllItems();

    System.out.println();
    bag.remove(2); System.out.println("Now removing 2...");
    System.out.println();
    
    System.out.println("Size of bag after removing: " + bag.calcSize());
    System.out.println("Current all items in bag: ");
    bag.printAllItems();

    System.out.println();
    System.out.println("How many times does '3' occur in the bag?");
    System.out.println(bag.countOccur(3));

    System.out.println();
    System.out.println("How many times does '1' occur in the bag?");
    System.out.println(bag.countOccur(1));

    System.out.println();
    System.out.println("How many times does '5' occur in the bag?");
    System.out.println(bag.countOccur(5));

    System.out.println();
    System.out.println("The position of 3 is: ");
    System.out.println(bag.positionOf(3));
  }
}
