package Quiz2.F1;

public class Klasemen {
    Pos head;
    int size;
    String tanggal;

    public Klasemen() {
        head = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void size() {
        System.out.println(size);
    }

    public void tanggal() {
        System.out.println(tanggal);
    }

    public void addTanggal(String t) {
        tanggal = t;
    }

    public void Result() {
        if (!isEmpty()) {
            Pos driver = head;
            Pos driverNol = head;
            System.out.println("=====================================================");
            System.out.printf("| %-6s | %-25s | %-7s | %-6s |\n", "FINISH", "DRIVER", "TOT PTS", "START");
            System.out.println("-----------------------------------------------------");
            while (driver != null) { // yg ngga 0
                // System.out.println(driver.data.infoDriver());
                driver.data.infoDriver();
                driver = driver.next;
            }
            while (driverNol != null) { // yg 0
                driverNol.data.infoDriverNol();
                driverNol = driverNol.next;
            }
            System.out.println("=====================================================");
            System.out.println(
                    " NOTES : NC is Not Completed karena kendala teknis \n atau lainnya seperti Diskualifikasi, Tidak Finish,\n Tidak Dalam Kualifier dan sebagainya");

        } else {
            System.out.println("tidak ada balapan");
        }
    }

    public void add(Driver d) {
        SistemPoin(d);
        if (isEmpty()) {
            head = new Pos(null, d, null);
        } else {
            Pos current = head;
            while (current.next != null) {
                current = current.next;
            }
            Pos newDriver = new Pos(current, d, null);
            current.next = newDriver;
        }
        size++;
    }

    public static int SumAllPts(Driver d1, Driver d2, Driver d3, Driver d4, Driver d5, Driver d6, Driver d7,
            Driver d8,
            Driver d9, Driver d10, Driver d11, Driver d12, Driver d13, Driver d14, Driver d15, Driver d16, Driver d17,
            Driver d18, Driver d19, Driver d20, Driver d21, Driver d22) {
        return d1.getPoin() + d2.getPoin() + d3.getPoin() + d4.getPoin() + d5.getPoin() + d6.getPoin() + d7.getPoin()
                + d8.getPoin() + d9.getPoin() + d10.getPoin() + d11.getPoin() + d12.getPoin() + d13.getPoin()
                + d14.getPoin() + d15.getPoin() + d16.getPoin() + d17.getPoin() + d18.getPoin() + d19.getPoin()
                + d20.getPoin() + d21.getPoin() + d22.getPoin();
    }

    void insertionSortDescPTS() {
        if (head == null || head.next == null) {
            return;
        }
        Pos sorted = null;
        Pos current = head;

        while (current != null) {
            Pos next = current.next;
            if (sorted == null || sorted.data.poin < current.data.poin) {
                current.next = sorted;
                if (sorted != null) {
                    sorted.prev = current;
                }
                sorted = current;
                sorted.prev = null;
            } else {
                Pos temp = sorted;
                while (temp.next != null && temp.next.data.poin > current.data.poin) {
                    temp = temp.next;
                }
                current.next = temp.next;
                if (temp.next != null) {
                    temp.next.prev = current;
                }
                temp.next = current;
                current.prev = temp;
            }
            current = next;
        }
        head = sorted;
        // System.out.println("=====================================================");
        // System.out.println("| KLASEMEN FINAL |");
        // System.out.println("-----------------------------------------------------");
        // System.out.printf("| %-6s | %-25s | %-3s | %-6s |\n", "FINISH", "DRIVER",
        // "PTS", "START");
        // System.out.println("-----------------------------------------------------");

        // // Menggunakan sorted untuk mencetak data driver yang telah diurutkan
        // Pos temp = sorted;
        // while (temp != null) {
        // temp.data.infoDriver();
        // temp = temp.next;
        // }
        // System.out.println("=====================================================");
    }

    void insertionSortAscFinish() {
        if (head == null || head.next == null) { // 1
            return; // 2
        }
        Pos sorted = null; // 3
        Pos current = head; // 4

        while (current != null) { // 5
            Pos next = current.next;// 6
            if (sorted == null || sorted.data.finish_pos >= current.data.finish_pos) {// 7 angka terkecil telah disortir
                                                                                      // > angka current
                current.next = sorted;// 8 /
                if (sorted != null) {// 9
                    sorted.prev = current;// 10
                }
                sorted = current;// 11
                sorted.prev = null;// 12

            } else { // angka current > dari angka terkecil yang telah di sortir
                Pos temp = sorted;// 13
                while (temp.next != null && temp.next.data.finish_pos < current.data.finish_pos) {// 14
                    temp = temp.next;// 15
                }
                current.next = temp.next;// 16
                if (temp.next != null) {// 17
                    temp.next.prev = current;// 18
                }
                temp.next = current;// 19
                current.prev = temp;// 20
            }
            current = next;// 21
        }
        head = sorted;
        // System.out.println("=====================================================");
        // System.out.println("| KLASEMEN SEMENTARA |");
        // System.out.println("-----------------------------------------------------");
        // System.out.printf("| %-6s | %-25s | %-3s | %-6s |\n", "FINISH", "DRIVER",
        // "PTS", "START");
        // System.out.println("-----------------------------------------------------");
        // while (sorted != null) {
        // // System.out.println(driver.data.infoDriver());
        // sorted.data.infoDriver();
        // sorted = sorted.next;
        // }
        // System.out.println("=====================================================");
    }

    public void SistemPoin(Driver d) {
        switch (d.finish_pos) {
            case 1:
                d.First();
                break;
            case 2:
                d.Second();
                break;
            case 3:
                d.Third();
                break;
            case 4:
                d.Fourth();
                break;
            case 5:
                d.Fiveth();
                break;
            case 6:
                d.Sixth();
                break;
            case 7:
                d.Seventh();
                break;
            case 8:
                d.Eighth();
                break;
            case 9:
                d.Nineth();
                break;
            case 10:
                d.Tenth();
                break;
            default:
                d.OverTen();
                break;

        }
    }
}
