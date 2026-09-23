package ontomagic;

/**
 * The surface a Reflection lands on. Only a Creator can make one.
 */
public class Field {

    private final Creator maker;

    Field(Creator maker) {
        this.maker = maker;
    }

    public Creator maker() {
        return maker;
    }
}
