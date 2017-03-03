package shapes;

public class ShapeDemo {
     public static void main(String[] args) {
          // Shape s = new Shape();
          
          Cirlce c = new Cirlce(10);
          System.out.println("Cirlce(10): " + c);
          
          Triangle t = new Triangle(6, 7, 12);
          System.out.println("Triangle(6, 7, 12): " + t);
          
          Rectangle r = new Rectangle(5, 9);
          System.out.println("Rectangle(5, 9): " + r);
          
          Square s = new Square(3);
          System.out.println("Square(3): " + s);
     }          
}     
