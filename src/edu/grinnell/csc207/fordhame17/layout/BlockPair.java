package edu.grinnell.csc207.fordhame17.layout;

public class BlockPair
    implements TextBlock
{
  // +--------+------------------------------------------------------------
  // | Fields |
  // +--------+
  /**
   * The width of the blocked pair
   */
  int width;
  /**
   * The width of the blocked contents
   */
  int innerWidth;
  /**
   * The height of the blocked pair
   */
  int height;
  /**
   * The content of the blocked pair
   */
  TextBlock contents;

  // +--------------+------------------------------------------------------
  // | Constructors |
  // +--------------+
  /**
  * Create a new block that is made up of two copies of the
  * same original block
  *
  * @param tb
  */
  public BlockPair(TextBlock tb)
    throws Exception
  {
    if (tb.width() <= (Integer.MAX_VALUE / 2))
      {
        this.width = tb.width() * 2;
        this.innerWidth = tb.width();
        this.height = tb.height();
        this.contents = tb;
      } // if block small enough
    else
      {
        throw new Exception("Block provided is too long to be paired.");
      } // else
  } // BlockPair(TextBlock)

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
        String str = this.contents.row(i).substring(0, innerWidth);
        return str + str;
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
} // class BlockPair
