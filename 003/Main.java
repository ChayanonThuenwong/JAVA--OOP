public class Main {
    public static void main(String[] args){
        Aircraft ar1 = new Aircraft();
        ar1.setSeries("F16");
        ar1.setID("Lockheed Martin - Aircraft");
        ar1.setSpeed("1240");
        ar1.Display();

        // Constructor of Class \\
        Aircraft ar2 = new Aircraft();
        ar2.Display();
    }
}