package shapes;

public class RectangleAreaCalculationStrategy implements AreaCalculationStrategy {
    
    public double calculateArea(Shape shape) {
        
        return shape.getArea();
        
    }
    
}
