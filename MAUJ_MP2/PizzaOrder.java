import java.util.ArrayList;

public class PizzaOrder{
  /*
* A private member variable, m_order, which is an array of base type Pizza. Each pizza saved in this array should be a Pizza object.
* 
* @param m_order is the ArrayList we want to create with Pizza being the objects inside the array.
**/

  private ArrayList<Pizza> m_order = new ArrayList<Pizza>();

  /*
* A private member variable, m_numPizzas, which tells how many Pizzas are in the order
*
* @param m_numPizzas is the variable of number of pizza orders.
**/

  private int m_numPizzas;

  /*
* Default constructor which defaults to an order of a single small cheese Pizza.
*
* @param PizzaOrder() is the default constructor.
**/

  public PizzaOrder(){
    Pizza cheese = new Pizza("small",1,0,0);
    this.m_order.add(cheese);
    this.m_numPizzas = m_order.size();
  }

  /*
* Overloaded constructor that takes an integer parameter that tells how many pizzas
* will be added to the order and initializes the order instance variable to an empty array of that size.
*
* @param PizzaOrder(int x) makes a given number of pizza objects.
**/

  public PizzaOrder(int x){
    for(int i=0; i < x; ++i){
      Pizza pizza = new Pizza();
      this.m_order.add(pizza);
    }
    m_numPizzas = m_order.size();
  }

  /*
* public int addPizza(Pizza pizza)— add the parameter Pizza object to the PizzaOrder’s order member variable.
* Given that the order is saved as a Pizza array, remember that once the order is full you will not be able to add more pizzas!
*
* @param addPizza(Pizza pizza) adds another order to the order ArrayList.
* @return the number of pizzas in the order ArrayList.
**/

  public int addPizza(Pizza pizza){
    this.m_order.add(pizza);
    return m_numPizzas;
  }

  /*
* public double calcTotal() —returns the total cost of the order by adding up the prices of each pizza in the order.
*
* @param calcTotal() Runs a for loop and sums every pizza cost.
* @return the sum of the total of the order.
**/

  public double calcTotal(){
    double sum = 0.00;
    for(Pizza p: m_order){
      sum += p.calcCost();
    }
    return sum;
  }

  /*
* public String toString() —returns a String representing this order,
* so that the employee at the pizza joint can repeat the order back to you before sending it to the kitchen.
* This method should begin by calling the calcTotal() method so that the total price of the order can be displayed.

* @param toString() Runs a for loop that prints out toString method for each pizza
* @return prints out the total cost of the order
**/

  public String toString(){
    for(int i=0; i < m_order.size(); ++i){
       System.out.println(m_order.get(i));
    }
    return "The total cost of the order is: $" + this.calcTotal() + "\n";
  }
}
