package ontomagic;

public class Playground {

    public static void main(String[] args) {
        Self self = new Self();

        Belief red   = new Belief(new Frequency("red"));
        Belief green = new Belief(new Frequency("green"));
        Belief blue  = new Belief(new Frequency("blue"));

        self.believe(red);
        self.believe(green);
        self.believe(blue);

        show(self, "each at amplitude 1", red, green, blue);

        blue.reinforce(new Thought(new Frequency("blue")));
        blue.reinforce(new Thought(new Frequency("blue")));

        show(self, "blue reinforced twice", red, green, blue);

        red.amplitude(0);

        show(self, "red quietened to zero: still held, governing nothing", red, green, blue);
    }

    private static void show(Self self, String label, Belief... beliefs) {
        System.out.println("\n" + label + "\n");
        for (Belief belief : beliefs) {
            System.out.printf("  %-6s amplitude %d   share %.0f%%%n",
                belief.frequencies().get(0).name(), belief.amplitude(), self.reality.shareOf(belief) * 100);
        }
    }
}
