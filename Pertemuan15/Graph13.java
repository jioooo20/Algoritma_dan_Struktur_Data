package Pertemuan15;

public class Graph13 {
    int vertex;
    doubleLinkedLists list[];

    public Graph13(int v) {
        vertex = v;
        list = new doubleLinkedLists[v];
        for (int i = 0; i < v; i++) {
            list[i] = new doubleLinkedLists();
        }
    }

    public void addEdge(int a, int t, int j) {
        list[a].addFirst(t, j);
        // list[t].addFirst(a, j);

    }

    public void degree(int a) throws Exception {
        int k, totIN = 0, totOUT = 0;
        for (int i = 0; i < vertex; i++) {
            // inDegree
            for (int j = 0; j < list[i].size(); j++) {
                if (list[i].get(j) == a) {
                    ++totIN;
                }
            }
            // outDegree
            for (k = 0; k < list[a].size(); k++) {
                list[a].get(k);
            }
            totOUT = k;
        }
        System.out.println("InDegree dari Gedung " + (char) ('A' + a) + ": " + totIN);
        System.out.println("OutDegree dari Gedung " + (char) ('A' + a) + ": " + totOUT);
        System.out.println("Degree dari Gedung " + (char) ('A' + a) + ": " + (totIN + totOUT));
        // System.out.println("Degree dari Gedung " + (char) ('A' + a) + ": " +
        // list[a].size());
    }

    public void remEdge(int a, int t) throws Exception {
        for (int i = 0; i < vertex; i++) {
            if (i == t) {
                list[a].remove(t);
            }
        }

    }

    public void remAllEdge() {
        for (int i = 0; i < vertex; i++) {
            list[i].clear();
        }
        System.out.println("Graf berhasil dikosongkan");
    }

    public void printGraph() throws Exception {
        for (int i = 0; i < vertex; i++) {
            if (list[i].size() > 0) {
                System.out.print("Gedung " + (char) ('A' + i) + " terhubung dengan ");
                for (int j = 0; j < list[i].size(); j++) {
                    System.out.print((char) ('A' + list[i].get(j)) + " (" + list[i].gerJarak(j) + " m), ");
                }
                System.out.println("");
            }
        }
        System.out.println("");
    }

    // percobaan 1 pertaynaan 5
    public boolean isPath(int start, int end) throws Exception {
        for (int i = 0; i < list[start].size(); i++) {
            if (list[start].get(i) == end) {
                return true;
            }
        }
        return false;
    }

    public void updateJarak(int a, int t, int j)throws Exception{
        for (int i = 0; i < list[a].size(); i++) {
            if (list[a].get(i) == t) {
                list[a].update(i, t, j);
                // list[a].head.inputTujuan(t);
                // list[a].head.inputJarak(j);
                return;
            }
        }
        System.out.println("Asal tidak ditemukan");
    }

    public void hitungEdge(){
        int totEdge = 0;

        for (int i = 0; i < vertex; i++) {
            totEdge += list[i].size();
        }

        System.out.println("Total Edge dalam Graph: " + totEdge);
    }

}