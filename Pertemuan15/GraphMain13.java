package Pertemuan15;

public class GraphMain13 {
    public static void main(String[] args) throws Exception {
        System.out.println("\n\n");
        Graph13 g = new Graph13(6);
        g.addEdge(0, 1, 50);
        g.addEdge(0, 2, 100);
        g.addEdge(1, 3, 70);
        g.addEdge(2, 3, 40);
        g.addEdge(3, 4, 60);
        g.addEdge(4, 5, 80);
        // g.degree(0);
        // g.printGraph();
        // g.remEdge(1, 3);
        // g.printGraph();

        GraphMatriks13 gdg = new GraphMatriks13(4);
        gdg.makeEdge(0, 1, 50);
        gdg.makeEdge(1, 0, 60);
        gdg.makeEdge(1, 2, 70);
        gdg.makeEdge(2, 1, 80);
        gdg.makeEdge(2, 3, 40);
        gdg.makeEdge(3, 0, 90);
        gdg.printGraph();
        System.out.println("Hasil setelah penghapusan edge");
        gdg.remEdge(2, 1);
        gdg.printGraph();
    }
}
