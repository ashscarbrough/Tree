
/*
 *  Author: 	Ash Scarbrough and code provided by the class textbook authors (Deitel)
 *  Date:		8/10/2016
 *  Assignment:	Homework Assignment #4
 *  Class:		CSCI-C490 (Advanced Java)
 *  Details: 	The TreeTest class serves as a driver program for Tree and TreeNode classes:
 *  			 - Contains the main
 *  			 - Creates different trees for integers, doubles and strings
 *  				
 *  			Function: TreeTest creates and fills three different types of trees utilizing
 *  				the same code via Java generics.  An integer tree is created via a random
 *  				number generator.  A decimal tree is also created using the generator; it is
 *  				formated through string format, cast back into a decimal and placed in the tree.
 *  				The string tree is also created via programmer supplied names.  Each tree
 *  				is filled and the preorder, inorder, and postorder of each tree is displayed.
 */
// Fig. 17.18: TreeTest.java
// This program tests class Tree.

import java.text.DecimalFormat;
import java.util.Random;

public class TreeTest 
{
   public static void main( String args[] )
   {
      Tree intTree = new Tree();  // Tree comprised of integers
      Tree doubleTree = new Tree(); // like eponymous Double Tree Inn... but a tree for doubles
      Tree stringTreeze = new Tree();  // like string cheese... but a tree for strings
      int intValue;
      double doubleValue;
      Random randomNumber = new Random();  // Random generator used for ints and doubles
      DecimalFormat df = new DecimalFormat("#0.00");	// sets the format for doubles

      //  Section deals with the Integer Tree
      System.out.println( "Inserting the following values: " );

      // insert 10 random integers from 0-99 in tree 
      for ( int i = 1; i <= 10; i++ ) 
      {
         intValue = randomNumber.nextInt( 100 );
         System.out.print( intValue + " " );
         intTree.insertNode( intValue );
      } // end for
      
      System.out.println ( "\n\nPreorder traversal" );
      intTree.preorderTraversal(); // perform preorder traversal of tree

      System.out.println ( "\n\nInorder traversal" );
      intTree.inorderTraversal(); // perform inorder traversal of tree

      System.out.println ( "\n\nPostorder traversal" );
      intTree.postorderTraversal(); // perform postorder traversal of tree
      System.out.println("\n\n");
      
      //  Section deals with the Double Tree
      System.out.println( "Inserting the following values: " );
      
      // insert 10 random doubles from 0.00-99.99 in tree 
      for (int i = 1; i <= 10; i ++)
      {
    	  doubleValue = randomNumber.nextDouble() * 100; 
    	  System.out.print( df.format(doubleValue) + " "); // prints values in format
    	  double formatedDouble = Double.parseDouble(df.format(doubleValue)); // cast as double
    	  doubleTree.insertNode(df.format(doubleValue));  //insert doubles into tree
      }
      
      System.out.println ( "\n\nPreorder traversal" );
      doubleTree.preorderTraversal(); // perform preorder traversal of tree

      System.out.println ( "\n\nInorder traversal" );
      doubleTree.inorderTraversal(); // perform inorder traversal of tree

      System.out.println ( "\n\nPostorder traversal" );
      doubleTree.postorderTraversal(); // perform postorder traversal of tree
      System.out.println("\n\n");
      
      //  Section deals with the String Tree
      System.out.println( "Inserting the following values: " );
      
      // Create string array
      String [] stringArray = {"Tim", "Tim", "John", "Jacob", "Jingleheimer", "Schmidt",
    		  						"Jessica", "Dominic", "Gabriel", "Elizabeth"};
      
      for (String name: stringArray)  // enhanced for loop to output and insert strings
      {
    	  System.out.print(name + " ");
    	  stringTreeze.insertNode(name);
      }
      
      System.out.println ( "\n\nPreorder traversal" );
      stringTreeze.preorderTraversal(); // perform preorder traversal of tree

      System.out.println ( "\n\nInorder traversal" );
      stringTreeze.inorderTraversal(); // perform inorder traversal of tree

      System.out.println ( "\n\nPostorder traversal" );
      stringTreeze.postorderTraversal(); // perform postorder traversal of tree
      System.out.println();
   } // end main
} // end class TreeTest


/**************************************************************************
 * (C) Copyright 1992-2012 by Deitel & Associates, Inc. and               *
 * Pearson Education, Inc. All Rights Reserved.                           *
 *                                                                        *
 * DISCLAIMER: The authors and publisher of this book have used their     *
 * best efforts in preparing the book. These efforts include the          *
 * development, research, and testing of the theories and programs        *
 * to determine their effectiveness. The authors and publisher make       *
 * no warranty of any kind, expressed or implied, with regard to these    *
 * programs or to the documentation contained in these books. The authors *
 * and publisher shall not be liable in any event for incidental or       *
 * consequential damages in connection with, or arising out of, the       *
 * furnishing, performance, or use of these programs.                     *
 *************************************************************************/