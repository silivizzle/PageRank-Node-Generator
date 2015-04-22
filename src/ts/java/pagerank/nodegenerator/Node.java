package ts.java.pagerank.nodegenerator;

import java.util.Random;

public class Node {
	
	private int pageId, lowerLimit, upperLimit, numLinks;
	private double rank;
	private int[] outLinks = null;
	private Random random = new Random();
	
	public Node(){
		
	}
	
	public Node(int pageId, int lowerLimit, int upperLimit, double rank){
		
		this.pageId = pageId;
		this.lowerLimit = lowerLimit;
		this.upperLimit = upperLimit;
		this.rank = rank;
		numLinks = 1 + random.nextInt((upperLimit - lowerLimit));
		outLinks = new int[numLinks];		
	
	}

	public int getPageId() {
		return pageId;
	}

	public void setPageId(int pageId) {
		this.pageId = pageId;
	}

	public int getLowerLimit() {
		return lowerLimit;
	}

	public void setLowerLimit(int lowerLimit) {
		this.lowerLimit = lowerLimit;
	}

	public int getUpperLimit() {
		return upperLimit;
	}

	public void setUpperLimit(int upperLimit) {
		this.upperLimit = upperLimit;
	}

	public int[] getAllOutLinks() {
		return outLinks;
	}
	
	public int getOutlink(int index){
		return outLinks[index];
	}

	public void setAllOutLinks(int[] outLinks) {
		this.outLinks = outLinks;
	}
	
	public void setOutLink(int index, int pageId){
		this.outLinks[index] = pageId;
	}

	public Random getRandom() {
		return random;
	}

	public void setRandom(Random random) {
		this.random = random;
	}

	public void setNumLinks(int numLinks) {
		this.numLinks = numLinks;
	}

	public int getNumLinks() {
		return numLinks;
	}

	public double getRank() {
		return rank;
	}

	public void setRank(double rank) {
		this.rank = rank;
	}

	public int[] getOutLinks() {
		return outLinks;
	}

	public void setOutLinks(int[] outLinks) {
		this.outLinks = outLinks;
	}
	
	

}
