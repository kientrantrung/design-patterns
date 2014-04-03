package strategy;

public class ArrayCompositor implements Compositor {

	@Override
	public int compose(Coord[] natural, Coord[] stretch, Coord[] shrink,
			int componentCount, int lineWidth, int[] breaks) {
		// TODO Auto-generated method stub
		return 2;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "ArrayCompositor";
	}
}
