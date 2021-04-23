package nets150_hw5;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		WikiScraper scraper = new WikiScraper("Frank_Gehry", "United_States", 100, 5);
		Graph g = scraper.getGraph();
		g.printGraph();
	}

}
