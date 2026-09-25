package ontomagic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * A group of beliefs.
 *
 * Append-only: beliefs are forever. Nothing is removed. You can un-experience a
 * thing, but you will always act as an entity that had that experience, and how
 * much it governs is the amplitude.
 */
public class Allowance {

    private final List<Belief> beliefs = new ArrayList<>();

    public void hold(Belief belief) {
        beliefs.add(belief);
    }

    public List<Belief> beliefs() {
        return Collections.unmodifiableList(beliefs);
    }

    /** Every belief counts, including the ones at zero. Nothing is filtered. */
    public int totalAmplitude() {
        int total = 0;
        for (Belief belief : beliefs) {
            total += belief.amplitude();
        }
        return total;
    }
}
