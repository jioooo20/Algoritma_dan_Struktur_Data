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

}
