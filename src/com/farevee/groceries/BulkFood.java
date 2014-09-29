package com.farevee.groceries;

public class BulkFood
{
  // +--------+------------------------------------------------------------
  // | Fields |
  // +--------+
  String name;
  Units unit;
  int pricePerUnit;
  int supply;
  
  // +--------------+------------------------------------------------------
  // | Constructors |
  // +--------------+
  public BulkFood(String n, Units u, int p, int s)
  {
    this.name = n;
    this.unit = u;
    this.pricePerUnit = p;
    this.supply = s;
  } // BulkFood(String, Units, int, int)
  
  // +---------+-----------------------------------------------------------
  // | Methods |
  // +---------+
  public String toString()
  {
    return this.name;
  } // toString()
  
  public String getUnit()
  {
    return this.unit.toString();
  } // getUnits()
  
} // BulkFood class
