package com.coding.practice.java;

import java.util.Stack;

public class BalancedParanthesisFinder {

	public static Boolean isBalanced(String s) {

		Stack<Character> stack = new Stack<Character>();


		for(int i =0; i< s.length(); i++) {
			char ch = s.charAt(i);
			if(ch == '[' || ch == '{' || ch == '(') {
				stack.push(ch);
				continue;
			}

			else if(ch == ']') {
				if(stack.isEmpty() || stack.pop()!= '[') {
					return false;
				}
			}

			else if(ch == '}') {
				if(stack.isEmpty() || stack.pop()!= '{') {
					return false;
					
				}
			}

			else if(ch == ')') {
				if(stack.isEmpty() || stack.pop()!= '(') {
					return false;
				}
			}
		}
		return stack.isEmpty();
	}

}
