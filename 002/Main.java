public class Main {
    public static void main(String[] args){
        Student std1 = new Student();
        std1.setName("Chayanon");
        std1.setSurename("Thuenwong");
        std1.setUniversity("Thammasat University");
        std1.setID("6810610045");
        std1.DisplayStudent();
        
        Student std2 = new Student();
        std2.setName("Rachata");
        std2.setSurename("Tharanate");
        std2.setUniversity("Burapha University");
        std2.setID("68040553");
        std2.DisplayStudent();
    }
}