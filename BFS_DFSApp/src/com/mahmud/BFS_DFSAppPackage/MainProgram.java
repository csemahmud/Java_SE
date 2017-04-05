/**
 * 
 */
package com.mahmud.BFS_DFSAppPackage;

import java.util.Scanner;

/**
 * @author Mahmudul Hasan Khan CSE
 *
 */
public class MainProgram {
	
	private final static boolean[][] duGraph;
	/// duGraph[0 : totalVertices-1][0 : totalVertices-1] has been
	/// declared as a global variable. So, all the
	/// vertices are assigned false. That is,
	/// All vertices have been marked unvisited.

	private final static boolean[] visitedBFS;
	/// visitedBFS[0 : totalVertices-1] has been
	/// declared as a global variable. So, all the
	/// vertices are assigned false. That is,
	/// All vertices have been marked unvisited.
	
	private final static boolean[] visitedDFS;
	/// visitedDFS[0 : totalVertices-1] has been
	/// declared as a global variable. So, all the
	/// vertices are assigned false. That is,
	/// All vertices have been marked unvisited.
	
	static {
		
		duGraph = new boolean[10000][10000];
		visitedBFS = new boolean[10000];
		visitedDFS = new boolean[10000];
		
	}
	
	private static int totalVertices;

	///* Algorithm : BASIC TRAVERSAL TECHNIQUES */
	///* Problem : Depth First Search */
	///* Author : Mahmudul Hasan Khan CSE */

	private static void DFS(int currentVertex)

	/// Given an undirected or directed graph,
	/// duGraph[0 : totalVertices-1][0 : totalVertices-1] = (V, E) with
	/// totalVertices numbered vertices with
	/// an array visitedDFS[] initially set
	/// to false, this algorithm visits all vertices
	/// reachable from currentVertex.
	/// duGraph[0 : totalVertices-1][0 : totalVertices-1]
	/// and visitedDFS[] are global

	{
		System.out.print("\t" + (currentVertex + 1) + ",");
		visitedDFS[currentVertex] = true;
		for (int adjacentVertex = 0;
			adjacentVertex < totalVertices; adjacentVertex++) {
			if ((duGraph[currentVertex][adjacentVertex])
				&& (!visitedDFS[adjacentVertex])) {
				DFS(adjacentVertex);
			}
		}
	}

	/**
	 * 
	 */
	public MainProgram() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean isDirected;
		int i;
		int row;
		int col;

		System.out.println("\n\n");

		///* Sample Input */
//		duGraph[1-1][2-1] = true;
//		duGraph[1-1][3-1] = true;
//		duGraph[1-1][4-1] = true;
//		duGraph[2-1][5-1] = true;
//		duGraph[5-1][6-1] = true;
//		duGraph[7-1][3-1] = true;
//		duGraph[7-1][4-1] = true;
//		duGraph[7-1][5-1] = true;
//		duGraph[8-1][7-1] = true;
//		totalVertices = 8;
//		isDirected = true;
		
		try(Scanner scanner = new Scanner(System.in)){
			
			char key = 'Y';
			while (Character.toLowerCase(key) == 'y') {
				int vertex;
				try{
					System.out.println("\tIs this Graph Directed or Undirected ? Enter it : ");
					System.out.println("\ty for Directed Graph Or, ");
					System.out.print("\tn for Undirected Graph : ");
					Character du = scanner.next().charAt(0);
		
					switch (Character.toLowerCase(du)) {
						case 'y':
							isDirected = true;
							System.out.print("\n\tHow many Edges in this Directed Graph ? Enter it : ");
							break;
						default:
							isDirected = false;
							System.out.print("\n\tHow many Edges in this Undirected Graph ? Enter it : ");
							break;
					}
		
					int edges;
					totalVertices = 0;
		
					edges = scanner.nextInt();
		
					for (i = 0; i < edges; i++) {
						int u;
						int v;
		
						System.out.print("\n\tFor Edge "
								+ (i + 1) +", Enter Start Vertex, u : ");
						u = scanner.nextInt();
						System.out.print("\n\tEnter End Vertex, v : ");
						v = scanner.nextInt();
						if (totalVertices < u) {
							totalVertices = u;
						}
						if (totalVertices < v) {
							totalVertices = v;
						}
						u--;
						v--;
						duGraph[u][v] = true;
						if (!isDirected) {
							duGraph[v][u] = true;
						}
					}
		
					for (i = 0; i < totalVertices; i++) {
						duGraph[i][i] = true;
					}
		
					if (isDirected){
						System.out.print("\tThe given DIRECTED Graph is : \n\n\t");
					} else {
						System.out.print("\n\tThe given UNDIRECTED Graph is : \n\n\t");
					}
		
					for (col = 1; col <= totalVertices; col++) {
						System.out.print("\t" + col );
					}
		
					for (row = 0; row < totalVertices; row++) {
						System.out.print("\n\t" + (row + 1));
						for (col = 0; col < totalVertices; col++) {
							if(duGraph[row][col]){
								System.out.print("\t1");
							} else {
								System.out.print("\t.");
							}
						}
					}
		
					System.out.println("\n\n\tIn above graph, row == Start Vertex and column == End Vertex.");
		
					System.out.println("\n\tGraph Traversal of all vertices by : ");
					System.out.println("\tBreadth First Search : ");
		
					///* Algorithm : BASIC TRAVERSAL TECHNIQUES */
					///* Problem : Breadth First Graph Traversal */
					///* Author : Mahmudul Hasan Khan CSE */
		
					/// Breadth First Traversal of duGraph
		
					for (vertex = 0; vertex < totalVertices; vertex++) {
						if (!visitedBFS[vertex]) {
		
							///* Algorithm : BASIC TRAVERSAL TECHNIQUES */
							///* Problem : Breadth First Search */
							///* Author : Mahmudul Hasan Khan CSE */
		
							/// A breadth first search of duGraph is carried out beginning
							/// at Vertex : vertex. For any node i, visitedBFS[i] = true if i has
							/// already been visited. The graph duGraph and array visitedBFS[]
							/// are global; visitedBFS[] is initialized to false.
		
							int currentVertex = vertex;
		
							System.out.print("\t" + (vertex + 1) + ",");
							visitedBFS[vertex] = true;
		
							int[] vQueue = new int[10000];
		
							/// vQueue[] is a queue of unexplored vertices.
		
							int qFront = 0;
							int qRear = 0;
		
							while (true) {
		
								for (int adjacentVertex = 0;
									adjacentVertex < totalVertices; adjacentVertex++) {
									if ((duGraph[currentVertex][adjacentVertex])
										&& (!visitedBFS[adjacentVertex])) {
										/// adjacentVertex is unexplored
		
										vQueue[qRear++] = adjacentVertex;
		
										System.out.print("\t" + (adjacentVertex + 1) + ",");
										visitedBFS[adjacentVertex] = true;
									}
								}
		
								if (qFront == qRear) {
									/// vQueue is empty and no unexplored vertex
		
									break;
								}
		
								currentVertex = vQueue[qFront++];
		
								/// Get first unexplored vertex
							}
						}
					}
		
					System.out.println("\n\n\tDepth First Search : ");
		
					///* Algorithm : BASIC TRAVERSAL TECHNIQUES */
					///* Problem : Depth First Graph Traversal */
					///* Author : Mahmudul Hasan Khan CSE */
		
					/// Depth First Traversal of duGraph
		
					for (vertex = 0; vertex < totalVertices; vertex++) {
						if (!visitedDFS[vertex]) {
							DFS(vertex);
						}
					}
					System.out.print("\n\n\tDo you want to try more ? [y/n] : ");
					key = scanner.next().charAt(0);
					// key = 'N';
					
					
				} catch (Exception ex) {
					// TODO: handle exception
					
					System.err.println("\t" + ex.getMessage());
					key = 'y';
					
				} finally {
					
					if (Character.toLowerCase(key) == 'y') {
						for (row = 0; row < totalVertices; row++) {
							for (col = 0; col < totalVertices; col++) {
								duGraph[row][col] = false;
							}
						}
		
						for (vertex = 0; vertex < totalVertices; vertex++) {
							visitedBFS[vertex] = false;
							visitedDFS[vertex] = false;
			
							/// Mark all vertices unvisited
						}
					}
				}
			}
		} catch (Exception ex) {
			// TODO: handle exception
			
			ex.printStackTrace();
		}
	}

}
