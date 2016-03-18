package shape;
import exceptions.InvelidSidesException;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import static org.junit.Assert.*;

public class SquareTest {
    private Square square10By10;

    @Before
    public void setUp() throws Exception {
        square10By10 = new Square(10d);
    }

    @Rule
    public ExpectedException thrown = ExpectedException.none();
    @Test
    public void calculateArea_should_return_area_of_square() throws InvelidSidesException {
        assertEquals(100d, square10By10.calculateArea(), 0);
    }
    @Test
    public void calculateArea_should_throw_an_exception_if_width_or_height_is_zero() throws InvelidSidesException {
        thrown.equals(InvelidSidesException.class);
        thrown.expectMessage("Sides should be positive value");
        Square square = Square.create(0d);
    }
}