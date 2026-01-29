public class _2_Basic_Weighted {
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
    _2_Basic_Weighted(int nodes){
        adjMatrix = new int[nodes][nodes];
    }
    public void addEdgesInMatrix(int edges[][], boolean isDirected){
        for(int edge[] : edges){
            int u = edge[0];
            int v = edge[1];
            int w = edge[2];
            if(isDirected){
                adjMatrix[u][v] = w;
            }else{
                adjMatrix[u][v] = w;
                adjMatrix[v][u] = w;
            }
        }
    }
    public static void main(String[] args) {
        int edges[][] = {{0,2,10}, {0,1,2}, {1,3,30}};
        int nodes = 4;
        System.out.println("Weighted UnDirected Graph-> ");
        _2_Basic_Weighted graphUnDirected = new _2_Basic_Weighted(nodes);
        graphUnDirected.addEdgesInMatrix(edges, false);
        graphUnDirected.printGraph();

        System.out.println("Weighted Directed Graph-> ");
        _2_Basic_Weighted graphDirected = new _2_Basic_Weighted(nodes);
        graphUnDirected.addEdgesInMatrix(edges, true);
        graphUnDirected.printGraph();
    }
}
