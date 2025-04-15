package interfaces.calculaterarea;

public record Rectangle(double height, double width) implements GeometricForm{

    @Override
    public double getArea() {
        return height * width;
    }
    
}
