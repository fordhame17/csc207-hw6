package edu.grinnell.csc207.fordhame17.layout;

public class RightJustified implements TextBlock
{
  // +--------+------------------------------------------------------------
  // | Fields |
  // +--------+
  /**
   * The width of the righted block
   */
  int width;
  /**
   * The width of the righted contents
   */
  int innerWidth;
  /**
   * The height of the righted block
   */
  int height;
  /**
   * The content of the righted block
   */
  TextBlock contents;
  
  // +--------------+------------------------------------------------------
  // | Constructors |
  // +--------------+
  /**
   * Create a new right justified block within a specified width.
   */
  public RightJustified(TextBlock tb, int width)
  throws Exception
  {
    if (width >= tb.width() && width < Integer.MAX_VALUE)
      {
        this.width = width;
        this.innerWidth = tb.width();
        this.height = tb.height();
        this.contents = tb;
      } // if width valid
    else
      {
        throw new Exception("Invalid Width for this right justification");
      } // else
  } // RightJustified(TextBlock, int)
  
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
        int diff = this.width - this.innerWidth;
        String gap = new String(new char[diff]).replace("\0"," ");
        return str + gap;
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
} // class RightJustified
