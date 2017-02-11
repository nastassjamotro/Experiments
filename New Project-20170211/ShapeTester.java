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
        System.out.println("Surface Area of Box: " + box.getSurfaceArea);
        System.out.println("Volume of Box: " + box.getVolume);
    }
}
