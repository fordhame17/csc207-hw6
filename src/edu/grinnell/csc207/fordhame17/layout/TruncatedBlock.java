package edu.grinnell.csc207.fordhame17.layout;

/**
 * @author fordhame17
 * github.com/mauck/csc207-hw6 was consulted for inspiration on method
 * row(int i) implementation.
 */

public class TruncatedBlock implements TextBlock
{
  // +--------+------------------------------------------------------------
  // | Fields |
  // +--------+
  /**
   * The width of the truncated block
   */
  int width;
  /**
   * The height of the truncated block
   */
  int height;
  /**
   * The content of the truncated block
   */
  TextBlock contents;

  // +--------------+------------------------------------------------------
  // | Constructors |
  // +--------------+
  /**
   * Create a new truncated block of the specified width.
   */
  public TruncatedBlock(TextBlock tb, int width)
  throws Exception
  {
    if (width >= 0 && width <= tb.width())
      {
        this.width = width;
        this.height = tb.height();
        this.contents = tb;
      }
    else
      {
        throw new Exception("Invalid Width for this truncation");
      }
  } // TruncatedBlock(TextBlock, int)

  // +---------+-----------------------------------------------------------
  // | Methods |
  // +---------+
  /**
   * Get the ith row of the block.
   */
  public String row(int i)
  throws Exception
  {
    if (i >= 0 && i < this.height)
      {
        return this.contents.row(i).substring(0, width);
      } // if valid i
    else
      {
        throw new Exception("Row " + i + " is invalid for this block.");
      } // else
  } // row(int)

  /**
   * Determine how many rows are in the block.
   */
  public int height()
  {
    return this.height;
  } // height()

  /**
   * Determine how many columns are in the block.
   */
  public int width()
  {
    return this.width;
  } // width()
}
