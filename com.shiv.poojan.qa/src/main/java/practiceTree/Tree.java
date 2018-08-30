package practiceTree;

public abstract class Tree {
	private int value;
	private Color color;
	private int depth;

	public Tree(int value, Color color, int depth) {
		this.value = value;
		this.color = color;
		this.depth = depth;
	}

	public Color getColor() {
		return color;
	}

	public int getValue() {
		return value;
	}

	public int getDepth() {
		return depth;
	}

	public abstract void accept(TreeVis visitor);
}
