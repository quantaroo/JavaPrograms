import java.util.ArrayList;
public class Pizza{
  /*
* Private member variables to store the size of the pizza (either small, medium, or large),
* the number of cheese toppings, the number of pepperoni toppings, and the number of veggie toppings.
**/

  private String m_size;
  private int m_cheesetop;
  private int m_meattop;
  private int m_vegitop;

  /*
* Default and overloaded constructors that set all of the member variables.
*
* @param Pizza() gives a default no imput pizza.
* @param Pizza(String size, int cheesetop, int meattop, int vegitop) gives the overloaded constructor.
**/

  public Pizza(){
    m_size = "small";
    m_cheesetop = 0;
    m_meattop = 0;
    m_vegitop = 0;
  }

  public Pizza(String size, int cheesetop, int meattop, int vegitop){
    m_size = size;
    m_cheesetop = cheesetop;
    m_meattop = meattop;
    m_vegitop = vegitop;
  }

  /*
* Copy constructor using the appropriate shallow or deep copies for member variables.
*
* @param Pizza(Pizza original) creates a shallow copy of the orignal.
**/

  public Pizza(Pizza original){
    this.m_size = original.getSize();
    this.m_cheesetop = original.getCheese();
    this.m_meattop = original.getMeat();
    this.m_vegitop = original.getVegi();
  }

  /*
* Public accessors and mutators for all the member variables. Setter and Getters
**/

  public String getSize(){
    return m_size;
  }

  public void setSize(String t){
    m_size = t;
  }

  public int getCheese(){
    return m_cheesetop;
  }

  public void setCheese(int c){
    m_cheesetop = c;
  }

  public int getMeat(){
    return m_meattop;
  }

  public void setMeat(int m){
    m_meattop = m;
  }

  public int getVegi(){
    return m_vegitop;
  }

  public void setVegi(int v){
    m_vegitop = v;
  }

  /*
* A public method named calcCost() that returns a double that is the cost of the pizza.
*		Pizza cost is determined by:
*		Small: $10 + $2 per topping
*		Medium: $12 + $2 per topping
*		Large: $14 + $2 per topping
*
* @param calcCost() if statatment that chooses if its either small, medium, or large and calculates for each.
* @return returns the cost of the pizza given the size and toppings.
**/

  public double calcCost(){
    double cost = 0.00;
    if (m_size.equals("Small") || m_size.equals("small")){
      cost = (10 + (2*(m_cheesetop + m_meattop + m_vegitop)));
    }
    else if (m_size.equals("Medium") || m_size.equals("medium")){
      cost = (12 + (2*(m_cheesetop + m_meattop + m_vegitop)));
    }
    else if (m_size.equals("Large") || m_size.equals("large")){
      cost = (14 + (2*(m_cheesetop + m_meattop + m_vegitop)));
    }
    return cost;
  }

  /*
* A public method named toString() that returns a String containing the pizza size,
* quantity of each topping, and the pizza cost as calculated by calcCost().
*
* @param toString() gives the string with the size, number of toppings, and the cost of the pizza.
* @return the string value of these parameters.
**/

  public String toString(){
    return "--------------------\n"
    + "Size: " + m_size
    + "\nNumber of Cheese Toppings: " + m_cheesetop
    + "\nNumber of Meat Toppings: " + m_meattop
    + "\nNumber of Vegitable Toppings: " + m_vegitop
    + "\nTotal Cost of the Pizza: $" + this.calcCost();
  }

  /*
* A public method name equals() that returns a Boolean to determine if two pizzas are “equal.”
*
* @param equals(Pizza pizza2) checks if the two pizzas are the same.
* @return the boolean of the parameter if it is true or false.
**/

  public boolean equals(Pizza pizza2){
    if (pizza2 == null) {
      return false;
    }
    else if(pizza2 == this) {
      return true;
    }
    else {
      return false;
    }
  }
}
