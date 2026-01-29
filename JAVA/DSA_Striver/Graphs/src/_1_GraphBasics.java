import java.util.ArrayList;

public class _1_GraphBasics {
    public static void main(String[] args) {
//        // 1st Method Using 2D Matrix SC = O(n^2)
//        int n = 3; // Number of vertices
//        int m = 3; // Number of edges
//
//        int[][] adj = new int[n+1][m+1]; // Adjacency Matrix
//        /*
//            adj[u][v] = 1;
//            adj[v][u] = 1;
//         */
//        // Edge 1--2 // Given in the question
//        adj[1][2] = 1;
//        adj[2][1] = 1;
//
//        // Edge 2--3
//        adj[2][3] = 1;
//        adj[3][2] = 1;
//
//        // Edge 1--3
//        adj[1][3] = 1;
//        adj[3][1] = 1;

        // 2nd Method Using ArrayList SC = O(2m)
        int n = 3;
        int m = 3;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i=0 ; i<=n ; i++){
            adj.add(new ArrayList<>());
        }
        /*
            adj.get(u).add(v)
            adj.get(v).add(u)
         */
        // In case of directed graphs add as per the requirements
        // Edge 1--2
        adj.get(1).add(2);
        adj.get(2).add(1);

        // Edge 2--3
        adj.get(2).add(3);
        adj.get(3).add(2);

        // Edge 1--3
        adj.get(1).add(3);
        adj.get(3).add(1);

        // Print all the edges
        for(int i=1 ; i<n ; i++){
            for(int j=0 ; j<adj.get(i).size() ; j++){
                System.out.println(adj.get(i).get(j)+" ");
            }
            System.out.println();
        }
    }
}
