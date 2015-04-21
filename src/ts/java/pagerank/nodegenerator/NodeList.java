package ts.java.pagerank.nodegenerator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NodeList {
	
	private int link;
	private List<Node> nodes = new ArrayList<Node>();
	private StringBuffer sb = new StringBuffer();
	private String list;
	
	public NodeList(){
		
	}
	
	public void generateNodes(int numNodes, int lowerLimit, int upperLimit){
		
		//Populate collection to allow for unique random links
		List<Integer> randomNode = new ArrayList<Integer>();
		for(int i = 0; i < numNodes; i++){
			randomNode.add(i + 1);
		}
		
		//Create the nodes
		for(int i = 1; i <= numNodes; i++){
			Node node = new Node(i, lowerLimit, upperLimit);
			
			//Add outlinks to each node
			Collections.shuffle(randomNode);
			for(int l = 0; l < node.getNumLinks(); l++){
				link = randomNode.get(l);
				node.setOutLink(l, link);
			}
			nodes.add(node);
		}

	}
	
	public String printList(){
		for(Node node : nodes){
			sb.append(node.getPageId() + "," + "0.5" + "\t");
			
			for(int i = 0; i < node.getNumLinks(); i++){
				sb.append(node.getOutlink(i) + ",");
			}
			sb.deleteCharAt(sb.length() - 1);
			sb.append("\n");			
		}
		list = sb.toString();
		return list;
		
	}

}
