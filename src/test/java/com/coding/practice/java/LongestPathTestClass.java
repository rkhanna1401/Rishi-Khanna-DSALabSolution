package com.coding.practice.java;

import java.util.ArrayList;

import com.coding.practice.java.LongestPathInBinaryTree.Node;

public class LongestPathTestClass {

	public static void main(String[] args) {

		LongestPathInBinaryTree ln = new LongestPathInBinaryTree();
		
		Node node = ln.addNewNode(100);
		node.left = ln.addNewNode(20);
		node.right = ln.addNewNode(130);
		node.left.left = ln.addNewNode(10);
		node.left.right = ln.addNewNode(50);
		node.left.left.left = ln.addNewNode(5);
		node.right.right = ln.addNewNode(140);
		node.right.left = ln.addNewNode(110);
	
		ArrayList<Integer> longestRoute = ln.calculatePath(node);
		System.out.println("The longest path will be: ");
		System.out.print(longestRoute.get(longestRoute.size() -1));
	    for(int i = longestRoute.size() - 2; i >= 0; i--)
	    {
	        System.out.print(" -> " + longestRoute.get(i));
	    }
	}

}
