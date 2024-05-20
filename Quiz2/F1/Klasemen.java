package Quiz2.F1;

public class Klasemen {
    public static Pos head;
    public static int size;
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

    public void ResultFinal() {
        if (!isEmpty()) {
            Pos driver = head;
            Driver.no = 1;
            while (driver != null) {
                driver.data.infoDriverFInal();
                driver = driver.next;
                Driver.no++;
            }
            System.out.println("=====================================================");
        } else {
            System.out.println("tidak ada balapan");
        }
    }

    public void Result() {
        if (!isEmpty()) {
            Pos driver = head;
            System.out.println("===============================================");
            System.out.printf("| %-6s | %-25s | %-6s |\n", "FINISH", "DRIVER", "START");
            System.out.println("-----------------------------------------------");
            while (driver != null) { // yg ngga 0
                // System.out.println(driver.data.infoDriver());
                driver.data.infoDriver();
                driver = driver.next;
            }
            
            System.out.println("===============================================");
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
