/*
 *  Author: 	Ash Scarbrough and code provided by the class textbook authors (Deitel)
 *  Date:		8/10/2016
 *  Assignment:	Homework Assignment #4
 *  Class:		CSCI-C490 (Advanced Java)
 *  Details: 	The TreeNode class utilizes comparable Generics:
 *  			 - Each node contains generic data (which can hold various primitive types and objects)
 *  			 - References to two other nodes (left and right)
 *  			 - One constructor that gives the node the data and type passed in by parameter, and
 *  				sets the references to null
 *  			This class includes one method: 
 *  				- insert() - which has a generic datatype pass in as a parameter, which is used
 *  					alter the rightNode/leftNode reference to a new Node with the parameter's data
 *  
 *  
 *  			The Tree class utilizes comparable Generics as it creates a binary tree structure:
 *  				- has a single reference pointer "root", which serves as the tree's foundation point
 *  				- has a parameter-less constructor that sets root reference to null
 *  			It has 7 methods
 *  				- insertNode (E) - inserts a new node with generic value in left or right node 
 *     					depending on generic's value compared to root's value
 *  				- preorderTraversal - runs preorderHelper
 *  				- preorderHelper - traverses tree in preorder
 *  				- inorderTraversal - runs inorderHelper
 *  				- inorderHelper - traverses tree inorder
 *  				- postorderTraversal - runs postorderTraversal
 *  				- postorderHelper - traverses tree postorder
 *  				
 *  			Function: Both classes work together to create Nodes that can hold generic data
 *  				and a tree that holds nodes in a binary form.  The purpose of this program
 *  				is to create a binary tree using various data types (int, double, string) by 
 *  				utilizing the same code through the use of Java Generics
 */

// Tree.java
// Definition of class TreeNode and class Tree.


// class TreeNode definition
class TreeNode <E extends Comparable <E> >	// Extending generic with Comparable generic 
{
  
   TreeNode leftNode; // left node  
   E data; // node value holding generic data
   TreeNode rightNode; // right node

   // constructor initializes data and makes this a leaf node
   public TreeNode( E nodeData )
   { 
      data = nodeData;     		   // places generic in data field of node    
      leftNode = rightNode = null; // node has no children
   } // end TreeNode constructor

   // locate insertion point and insert new node; ignore duplicate values
   public void insert( E insertValue )
   {
      // compareTo allows generic data to be compared.
      if ( insertValue.compareTo(data) < 0 ) // insert in left subtree
      {						 				 
         // insert new TreeNode
         if ( leftNode == null )
            leftNode = new TreeNode( insertValue );
         else // continue traversing left subtree
            leftNode.insert( insertValue ); 
      } // end if
      else if ( insertValue.compareTo(data) >= 0 ) // insert in right subtree
      {
         // insert new TreeNode
         if ( rightNode == null )
            rightNode = new TreeNode( insertValue );
         else // continue traversing right subtree
            rightNode.insert( insertValue ); 
      } // end else if
   } // end method insert
} // end class TreeNode


// class Tree definition

public class Tree <E extends Comparable <E>>  // Allows for the use of Generics (E) 
{
   private TreeNode root;

   // constructor initializes an empty Tree of integers
   public Tree() 
   { 
      root = null; 
   } // end Tree no-argument constructor

   // insert a new node in the binary search tree
   public void insertNode( E insertValue )
   {
      if ( root == null )
         root = new TreeNode( insertValue ); // create the root node here
      else
         root.insert( insertValue ); // call the insert method
   } // end method insertNode

   // begin preorder traversal
   public void preorderTraversal()
   { 
      preorderHelper( root ); 
   } // end method preorderTraversal

   // recursive method to perform preorder traversal
   private void preorderHelper( TreeNode node )
   {
      if ( node == null )
         return;
      					// toString() following is not necessary but added for clarity
      System.out.printf( "%s ", node.data.toString() ); // output node data as string
      preorderHelper( node.leftNode );       // traverse left subtree
      preorderHelper( node.rightNode );      // traverse right subtree
   } // end method preorderHelper

   // begin inorder traversal
   public void inorderTraversal()
   { 
      inorderHelper( root ); 
   } // end method inorderTraversal

   // recursive method to perform inorder traversal
   private void inorderHelper( TreeNode node )
   {
      if ( node == null )
         return;

      inorderHelper( node.leftNode );        // traverse left subtree
      System.out.printf( "%s ", node.data.toString() ); // output node data as string
      inorderHelper( node.rightNode );       // traverse right subtree
   } // end method inorderHelper

   // begin postorder traversal
   public void postorderTraversal()
   { 
      postorderHelper( root ); 
   } // end method postorderTraversal

   // recursive method to perform postorder traversal
   private void postorderHelper( TreeNode node )
   {
      if ( node == null )
         return;
  
      postorderHelper( node.leftNode );      // traverse left subtree
      postorderHelper( node.rightNode );     // traverse right subtree
      System.out.printf( "%s ", node.data.toString() ); // output node data as string
   } // end method postorderHelper
} // end class Tree

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

