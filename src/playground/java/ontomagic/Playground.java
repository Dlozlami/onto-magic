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

        show(self, red, green, blue, "each at amplitude 1");

        blue.reinforce(new Thought(new Frequency("blue")));
        blue.reinforce(new Thought(new Frequency("blue")));

        show(self, red, green, blue, "blue reinforced twice");
    }

    private static void show(Self self, Belief... beliefs) {
        System.out.println();
        for (Belief b : beliefs) {
            System.out.printf("  %-6s amplitude %d   share %.0f%%%n",
                b.frequency().name(), b.amplitude(), self.reality.shareOf(b) * 100);
        }
    }

    private static void show(Self self, Belief a, Belief b, Belief c, String label) {
        System.out.println("\n" + label);
        show(self, a, b, c);
    }
}
