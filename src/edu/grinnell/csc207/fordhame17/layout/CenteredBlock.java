package edu.grinnell.csc207.fordhame17.layout;

public class CenteredBlock implements TextBlock
{
  // +--------+------------------------------------------------------------
  // | Fields |
  // +--------+
  /**
   * The width of the centered block
   */
  int width;
  /**
   * The width of the block contents
   */
  int innerWidth;
  /**
   * The height of the centered block
   */
  int height;
  /**
   * The content of the centered block
   */
  TextBlock contents;
  
  // +--------------+------------------------------------------------------
  // | Constructors |
  // +--------------+
  /**
   * Create a new centered block within a specified width.
   */
  public CenteredBlock(TextBlock tb, int width)
  throws Exception
  {
    if (width >= tb.width() && width < Integer.MAX_VALUE)
      {
        this.width = width;
        this.innerWidth = tb.width();
        this.height = tb.height();
        this.contents = tb;
      }
    else
      {
        throw new Exception("Invalid Width for this centering");
      }
  } // CenteredBlock(TextBlock, int)
  
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
        int diff = (this.width - this.innerWidth) / 2;
        String gap = new String(new char[diff]).replace("\0"," ");
        return gap + str + gap;
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
} // class CenteredBlock
