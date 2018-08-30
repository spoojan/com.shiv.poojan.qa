package practiceTree;

public class SumInLeavesVisitor extends TreeVis {

	int result = 0;

	public int getresult() {
		return result;
	}

	public void visitNode(TreeNode node) {

	}

	public void visitLeafNode(TreeLeaf leaf) {
		result = leaf.getValue();
	}

}
