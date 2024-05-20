package Quiz2.F1;

public class Pos {
    Driver data;
    Pos prev, next;

    public Pos(Pos p, Driver d, Pos n){
        prev = p;
        data = d;
        next = n;
    }
}
