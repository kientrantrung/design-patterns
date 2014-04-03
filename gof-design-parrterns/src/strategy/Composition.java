package strategy;

import java.util.ArrayList;

public class Composition {

	private Compositor compositor;
	private Component[] components; // the list of components
	private int componentCount;// the number of components
	int lineWidth; // the Composition's line width
	private int[] lineBreaks; // the position of linebreaks in components
	private int lineCount; // the number of lines

	public Composition(Compositor compositor) {
		this.compositor = compositor;
	}

	public void repair() {
		Coord[] natural = new Coord[1];
		Coord[] stretchability = new Coord[1];
		Coord[] shrinkability = new Coord[1];
		int componentCount = 0;
		int[] breaks = new int[1];

		// prepare the arrays with the desired component sizes
		// ...

		// determine where the breaks are:
		int breakCount;
		breakCount = this.compositor.compose(natural, stretchability,
				shrinkability, componentCount, this.lineWidth, breaks);

		// lay out components according to breaks
		// ...
		System.out.println(this.compositor + " return: " + breakCount);
	}

	public static void main(String[] args) {
		Composition quick = new Composition(new SimpleCompositor());
		Composition slick = new Composition(new TeXCompositor());
		Composition iconic = new Composition(new ArrayCompositor());

		ArrayList<Composition> compositions = new ArrayList<Composition>();
		compositions.add(quick);
		compositions.add(slick);
		compositions.add(iconic);

		for (Composition comp : compositions) {
			comp.repair();
		}
	}
}
