package ontomagic;

/**
 * A Belief holds one frequency unchanging.
 *
 * Amplitude is how much energy the belief carries, not how much of it there is.
 * Reinforcement raises amplitude. It never changes which frequency is held.
 */
public class Belief {

    private final Frequency frequency;
    private int amplitude = 1;

    public Belief(Frequency frequency) {
        this.frequency = frequency;
    }

    public void reinforce(Thought thought) {
        amplitude++;
    }

    public Frequency frequency() {
        return frequency;
    }

    public int amplitude() {
        return amplitude;
    }
}
