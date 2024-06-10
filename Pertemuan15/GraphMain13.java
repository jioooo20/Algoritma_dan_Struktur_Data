package Pertemuan15;

import java.util.Scanner;

public class GraphMain13 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("\n\n");

        Graph13 gud = new Graph13(6);

        int pil = -1;
        while (pil != 0) {
            System.out.println("Menu");
            System.out.println("1. Add Edge");
            System.out.println("2. Remove Edge");
            System.out.println("3. Degree");
            System.out.println("4. Print Graph");
            System.out.println("5. Cek Edge");
            System.out.println("6. Update Jarak");
            System.out.println("7. Hitung Edge (dalam graph)");
            System.out.print("Masukkan Nomor Menu : ");
            pil = input.nextInt();
            input.nextLine();

            switch (pil) {
                case 1:
                    System.out.print("Masukkan Asal : ");
                    int a = input.nextInt();
                    input.nextLine();
                    System.out.print("Masukkan Tujuan : ");
                    int t = input.nextInt();
                    input.nextLine();
                    System.out.print("Masukkan Jarak : ");
                    int j = input.nextInt();
                    input.nextLine();
                    gud.addEdge(a, t, j);
                    break;

                case 2:
                    System.out.print("Masukkan Asal : ");
                    int aa = input.nextInt();
                    input.nextLine();
                    System.out.print("Masukkan Tujuan : ");
                    int tt = input.nextInt();
                    input.nextLine();
                    gud.remEdge(aa, tt);
                    break;

                case 3:
                    System.out.print("Masukkan Asal : ");
                    int aaa = input.nextInt();
                    input.nextLine();
                    gud.degree(aaa);
                    break;

                case 4:
                    gud.printGraph();
                    break;

                case 5:
                    System.out.print("Masukkan Asal : ");
                    int aaaaa = input.nextInt();
                    input.nextLine();
                    System.out.print("Masukkan Tujuan : ");
                    int ttttt = input.nextInt();
                    input.nextLine();

                    if (gud.isPath(aaaaa, ttttt)) {
                        System.out.println("Gedung " + (char) ('A' + aaaaa) + " dan " + (char) ('A' + ttttt)
                                + " bertetangga langsung.");
                    } else {
                        System.out.println("Gedung " + (char) ('A' + aaaaa) + " dan " + (char) ('A' + ttttt)
                                + " tidak bertetangga langsung.");
                    }
                    break;

                case 6:
                    System.out.print("Masukkan Asal : ");
                    int aaaaaa = input.nextInt();
                    input.nextLine();
                    System.out.print("Masukkan Tujuan : ");
                    int tttttt = input.nextInt();
                    input.nextLine();
                    System.out.print("Masukkan Jarak : ");
                    int jjjjjj = input.nextInt();
                    input.nextLine();
                    gud.updateJarak(aaaaaa, tttttt, jjjjjj);
                    break;

                case 7:
                    gud.hitungEdge();
                    break;

                default:
                    break;
            }

        }

        // Graph13 g = new Graph13(6);
        // g.addEdge(0, 1, 50);
        // g.addEdge(0, 2, 100);
        // g.addEdge(1, 3, 70);
        // g.addEdge(2, 3, 40);
        // g.addEdge(3, 4, 60);
        // g.addEdge(4, 5, 80);
        // g.degree(0);
        // g.printGraph();
        // g.remEdge(1, 3);
        // g.printGraph();

        // while (true) {
        // System.out.print("Masukkan gedung asal (0-5): ");
        // int start = input.nextInt();
        // System.out.print("Masukkan gedung tujuan (0-5): ");
        // int end = input.nextInt();

        // if (g.isPath(start, end)) {
        // System.out.println("Gedung " + (char) ('A' + start) + " dan " + (char) ('A' +
        // end) + " bertetangga langsung.");
        // } else {
        // System.out.println("Gedung " + (char) ('A' + start) + " dan " + (char) ('A' +
        // end) + " tidak bertetangga langsung.");
        // }

        // System.out.print("Apakah ingin mengecek lagi? (y/n): ");
        // char response = input.next().charAt(0);
        // if (response == 'n' || response == 'N') {
        // break;
        // }
        // }

        // GraphMatriks13 gdg = new GraphMatriks13(4);
        // gdg.makeEdge(0, 1, 50);
        // gdg.makeEdge(1, 0, 60);
        // gdg.makeEdge(1, 2, 70);
        // gdg.makeEdge(2, 1, 80);
        // gdg.makeEdge(2, 3, 40);
        // gdg.makeEdge(3, 0, 90);
        // gdg.printGraph();
        // System.out.println("Hasil setelah penghapusan edge");
        // gdg.remEdge(2, 1);
        // gdg.printGraph();
        // gdg.degree(0);

        input.close();
    }
}
