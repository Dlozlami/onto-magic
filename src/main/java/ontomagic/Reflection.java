package ontomagic;

/**
 * An Allowance reflected onto a Field.
 *
 * Automatic and live, not something done in order to look. Every belief is
 * present at once, weighted by its amplitude, composited like layers into one
 * image. Nothing is filtered: beliefs at zero contribute zero, which is a
 * contribution.
 *
 * Reflection holds references, not copies, so a change in amplitude shows up
 * immediately. Reality is a Reflection, and reality is what we experience.
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
