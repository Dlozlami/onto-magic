package ontomagic;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * A set of beliefs: what you are allowed to experience.
 */
public class Allowance {

    private final Deque<Belief> beliefs = new ArrayDeque<>();

    public void push(Belief belief) {
        beliefs.push(belief);
    }

    public Belief pop() {
        return beliefs.pop();
    }

    public Iterable<Belief> beliefs() {
        return beliefs;
    }

    public int totalAmplitude() {
        int total = 0;
        for (Belief belief : beliefs) {
            total += belief.amplitude();
        }
        return total;
    }
}
