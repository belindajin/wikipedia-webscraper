package nets150_hw5;

public class Edge {
	private String start;
	private String end;
	
	/**
	 * 
	 * @param start node
	 * @param end node
	 */
	public Edge(String start, String end) {
		this.start = start;
		this.end = end;
	}
	
	/**
	 * 
	 * @return start node
	 */
	public String getStart() {
		return start;
	}
	
	/**
	 * 
	 * @return end node
	 */
	public String getEnd() {
		return end;
	}
	
	@Override
	public boolean equals(Object o) {
		super.equals(o);
		boolean equal = false;
		if (o instanceof Edge && o != null) {
			Edge e = (Edge) o;
			equal = e.start.equals(this.start) && e.end.equals(this.end);
		}
		return equal;
	}
}
