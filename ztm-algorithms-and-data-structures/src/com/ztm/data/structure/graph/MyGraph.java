package com.ztm.data.structure.graph;

import java.util.ArrayList;
import java.util.Hashtable;

/**
*
* brunolima on Apr 26, 2021
* 
*/

public class MyGraph {
	
	Hashtable<Integer, ArrayList<Integer>> adjacentList = new Hashtable<>();
	int numberOfNodes = 0;
	
	public void addVertex(int node) {
		adjacentList.put(node, new ArrayList<>());
		numberOfNodes++;
	}
	
	public void addEdge(int node1, int node2) {
		adjacentList.get(node1).add(node2);
		adjacentList.get(node2).add(node1);
	}
	
	public void showConnections() {
		Object[] keys = adjacentList.keySet().toArray();
		
		for (Object key : keys) {
			System.out.println(key + " ---> " + adjacentList.get(Integer.parseInt(key.toString())));
		}
		
		System.out.println();
	}
	
}

