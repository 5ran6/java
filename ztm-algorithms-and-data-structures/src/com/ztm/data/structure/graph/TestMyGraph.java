package com.ztm.data.structure.graph;

/**
*
* brunolima on Apr 26, 2021
* 
*/

public class TestMyGraph {
	
	public static void main(String[] args) {
		MyGraph graph = new MyGraph();
		graph.addVertex(0);
		graph.showConnections();
		
		graph.addVertex(1);
		graph.showConnections();
		
		graph.addVertex(2);
		graph.showConnections();
		
		graph.addVertex(3);
		graph.showConnections();
		
		graph.addVertex(4);
		graph.showConnections();
		
		graph.addVertex(5);
		graph.showConnections();
		
		graph.addVertex(6);
		graph.showConnections();
		
		graph.addEdge(3, 1);
		graph.addEdge(3, 4);
		graph.addEdge(4, 2);
		graph.addEdge(4, 5);
		graph.addEdge(1, 2);
		graph.addEdge(1, 0);
		graph.addEdge(0, 2);
		graph.addEdge(6, 5);
		graph.showConnections();
	}

}

