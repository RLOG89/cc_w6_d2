import java.util.*;

public class Person{
  
  private String name;
  private ArrayList<Drinkable> drink;

  public Person(String name){
    this.name = name;
    this.drink = new ArrayList<Drinkable>();
  }

  public String getName(){
    return this.name;
  }

  public int beerCount(){
    return this.drink.size;
  }

  public void drink(Beer beer){

  }

  // public boolean drunk(){
  //   return beerCount() == drink.length;
  // }

  // public void sleep(){
  //   for (int i = 0; i < drink.length; i++){
  //     drink[i] = null; 
  //   }
  // }
}

