package shapes;

public class Main {
    
    public static void main(String[] args) {
        
        Shape circle1 = new Circle(5);
        Shape rectangle1 = new Rectangle(10, 20);
        Shape triangle1 = new Triangle(5, 10);
        
        ShapeAreaCalculator shapeAreaCalculator = new ShapeAreaCalculator();

        shapeAreaCalculator.setAreaCalculationStrategy(new CircleAreaCalculationStrategy());
        double circleArea = shapeAreaCalculator.calculateArea(circle1);
        
        shapeAreaCalculator.setAreaCalculationStrategy(new RectangleAreaCalculationStrategy());
        double rectangleArea = shapeAreaCalculator.calculateArea(rectangle1);
        
        shapeAreaCalculator.setAreaCalculationStrategy(new TriangleAreaCalculationStrategy());
        double triangleArea = shapeAreaCalculator.calculateArea(triangle1);
        
        System.out.println("Circle Area: " + circleArea);
        System.out.println("Rectangle Area: " + rectangleArea);
        System.out.println("Triangle Area: " + triangleArea);
    }
    
}
