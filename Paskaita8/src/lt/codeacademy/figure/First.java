package lt.codeacademy.figure;

public class First {

    static void printSpace() {
        System.out.println("---------------------");
    }

    public static void main(String[] args) {
        Figure triangle = new Figure();
        triangle.setFigureName("Triangle");
        triangle.setHeight(5);
        triangle.setWidth(6);
        System.out.println("Figure name : " + triangle.getFigureName());
        System.out.println("Figure height : " + triangle.getHeigth());
        System.out.println("Figure width : " + triangle.getWidth());
        System.out.println("Figure area : " + triangle.getArea());

        printSpace();

        Figure square = new Figure();
        square.setFigureName("Square");
        square.setHeight(10);
        square.setWidth(10);
        System.out.println("Figure name : " + square.getFigureName());
        System.out.println("Figure height : " + square.getHeigth());
        System.out.println("Figure width : " + square.getWidth());
        System.out.println("Figure area : " + square.getArea());

        printSpace();

        Figure rectangle = new Figure();
        rectangle.setFigureName("Rectangle");
        rectangle.setHeight(15);
        rectangle.setWidth(10);
        System.out.println("Figure name : " + rectangle.getFigureName());
        System.out.println("Figure height : " + rectangle.getHeigth());
        System.out.println("Figure width : " + rectangle.getWidth());
        System.out.println("Figure area : " + rectangle.getArea());


    }
}
