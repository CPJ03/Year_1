public class WeatherTest { // a class consists of data + operation
  
  public static void main(String args[]) {
      // class  object/instance
      Weather weather = new Weather();

      float TempRange[] =  {20, 45};
      float WindRange[] =  {0, 50};
      weather.generate(TempRange, WindRange);
      System.out.println("Created a weather object: " + weather);
      weather.display();  

      // create an array of 60 weather
      // An array in Java is an object - it has its own attributes and methods
      // When we first create an array, it will be an array of null
      // its like buying a book shelf... u have the shelf, but not the books
      Weather readings[] = new Weather[60]; 
      for (int i=0; i<readings.length; i++) {
          readings[i] = new Weather();  
          readings[i].generate(TempRange, WindRange);
          readings[i].temperature = 0; 
          readings[i].display();
      }
    
  }
}