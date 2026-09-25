package ontomagic;

import java.util.List;

/**
 * Frequencies, appearing as a thought. A belief uses thoughts to reinforce
 * itself.
 *
 * OPEN: whether a thought reinforces only the belief holding its frequencies,
 * or also nearby beliefs in proportion to nearness.
 */
public class Thought {

    private final List<Frequency> frequencies;

    public Thought(Frequency... frequencies) {
        this.frequencies = List.of(frequencies);
    }

    public List<Frequency> frequencies() {
        return frequencies;
    }
}
