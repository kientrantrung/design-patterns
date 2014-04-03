package strategy;

public class Composition {
	private Compositor compositor;
	private Component[] components;
	private int componentCount;
	private int[] lineBreaks;
	private int lineCount;

	public Composition(Compositor compositor) {
		this.compositor = compositor;
	}

	public void repair() {

	}
}
