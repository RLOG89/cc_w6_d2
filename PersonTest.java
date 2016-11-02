import static org.junit.Assert.*;
import org.junit.*;

public class PersonTest{
  Person person;
  Beer beer;
  Whisky whisky;

  @Before 
  public void before(){
    person = new Person("Tom", 10);
    beer = new Beer();
    whisky = new Whisky();
  }

  @Test
  public void hasName(){
    assertEquals("Tom", person.getName());
  }

  @Test
  public void drinkscountStartsEmpty(){
    assertEquals(0, person.drinkCount());
  }

  @Test
  public void canDrinkBeer(){
    person.drink(beer);
    assertEquals(1, person.drinkCount());
  }

  @Test
  public void canDrinkWhisky(){
    person.drink(whisky);
    assertEquals(1, person.drinkCount());
  }

  @Test
  public void personIsSoberAfterSleep(){
    person.drink(beer);
    person.drink(whisky);
    assertEquals(2, person.drinkCount());
    person.sleep();
    assertEquals(0, person.drinkCount());
  }

  @Test
  public void canThrowUp(){
    person.drink(beer);
    Drinkable beverage = person.throwUp();
    assertNotNull(beverage);
  }

  @Test
  public void canGetBeerBack(){
    person.drink(beer);
    Drinkable beverage = person.throwUp();
    Beer original = (Beer) beverage;
    assertEquals(2, original.units());
  }

  @Test
  public void canGetWhiskyBack(){
    person.drink(whisky);
    Drinkable beverage = person.throwUp();
    Whisky original = (Whisky) beverage;
    assertEquals(4, original.units());
  }

  @Test
  public void personUnitsSum(){
    person.drink(beer);
    person.drink(beer);
    person.drink(whisky);
    person.drink(whisky);
    assertEquals(12, person.drunkLevel());
  }

  @Test
  public void personIsDrunk(){
    assertEquals(false, person.drunk());
    person.drink(beer);
    person.drink(beer);
    person.drink(whisky);
    person.drink(whisky);
    assertEquals(true, person.drunk());
  }
}

