public class TestShape {
    public static void main(String[] args) {
        Shape s1 = new Shape();
        System.out.println("s1 (default constructor):");
        System.out.println("color   = " + s1.getColor());
        System.out.println("filled  = " + s1.isFilled());
        System.out.println("toString= " + s1.toString());

        s1.setColor("blue");
        s1.setFilled(false);
        System.out.println("\ns1 (after setColor/setFilled):");
        System.out.println("color   = " + s1.getColor());
        System.out.println("filled  = " + s1.isFilled());
        System.out.println("toString= " + s1.toString());

        Shape s2 = new Shape("red", true);
        System.out.println("\ns2 (parameterized constructor):");
        System.out.println("color   = " + s2.getColor());
        System.out.println("filled  = " + s2.isFilled());
        System.out.println("toString= " + s2.toString());
    }
}
