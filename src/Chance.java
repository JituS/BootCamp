public class Chance {

    private final double chance;

    public Chance(double chance) {
        this.chance = chance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Chance chance = (Chance) o;
        return Double.compare(chance.chance, this.chance) == 0;
    }

    public Chance not() {
        return new Chance(1 - this.chance);
    }

    public Chance and(Chance anotherChnace) {
        return new Chance(this.chance * anotherChnace.chance);
    }

    public Chance or(Chance anotherChance) {
        return new Chance(1 - ((1-this.chance) * (1-anotherChance.chance)));
    }
}
