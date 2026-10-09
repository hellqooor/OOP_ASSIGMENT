public class Main {
    public static void main(String[] args) {

        Shape[] genshape = new Shape[4];
        genshape[0] = new Shape("Cyan");
        genshape[1] = new Rectangle(6.0, "Gold");
        genshape[2] = new Circle(14.0, "Scarlett");
        genshape[3] = new Cylinder(8.0, 7.0, "Violett");
        
        System.out.println("=== Shape ===");
        genshape[0].printInfo();
        System.out.println();

        System.out.println("=== Rectangle ===");
        genshape[1].printInfo();
        System.out.println();

        System.out.println("=== Circle ===");
        genshape[2].printInfo();
        System.out.println();

        System.out.println("== Cylinder ===");
        genshape[3].printInfo();
        System.out.println();
    }
}
