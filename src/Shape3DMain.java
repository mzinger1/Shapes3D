import java.util.ArrayList;

public class Shape3DMain {
    public static void main(String[] args) {

        ArrayList<Shape> shapeList = new ArrayList<>();

        shapeList.add(new RectangularPrism(4, 6, 10));
        shapeList.add(new TriangularPrism(5, 14));

        printRectangularPrism((RectangularPrism) shapeList.get(0));
        printTriangularPrism((TriangularPrism) shapeList.get(1));


    }

    public static void printRectangularPrism(RectangularPrism prism) {
        System.out.println("Length: " + prism.getLength());
        System.out.println("Width: " + prism.getWidth());
        System.out.println("Height: " + prism.getHeight());
    }

    public static void printTriangularPrism(TriangularPrism prism) {
        System.out.println("Side Length: " + prism.getSideLength());
        System.out.println("Height: " + prism.getHeight());

    }

}
