package edu.grinnell.csc207.fordhame17.layout;

import java.io.PrintWriter;

/**
 * A series of experiments with the text block layout classes.
 * 
 * @author Samuel A. Rebelsky
 * @version 1.2 of September 2014
 */
public class TBExpt
{
  // +------+--------------------------------------------------------------
  // | Main |
  // +------+

  public static void main(String[] args)
    throws Exception
  {
    // Prepare for input and output
    PrintWriter pen = new PrintWriter(System.out, true);

    //    // Create a block to use
    //    TextBlock block1 = new TextLine("Hello");
    //    // Print out the block
    //    TBUtils.print(pen, block1);
    //    TextBlock block2 = new TextLine("This is a test.");
    //    TBUtils.print(pen,block2);
    //    
    //    BoxedBlock block3 = new BoxedBlock (block1) ;
    //    TBUtils.print(pen,block3);
    //    BoxedBlock block4 = new BoxedBlock (block3) ;
    //    TBUtils.print(pen,block4);
    //    
    //    TextBlock block5 = new TextLine("Goodbye");
    //    BoxedBlock block6 = new BoxedBlock( block5);
    //    
    //    
    //    TBUtils.print(pen, new HComposition(block5,block3));
    //    TBUtils.print(pen, new Grid(7, 3, '*'));
    // PART A
//    TBUtils.print(pen, new BoxedBlock(new Grid(7, 3, '*')));
//    TextBlock block =
//        new VComposition(new TextLine("Hello"), new TextLine("Goodbye"));
//    TextBlock block2 = new TruncatedBlock(block, 3);
//    TBUtils.print(pen, block);
//    TBUtils.print(pen, block2);
//    TextBlock block3 = new BoxedBlock(new CenteredBlock(block, 11));
//    TBUtils.print(pen, block3);
//    TextBlock block4 = new BoxedBlock(new RightJustified(block, 11));
//    TBUtils.print(pen, block4);
//    TextBlock block5 = new BoxedBlock(new BlockPair(block));
//    TBUtils.print(pen, block5);
    
    TextLine tb1 = new TextLine("Hello");
    TextLine tb2 = new TextLine("World");
    TextBlock compound = new BoxedBlock(new CenteredBlock(new BoxedBlock(
        new CenteredBlock(new VComposition(tb1, tb2), 7)), 15));
    pen.println("ORIGINAL");
    TBUtils.print(pen, compound);
    tb2.setContents("Someone");
    pen.println("UPDATED");
    TBUtils.print(pen, compound);
    tb1.setContents("Nice to meet you,");
    pen.println("RE-UPDATED");
    TBUtils.print(pen, compound);


    // Clean up after ourselves.
    pen.close();
  } // main(String[])

} // class TBExpt
