package edu.grinnell.csc207.fordhame17.layout;

/**
 * @author fordhame17
 * github.com/mauck/csc207-hw6 was consulted for inspiration on method
 * row(int i) implementation.
 */

public class Grid
    implements TextBlock
{
  // +--------+------------------------------------------------------------
  // | Fields |
  // +--------+
  /**
   * The width of the grid
   */
  int width;
  /**
   * The height of the grid
   */
  int height;
  /**
   * The character filling the grid
   */
  char ch;

  // +--------------+------------------------------------------------------
  // | Constructors |
  // +--------------+
  /**
   * Build a w-by-h grid of a single character.
   */
  public Grid(int width, int height, char ch) throws Exception
  {
    if (width > 0 && width < Integer.MAX_VALUE && height > 0
        && height < Integer.MAX_VALUE)
      {
        this.width = width;
        this.height = height;
        this.ch = ch;
      } // if valid width & height
    else
      {
        throw new Exception("Width and/or height are invalid values for a grid");
      } // else
  } // Grid(int, int, char)

  // +---------+-----------------------------------------------------------
  // | Methods |
  // +---------+
  /**
   * Determine how many columns are in the block.
   */
  public int width()
  {
    return this.width;
  } // width()

  /**
   * Determine how many rows are in the block.
   */
  public int height()
  {
    return this.height;
  } // height()

  /**
    * Get one row from the block.
    * 
    * @pre i < this.height()
    * @exception Exception
    *              if the row number is invalid.
    */
  public String row(int i)
    throws Exception
  {
    if (i >= 0 && i < this.height)
      {
        String str = new String(new char[this.width]).replace("\0",String.valueOf(this.ch));
        return str;
      } // if valid i
    else
      {
        throw new Exception("Row " + i + " is invalid for this grid.");
      } // else
  } // row(int)
} // class Grid
