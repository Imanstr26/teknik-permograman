package no1;
public class TestCylinder { // save as "TestCylinder.java"
    public static void main(String[] args) {
        
        // Declare and allocate a new instance of cylinder
        // with default color, radius, and height
        Cylinder c1 = new Cylinder();
        System.out.println("Cylinder1:" 
            + "\n radius= " + c1.getRadius() 
            + "\n height= " + c1.getHeight() 
            + "\n base area= " + c1.getArea() 
            + "\n volume= " + c1.getVolume()
            + "\n toString= " + c1.toString()
        );

        // Declare and allocate a new instance of cylinder
        // specifying height, with default color and radius
        Cylinder c2 = new Cylinder(10.0);
        System.out.println("\nCylinder2:" 
            + "\n radius= " + c2.getRadius() 
            + "\n height= " + c2.getHeight() 
            + "\n base area= " + c2.getArea() 
            + "\n volume= " + c2.getVolume()
            + "\n toString= " + c2.toString());

        // Declare and allocate a new instance of cylinder
        // specifying radius and height, with default color
        Cylinder c3 = new Cylinder(2.0, 10.0);
        System.out.println("\nCylinder3:\n" 
            + " radius= " + c3.getRadius() 
            + "\n height= " + c3.getHeight() 
            + "\n base area= " + c3.getArea() 
            + "\n volume= " + c3.getVolume()
            + "\n toString= " + c3.toString());
    }
}
