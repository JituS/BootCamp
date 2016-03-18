package shape;

import exceptions.InvelidSidesException;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertEquals;
public class RectangleTest {
    private Rectangle rectangle10By10;

    @Before
    public void setUp() throws Exception {
        rectangle10By10 = new Rectangle(10d, 10d);
    }

    @Rule
    public ExpectedException thrown = ExpectedException.none();
    @Test
    public void calculateArea_should_return_area_of_rectangle() throws InvelidSidesException {
        assertEquals(100d, rectangle10By10.calculateArea(), 0);
    }
    @Test
    public void calculateArea_should_throw_an_exception_if_width_or_height_is_zero() throws InvelidSidesException {
        thrown.equals(InvelidSidesException.class);
        thrown.expectMessage("Sides should be positive value");
        Rectangle rectangle0By0 = Rectangle.create(0d, 0d);
    }
}
