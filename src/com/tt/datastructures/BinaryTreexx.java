package com.tt.datastructures;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreexx {

	static List<Node> binTree = new ArrayList<>();

	static Node root = null;

	static Node currentNode = null;

	public List<Node> getBinaryTree() {
		return binTree;
	}

	/** Returns current available node without a child */
	public Node getCurrentNode() {
		Node currNode = null;
		if(root == null){
			return null;
		}
		else{
			currNode = root;
			for(Node e: binTree){
				if(e.getLeftNode() == null || e.getRightNode() == null){
					currNode =e;
				}
			}
		}
		return null;
	}

	public boolean addNode(Node n) {
		boolean success = false;
		if (root == null) {
			binTree.add(n);
			root = n;
		} else {
			Node currAvalNode = getCurrentNode();
			if (currAvalNode.getLeftNode() == null) {
				binTree.add(n);
				currAvalNode.setLeftNode(n);
				success = true;
			} else if (currAvalNode.getRightNode() == null) {
				binTree.add(n);
				currAvalNode.setRightNode(n);
				success = true;
			}
		}
		return success;
	}

}