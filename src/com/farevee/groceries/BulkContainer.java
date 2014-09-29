package com.farevee.groceries;

public class BulkContainer
    extends BulkItem
{
  // +--------+------------------------------------------------------------
  // | Fields |
  // +--------+
  String container;

  // +--------------+------------------------------------------------------
  // | Constructors |
  // +--------------+
  public BulkContainer(String c, BulkFood f, Units u, int a)
  {
    super(f, u, a);
    this.container = c;
  } // BulkItem(BulkFood, Units, int)

  // +---------+-----------------------------------------------------------
  // | Methods |
  // +---------+
  /**
   * Return a string description
   */
  public String toString()
  {
    return this.container + " of " + this.getWeight() + " of "
           + this.food.toString();
  } // toString()

  /**
   * Check if equal to another BulkContainer
   */
  public boolean equals(Object obj)
  {
    if (this == obj)
      {
        return true;
      } // if exact
    else if (obj instanceof BulkContainer)
      {
        return this.equals(obj);
      } // if of same class
    else
      {
        return false;
      } // else
  } // equals(Object);

  /**
   * Check if 2 BulkContainers are of the same type.
   */
  public boolean equals(BulkContainer other)
  {
    return this.container.equals(other.container)
        && super.food.equals(other.food) && super.unit.equals(other.unit);
  } // equals(BulkContainer)

} // BulkContainer class
