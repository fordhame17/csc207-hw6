package com.farevee.groceries;

/**
 * @author fordhame17
 * github.com/mauck/csc207-hw6 and Ajuna Kyaruzi were consulted for
 * inspiration on the equals method implementation.
 */

public class BulkItem
    implements Item
{
  // +--------+------------------------------------------------------------
  // | Fields |
  // +--------+
  BulkFood food;
  Units unit;
  int amount;

  // +--------------+------------------------------------------------------
  // | Constructors |
  // +--------------+
  public BulkItem(BulkFood f, Units u, int a)
  {
    this.food = f;
    this.unit = u;
    this.amount = a;
  } // BulkItem(BulkFood, Units, int)

  // +---------+-----------------------------------------------------------
  // | Methods |
  // +---------+
  /**
   * Get the weight of the item in its unit
   */
  public Weight getWeight()
  {
  return new Weight(this.unit, this.amount);
  } // getWeight()

  /**
   * Get the price of the item in cents
   */
  public int getPrice()
  {
    return this.amount * this.food.pricePerUnit;
  } // getPrice()

  /**
   * Return a string description
   */
  public String toString()
  {
    return this.getWeight() + " of " + this.food.toString();
  } // toString()

  /**
   * Check if equal to another BulkItem
   */
  public boolean equals(Object obj)
  {
    if (this == obj)
      {
        return true;
      } // if exact
    else if (obj instanceof BulkItem)
      {
        return this.equals(obj);
      } // if of same class
    else
      {
        return false;
      } // else
  } // equals(Object);

  /**
   * Check if 2 BulkItems are of the same type and unit.
   */
  public boolean equals(BulkItem other)
  {
    return this.food.equals(other.food) && this.unit.equals(other.unit);
  } // equals(BulkItem)
  
} // BulkItem class
