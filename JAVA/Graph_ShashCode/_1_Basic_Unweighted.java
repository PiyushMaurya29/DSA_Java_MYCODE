public class _1_Basic_Unweighted {
    public void printGraph(){
        for(int i=0 ; i<adjMatrix.length ; i++){
            System.out.print("Row "+i+" ->");
            for(int j=0 ; j<adjMatrix[i].length ; j++){
                System.out.print(adjMatrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    int adjMatrix[][];
    _1_Basic_Unweighted(int nodes){
        adjMatrix = new int[nodes][nodes];
    }
    public void addEdgesInMatrix(int edges[][], boolean isDirected){
        for(int edge[] : edges){
            int u = edge[0];
            int v = edge[1];
            if(isDirected){
                // Directed Graph
                adjMatrix[u][v] = 1;
            }else{
                // Undirected Graph
                adjMatrix[u][v] = 1;
                adjMatrix[v][u] = 1;
            }
        }
    }
    public static void main(String[] args) {
        int edges[][] = {{0,2}, {0,1}, {1,3}};
        int nodes = 4;
        System.out.println("Undirected Graph ->");
        _1_Basic_Unweighted graphUndirected = new _1_Basic_Unweighted(nodes);
        graphUndirected.addEdgesInMatrix(edges, false);
        graphUndirected.printGraph();

        System.out.println("Directed Graph ->");
        _1_Basic_Unweighted graphDirected = new _1_Basic_Unweighted(nodes);
        graphDirected.addEdgesInMatrix(edges, true);
        graphDirected.printGraph();

    }
}
