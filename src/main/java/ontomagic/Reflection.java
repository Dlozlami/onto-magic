package ontomagic;

/**
 * An Allowance reflected onto a Field.
 *
 * Every belief is present at once, weighted by its amplitude, like layers
 * composited into one image. Raising a belief's amplitude does not add
 * anything new. It shifts the whole.
 *
 * Reflection holds references, not copies, so a push, a pop or a
 * reinforcement shows up immediately.
 */
public class Reflection {

    private final Field field;
    private final Allowance allowance;

    public Reflection(Field field, Allowance allowance) {
        this.field = field;
        this.allowance = allowance;
    }

    public double shareOf(Belief belief) {
        int total = allowance.totalAmplitude();
        return total == 0 ? 0 : (double) belief.amplitude() / total;
    }
}
