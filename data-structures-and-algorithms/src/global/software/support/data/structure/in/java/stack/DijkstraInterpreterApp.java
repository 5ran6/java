package global.software.support.data.structure.in.java.stack;

/**
*
* brunolima on Jun 7, 2021
* 
*/

public class DijkstraInterpreterApp {
	
	public static void main(String[] args) {
		DijkstraInterpreter dijkstra = new DijkstraInterpreter();
		dijkstra.interpreterExpression("( ( 1 + 2 ) * ( 2 + 1 ) )");
		dijkstra.result();
	}

}

