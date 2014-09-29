package com.farevee.groceries;

public interface Item
{
  // +---------+-----------------------------------------------------------
  // | Methods |
  // +---------+
  /**
   * Get the weight of the item in its unit
   */
  public Weight getWeight();

  /**
   * Get the price of the item in cents
   */
  public int getPrice();

  /**
   * Return a string description
   */
  public String toString();
} // Item interface
