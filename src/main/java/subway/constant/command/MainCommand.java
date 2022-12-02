package subway.constant.command;

public enum MainCommand {

    ROUTE_SEARCHING("경로 조회", "1"),
    QUIT("종료", "Q");

    private static final String FIELD_DELIMITER = ". ";

    private final String text;
    private final String command;

    MainCommand(String text, String command) {
        this.text = text;
        this.command = command;
    }

    public String getText() {
        return text;
    }

    public String getCommand() {
        return command;
    }

    public static String from(String input) {
        validate(input);
        return input;
    }

    private static void validate(String input) {
        if (!input.equals(ROUTE_SEARCHING.getCommand()) && !input.equals(QUIT.getCommand())) {
            throw new IllegalArgumentException();
        }
    }

    public static boolean doSearchRoute(String input) {
        return input.equals(ROUTE_SEARCHING.getCommand());
    }

    @Override
    public String toString() {
        return getCommand()
                + FIELD_DELIMITER
                + getText()
                + "\n";
    }

}
