package strategy;

public interface Compositor {
	public int Compose(Coord[] natural, Coord[] stretch, Coord[] shrink,
			int componentCount, int lineWidth, int[] breaks);
}
