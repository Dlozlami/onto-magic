package ontomagic;

/**
 * One constantly shifts between frequencies.
 * A Belief is what keeps a frequency unchanging.
 */
public class Frequency {

    private final String name;

    public Frequency(String name) {
        this.name = name;
    }

    public String name() {
        return name;
    }
}
