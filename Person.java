import java.util.*;

public class Person{

  private String name;
  private ArrayList<Drinkable> drink;
  private int threshold;

  public Person(String name, int threshold){
    this.name = name;
    this.drink = new ArrayList<Drinkable>();
    this.threshold = threshold;
  }

  public String getName(){
    return this.name;
  }

  public int drinkCount(){
    return this.drink.size();
  }

  public void drink(Drinkable beverage){
    this.drink.add(beverage);
  }

  public void sleep(){
    this.drink.clear();
  }

  public Drinkable throwUp(){
    if (drinkCount() > 0){
      Drinkable beverage = drink.remove(0);
      return beverage;
    }
    return null;
  }

  public int drunkLevel(){
    int counter = 0;
    for (Drinkable beverage : drink){
     counter += beverage.units();
   }
   return counter;
  }

  public boolean drunk(){
    if (this.drunkLevel() >= this.threshold){
      return true;
    }
    return false;
  }
}
  // ask if need HomeTimeable or not.  Couldn't call on units in drunk if statement hence created HomeTimeable.  Can't get HomeTimeable to give number of units (only number of drinks)  Is this possible?  Need to use CASTing?


