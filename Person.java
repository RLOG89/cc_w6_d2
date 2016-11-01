import java.util.*;

public class Person{

  private String name;
  private ArrayList<Drinkable> drink;
  private int drunkLevel;

  public Person(String name, int drunkLevel){
    this.name = name;
    this.drink = new ArrayList<Drinkable>();
    this.drunkLevel = drunkLevel;
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

  public int units(){
    int counter = 0;
    for (Drinkable beverage : drink){
     counter += beverage.units();
   }
   drunkLevel += counter;
   return counter;
  }

  public boolean drunk(){
    if (this.drunkLevel >= 10){
      return true;
    }
    return false;
  }
}
  // ask if need HomeTimeable or not.  Couldn't call on units in drunk if statement hence created HomeTimeable.  Can't get HomeTimeable to give number of units (only number of drinks)  Is this possible?  Need to use CASTing?


