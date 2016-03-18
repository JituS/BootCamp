import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class ChanceTest {
    @Test

    public void findChances_should_return_probability_of_favourable_occurrence() throws Exception {
        ProbabilityCalculator probabilityCalculator = new ProbabilityCalculator(2d, 1d);
        Chance chance = probabilityCalculator.findChance();
        assertEquals(new Chance(0.5), chance);
    }
    @Test
    public void not_should_return_probability_of_non_favourable_occurrence() throws Exception {
        ProbabilityCalculator probabilityCalculator = new ProbabilityCalculator(6d, 1d);
        Chance chance = probabilityCalculator.findChance();
        assertEquals(new Chance(5/6d), chance.not());
    }
    @Test
    public void and_should_return_probability_of_both_chances_occurring_together() throws Exception {
        ProbabilityCalculator coin1 = new ProbabilityCalculator(2d, 1d);
        Chance coin1Chance = coin1.findChance();
        ProbabilityCalculator coin2 = new ProbabilityCalculator(2d, 1d);
        Chance coin2Chance = coin2.findChance();
        assertEquals(new Chance(1/4d), coin2Chance.and(coin1Chance));
    }
    @Test
    public void or_should_return_probability_of_one_state_occurring_from_two_chances() throws Exception {
        ProbabilityCalculator coin1 = new ProbabilityCalculator(2d, 1d);
        Chance coin1Chance = coin1.findChance();
        ProbabilityCalculator coin2 = new ProbabilityCalculator(2d, 1d);
        Chance coin2Chance = coin2.findChance();
        assertEquals(new Chance(3/4d), coin2Chance.or(coin1Chance));
    }
}