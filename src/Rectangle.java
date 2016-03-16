public class Rectangle<T, K> {
    private T width;
    private K height;
    public Rectangle(T width, K height) {
        this.width = width;
        this.height = height;
    }


    public int calculateArea() {
        return (Integer) width * (Integer) height;
    }

    public int calculateParimeter() {
        return (Integer) width * (Integer) height;
    }
}
