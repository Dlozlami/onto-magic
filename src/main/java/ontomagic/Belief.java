package ontomagic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Manages frequencies and their amplitude.
 *
 * A belief holds its frequencies unchanging while one shifts between
 * frequencies. Amplitude is how much it governs now: reinforcement raises it,
 * quietening lowers it. Neither changes which frequencies are held.
 *
 * Zero is a node on the gradient, not an absence. A belief at zero is still
 * held; it simply governs nothing at this moment.
 */
public class Belief {

    private final List<Frequency> frequencies;
    private int amplitude;

    public Belief(Frequency... frequencies) {
        this(1, frequencies);
    }

    public Belief(int amplitude, Frequency... frequencies) {
        this.frequencies = List.of(frequencies);
        this.amplitude = Math.max(0, amplitude);
    }

    public void reinforce(Thought thought) {
        amplitude++;
    }

    public void quieten() {
        amplitude = Math.max(0, amplitude - 1);
    }

    public void amplitude(int amplitude) {
        this.amplitude = Math.max(0, amplitude);
    }

    public int amplitude() {
        return amplitude;
    }

    public List<Frequency> frequencies() {
        return Collections.unmodifiableList(new ArrayList<>(frequencies));
    }
}
