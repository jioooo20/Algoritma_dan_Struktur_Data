package Pertemuan2;

public class DragonMain13 {
    public static void main(String[] args) {

        Dragon13 npc = new Dragon13();

        System.out.println("Posisi Awal");
        npc.printPosition();
        System.out.println("===================");
        npc.moveLeft();
        npc.moveLeft();
        npc.moveLeft();
        npc.moveDown();
        npc.moveRight();
        npc.moveUp();
        npc.moveUp();
        npc.moveUp();
        npc.moveUp();
        npc.moveLeft();
        npc.moveLeft();
        npc.moveLeft();
    }
}
