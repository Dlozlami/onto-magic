package ontomagic;

/** A Belief uses thoughts to reinforce itself. */
public class Thought {

    private final Frequency frequency;

    public Thought(Frequency frequency) {
        this.frequency = frequency;
    }

    public Frequency frequency() {
        return frequency;
    }
}
