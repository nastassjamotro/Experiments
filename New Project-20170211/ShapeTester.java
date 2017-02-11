import java.util.Scanner;

public class ShapeTester{
    public static void main(String[] args) {
        int boxW, boxL, boxH;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter width of box: ");
        boxW = scan.nextInt();
        System.out.println("Enter length of box: ");
        boxL = scan.nextInt();
        System.out.println("Enter height of box: ");
        boxH = scan.nextInt();
        Box box = new Box(boxL, boxW, boxH);
        System.out.println("Surface Area of Box: " + box.getSurfaceArea());
        System.out.println("Volume of Box: " + box.getVolume());
        
        int sphereR;
        System.out.println("Enter radius of sphere: ");
        sphereR = scan.nextInt();
        Sphere sphere = new Sphere(sphereR);
        System.out.println("Surface Area of Sphere: " + sphere.getSurfaceArea());
        System.out.println("Volume of Sphere: " + sphere.getVolume());
        
        int pyramidH, pyramidB;
        System.out.println("Enter height of pyramid: ");
        pyramidH = scan.nextInt();
        System.out.println("Enter base length of pyramid: ");
        pyramidB = scan.nextInt();
        Pyramid pyramid = new Pyramid(pyramidH, pyramidB);
        System.out.println("Surface Area of Pyramid: " + pyramid.getSurfaceArea());
        System.out.println("Volume of Sphere: " + pyramid.getVolume());
    }
}
