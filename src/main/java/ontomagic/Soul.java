package ontomagic;

/** Soul is a Creator. */
public class Soul extends Buddhic implements Creator {

    @Override
    public Field createField() {
        return new Field(this);
    }
}
