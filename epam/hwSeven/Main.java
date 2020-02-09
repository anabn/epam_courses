package epam.hwSeven;

import java.text.DecimalFormat;

public class Main {

    private static String circle = "Circle";
    private static String rectangle = "Rectangle";
    private static String triangle = "Triangle";

    private double generalArea(Shape[] shapes){
        double area = 0;
        for (Shape elem: shapes){
            area += elem.calcArea();
        }
        return area;
    }
    private double chosenArea( Shape[] shapes, String figure){
        double area = 0;
        for (int i = 0; i < shapes.length; i++) {
            if ((shapes[i].getClass().getSimpleName()).equals(figure)) {
                area += shapes[i].calcArea();
            }
        }
        return area;
    }

    public static void main(String[] args) {
        Main main = new Main();
        Shape[] shapes = {
                new Circle("red", 11.2),
                new Circle("blue", 11),
                new Circle("pink", 2),
                new Rectangle("red", 2, 1),
                new Rectangle("grey", 11, 22),
                new Rectangle("blue", 12, 1),
                new Rectangle("black", 7, 5),
                new Triangle("grey", 2, 4, 5),
                new Triangle("green", 5, 6, 10),
        };
        for (Shape elem: shapes) {
            System.out.println(elem);
        }
        DecimalFormat df = new DecimalFormat("###.###");
        System.out.println("General area = " + df.format(main.generalArea(shapes)));
        System.out.println("Area of Circle = " + df.format(main.chosenArea(shapes, circle)));
        System.out.println("Area of Rectangle = " + df.format(main.chosenArea(shapes, rectangle)));
        System.out.println("Area of Triangle = " + df.format(main.chosenArea(shapes, triangle)));
    }
}
