package practiceTree;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

/**https://www.hackerrank.com/challenges/java-vistor-pattern/problem**/

public class Solution {
	private static int[] values;
	private static Color[] colors;
	private static HashMap<Integer, HashSet<Integer>> map;

	public static Tree solve() {
		Scanner scan = new Scanner(System.in);
		int numNodes = scan.nextInt();

		/* Read & Save, Node & Color */
		values = new int[numNodes];
		colors = new Color[numNodes];
		map = new HashMap<Integer, HashSet<Integer>>(numNodes);

		for (int i = 0; i < numNodes; i++) {
			colors[i] = scan.nextInt() == 0 ? Color.RED : Color.GREEN;
		}

		/* Save Edges */
		for (int i = 0; i < numNodes - 1; i++) {
			int u = scan.nextInt();
			int v = scan.nextInt();

			/* Edges are undirected: Add 1st direction */
			HashSet<Integer> uNeighbors = map.get(u);
			uNeighbors.add(v);
			/* Edges are undirected: Add 2nd direction */
			HashSet<Integer> vNeighbors = map.get(v);
			if (vNeighbors == null) {
				vNeighbors = new HashSet<Integer>();
				map.put(v, vNeighbors);
			}
			vNeighbors.add(u);
		}
		scan.close();

		/* Handle 1-Node tree */
		if (numNodes == 1) {
			return new TreeLeaf(values[0], colors[0], 0);
		}

		/* Create Tree */
		TreeNode root = new TreeNode(values[0], colors[0], 0);
		addChildren(root, 1);
		return root;
	}

	/* Recursively adds children of a TreeNode */
	public static void addChildren(TreeNode parent, Integer parentNum) {
		/* Get HashSet of children and loop through them */
		for (Integer treeNum : map.get(parentNum)) {
			map.get(treeNum).remove(parentNum); // removes the opposite arrow direction

			/* Add child */
			HashSet<Integer> grandChildren = map.get(treeNum);
			boolean childHasChild = (grandChildren != null && !grandChildren.isEmpty());
			Tree tree;
			if (childHasChild) {
				tree = new TreeNode(values[treeNum - 1], colors[treeNum - 1], parent.getDepth() + 1);
			} else {
				tree = new TreeLeaf(values[treeNum - 1], colors[treeNum - 1], parent.getDepth() + 1);
			}
			parent.addChild(tree);

			/* Recurse if necessary */
			if (tree instanceof TreeNode) {
				addChildren((TreeNode) tree, treeNum);
			}
		}
	}
	
	
	
	 public static void main(String[] args) {
	      	Tree root = solve();
			SumInLeavesVisitor vis1 = new SumInLeavesVisitor();
	      	ProductOfRedNodesVisitor vis2 = new ProductOfRedNodesVisitor();
	      	FancyVisitor vis3 = new FancyVisitor();

	      	root.accept(vis1);
	      	root.accept(vis2);
	      	root.accept(vis3);

	      	int res1 = vis1.getresult();
	      	int res2 = vis2.getresult();
	      	int res3 = vis3.getresult();

	      	System.out.println(res1);
	     	System.out.println(res2);
	    	System.out.println(res3);
		}
}
