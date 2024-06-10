package Pertemuan15;

public class GraphMatriks13 {
    int vertex;
    int[][] matrix;

    public GraphMatriks13(int v){
        vertex = v;
        matrix = new int[v][v];
    }
    
    public void makeEdge(int a, int t, int j){
        matrix[a][t] = j;
    }

    public void remEdge(int a, int t){
        matrix[a][t] = 0;
    }

    public void printGraph(){
        for (int i = 0; i < vertex; i++) {
            System.out.print("Gedung " + (char) ('A' + i) + " : ");
            for (int j = 0; j < vertex; j++) {
                if (matrix[i][j] !=-1) {
                    System.out.print("Gedung " + (char)('A' +j) + " (" + matrix[i][j] + " m), ");
                }
            }
            System.out.println("");
        }
    }

    public void degree(int a) {
        int totIn = 0, totOut = 0;
        
        for (int i = 0; i < vertex; i++) {
            // inDegree
            if (matrix[i][a] != 0) {
                totIn++;
            }
            // outDegree
            if (matrix[a][i] != 0) {
                totOut ++;
            }
        }

        System.out.println("InDegree dari Gedung " + (char) ('A' + a) + ": " + totIn);
        System.out.println("OutDegree dari Gedung " + (char) ('A' + a) + ": " + totOut);
        System.out.println("Degree dari Gedung " + (char) ('A' + a) + ": " + (totIn + totOut));
    }

}
