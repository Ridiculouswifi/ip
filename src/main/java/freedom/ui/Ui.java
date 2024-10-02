package freedom.ui;

public class Ui {
    private final static String DIVIDER = "\t________________________________________\n";

    public void printStartMessage() {
        printHeadDivider();
        System.out.print("""
                \tHello! I'm Freedom
                \tWhat can I do for you?
                """);
        printTailDivider();
    }

    public void printEndMessage() {
        printHeadDivider();
        System.out.println("\tBye! Hope to see you again soon.");
        printTailDivider();
    }

    public void printInvalidCommand() {
        printHeadDivider();
        System.out.println("\tSorry! I don't understand your command");
        printTailDivider();
    }

    public void printHeadDivider() {
        System.out.print(DIVIDER);
    }

    public void printTailDivider() {
        System.out.println(DIVIDER);
    }

    public void printPlaceholder() {
        System.out.print("");
    }
}
