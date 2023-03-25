package shapes;

public class ShapeAreaCalculator {
    
    private AreaCalculationStrategy areaCalculationStrategy;

    public void setAreaCalculationStrategy(AreaCalculationStrategy areaCalculationStrategy) {
        
        this.areaCalculationStrategy = areaCalculationStrategy;
        
    }

    public double calculateArea(Shape shape) {
        
        return areaCalculationStrategy.calculateArea(shape);
        
    }
}
