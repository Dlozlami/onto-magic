package ontomagic;

/**
 * Self inherits the whole ladder up to The ALL.
 *
 * Inner being is reflected in reality.
 *
 * OPEN: Self inherits createField() through Soul, so Self can create Fields.
 * Confirm whether that is intended.
 */
public class Self extends HigherSelf {

    private final Field innerBeing = createField();
    private final Allowance allowance = new Allowance();

    public final Reflection reality = new Reflection(innerBeing, allowance);

    public void believe(Belief belief) {
        allowance.hold(belief);
    }
}
