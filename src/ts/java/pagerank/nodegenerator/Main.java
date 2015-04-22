package ts.java.pagerank.nodegenerator;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {

	public static void main(String[] args) throws IOException {
		
		NodeList nodeList = new NodeList();
		int numNodes = 100, lowerLimit = 2, upperLimit = 10;
		File file = new File("data/input.txt");
		PrintWriter pw = new PrintWriter(file);
		
		nodeList.generateNodes(numNodes, lowerLimit, upperLimit);
		String nodes = nodeList.printList();
		pw.print(nodes);
		pw.close();
	}

}