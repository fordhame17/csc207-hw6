package com.farevee.groceries;

public class NonFood implements Item
{
  // +--------+------------------------------------------------------------
  // | Fields |
  // +--------+
  String name;
  Weight weight;
  int price;
  
  // +--------------+------------------------------------------------------
  // | Constructors |
  // +--------------+
  public NonFood(String n, Weight w, int p)
  {
    this.name = n;
    this.weight = w;
    this.price = p;
  } // NonFood(String, Weight, int)
  
  // +---------+-----------------------------------------------------------
  // | Methods |
  // +---------+
  /**
   * Get the weight of the package in its unit
   */
  public Weight getWeight()
  {
    return this.weight;
  } // getWeight()

  /**
   * Get the price of the package in cents
   */
  public int getPrice()
  {
    return this.price;
  } // getPrice()

  /**
   * Return a string description
   */
  public String toString()
  {
    return this.name;
  } // toString()
  
  /**
   * Check if equal to another NonFood
   */
  public boolean equals(Object obj)
  {
    if (this == obj)
      {
        return true;
      } // if exact
    else if (obj instanceof NonFood)
      {
        return this.equals(obj);
      } // if of same class
    else
      {
        return false;
      } // else
  } // equals(Object);

  /**
   * Check if 2 NonFoods are of the same type.
   */
  public boolean equals(NonFood other)
  {
    return this.name.equals(other.name) &&
        this.weight.equals(other.weight) &&
        this.price == other.price;
  } // equals(NonFood)
} // NonFood class
