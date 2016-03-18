package shape;

import exceptions.*;

public class Rectangle {
    private final double width;
    private final double height;

    public static Rectangle create(double width, double height) throws InvelidSidesException {
        if(width <= 0 || height <= 0) {
            throw new InvelidSidesException();
        }
        return new Rectangle(width, height);
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }


    public double calculateArea() {
        return (width * height);
    }

    public double calculateParimeter() {
        return 2*(width + height);
    }
}
