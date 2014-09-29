package com.farevee.groceries;

public class ManyPackages
    implements Item
{
  // +--------+------------------------------------------------------------
  // | Fields |
  // +--------+
  Package type;
  int count;

  // +--------------+------------------------------------------------------
  // | Constructors |
  // +--------------+
  public ManyPackages(Package p, int c)
  {
    this.type = p;
    this.count = c;
  } // ManyPackages(Package, int)

  // +---------+-----------------------------------------------------------
  // | Methods |
  // +---------+
  /**
   * Get the weight of the packages in its unit
   */
  public Weight getWeight()
  {
    return new Weight(this.type.weight.unit, this.type.weight.amount * this.count);
  } // getWeight()

  /**
   * Get the price of the packages in cents
   */
  public int getPrice()
  {
    return this.type.price * this.count;
  } // getPrice()

  /**
   * Return a string description
   */
  public String toString()
  {
    return this.count + " x " + this.type.toString();
  } // toString()

  /**
   * Check if equal by identical memory location 
   */
  public boolean equals(Object obj)
  {
    if (this == obj)
      {
        return true;
      } // if exact memory location
    return false;
  } // equals(Object);

} // ManyPackages class
