package strategy;

public interface Compositor {
	/**
	 * 
	 * @param natural
	 * @param stretch
	 * @param shrink
	 * @param componentCount
	 * @param lineWidth
	 * @param breaks
	 * @return
	 */
	public int compose(Coord[] natural, Coord[] stretch, Coord[] shrink,
			int componentCount, int lineWidth, int[] breaks);
	
}
