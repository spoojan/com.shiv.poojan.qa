package practiceTree;

public class ProductOfRedNodesVisitor extends TreeVis {
	long result = 0;
	private final int M = 1000000007;

	public int getresult() {
		// TODO Auto-generated method stub
		return (int) result;
	}

	public void visitNode(TreeNode node) {
		if (node.getColor() == Color.RED) {
			result = (result * node.getValue()) % M;
		}
	}

	public void visitLeafNode(TreeLeaf leaf) {
		if (leaf.getColor() == Color.RED) {
			result = (result * leaf.getValue()) % M;
		}
	}

}
