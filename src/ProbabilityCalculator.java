public class ProbabilityCalculator {

    private double possibleOccurrence;
    private double favourableOccurrence;

    public ProbabilityCalculator(double possibleOccurrence, double favourableOccurrence) {
        this.possibleOccurrence = possibleOccurrence;
        this.favourableOccurrence = favourableOccurrence;
    }

    public Chance findChance() {
        return new Chance(favourableOccurrence / possibleOccurrence);
    }
}
