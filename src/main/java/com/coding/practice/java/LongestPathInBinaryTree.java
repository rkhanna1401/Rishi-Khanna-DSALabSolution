package com.coding.practice.java;

import java.util.ArrayList;

public class LongestPathInBinaryTree {

	public static class Node {

		public Node left;
		public int data;
		public Node right;
	};
	public Node addNewNode(int data) {
		Node node = new Node();
		node.data = data;
		node.left = null;
		return node;
	}

	public ArrayList<Integer> calculatePath(Node root) {

		if(root == null) {
			ArrayList<Integer> path = new ArrayList<Integer>();
			return path;
		}

		ArrayList<Integer> leftRoute = calculatePath(root.left);

		ArrayList<Integer> rightRoute = calculatePath(root.right);

		if(leftRoute.size() > rightRoute.size()) {
			leftRoute.add(root.data);
		}
		else {
			rightRoute.add(root.data);
		}


		return (leftRoute.size() > rightRoute.size() ? leftRoute :rightRoute);

	}

}
