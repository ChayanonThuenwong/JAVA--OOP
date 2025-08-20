import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Aircraft ar1 = new Aircraft();
        ar1.setSeries("B2 - Spirit");
        ar1.setID("Northrop Grumman - Aircraft");
        ar1.setSpeed("1587");
        ar1.Display();

        Plane ar2 = new Plane();
        ar2.setSeries("Boeing 747");
        ar2.setID("Boeing");
        ar2.setSpeed("682");
        ar2.setAttendant(270);
        ar2.Display();
        ar2.PlaneDisplay();
    }
}