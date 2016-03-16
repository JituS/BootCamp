import org.junit.Test;
import static org.junit.Assert.*;
public class RectangleTest {
    @Test
    public void testcalculateArea_should_return_area_of_rectangle() throws Exception {
        Rectangle<Integer, Integer> rectangle = new Rectangle<>(10, 10);
        int area = rectangle.calculateArea();
        assertEquals(area,100);
    }
    @Test
    public void testcalculateArea_should_return_area_of_rectangle_if_width_and_height_both_are_zero() throws Exception {
        Rectangle<Integer, Integer> rectangle = new Rectangle<>(0, 0);
        int area = rectangle.calculateArea();
        assertEquals(area,0);
    }

    @Test
    public void testcalculateParimeter_should_return_perimeter_of_rectangle() throws Exception {
        Rectangle<Integer, Integer> rectangle = new Rectangle<>(10, 10);
        int parimeter = rectangle.calculateParimeter();
        assertEquals(parimeter,40);

    }
}
