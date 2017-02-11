public class Box {
    // member variables
    private double length;
    private double width;
    private double height;
    
    public Box(double l, double w, double h) {
        length = l;
        width = w;
        height = h;
    }
    
    public double getSurfaceArea() {
        double surfaceArea = 2 * (length*height + width*height);
        return surfaceArea;
    }
    
    public double getVolume() {
        double volume = length * width * height;
        return volume;
    }
}
