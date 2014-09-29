package com.farevee.groceries;

public class Weight
{
  // +--------+------------------------------------------------------------
  // | Fields |
  // +--------+
  Units unit;
  int amount;

  // +--------------+------------------------------------------------------
  // | Constructors |
  // +--------------+
  public Weight(Units u, int a)
  {
    this.unit = u;
    this.amount = a;
  } // Weight(String, int)

  // +---------+-----------------------------------------------------------
  // | Methods |
  // +---------+
  public String getUnit()
  {
    return this.unit.toString();
  } // getUnits()

  public int getAmount()
  {
    return this.amount;
  } // getAmount()

  public String toString()
  {
    String str = this.amount + " " + this.unit.toString();
    if (this.amount > 1)
      {
        return str + "s";
      } // if
    else
      {
        return str;
      } // else
  } // toString()

} // Weight class
