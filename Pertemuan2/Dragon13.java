package Pertemuan2;

public class Dragon13 {
    int x = 4, y = 6, width = 10, height = 10;

    void moveLeft() {
        x -= 1;
        if (x < 0) {
            detectCollision(x, y);
        }
    }

    void moveRight() {
        x += 1;
        if (x > width) {
            detectCollision(x, y);
        }
    }

    void moveUp() {
        y += 1;
        if (y > height) {
            detectCollision(x, y);
        }
    }

    void moveDown() {
        y -= 1;
        if (y < 0) {
            detectCollision(x, y);
        }
    }

    void printPosition() {
        System.out.println("Posisi X = " + x);
        System.out.println("Posisi Y = " + y);
    }

    void detectCollision(int x, int y) {
        System.out.println("GAME OVER");
        System.out.println("Anda nabrak tembok");
        System.out.println("Posisi X = " + x);
        System.out.println("Posisi Y = " + y);

    }

    public Dragon13() {

    }

}
