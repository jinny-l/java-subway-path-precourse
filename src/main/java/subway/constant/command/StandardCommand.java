package subway.constant.command;

public enum StandardCommand {

    DISTANCE("최단 거리", "1"),
    TIME("최소 시간", "2"),
    BACK_TO_MAIN("돌아가기", "B");

    private static final String FIELD_DELIMITER = ". ";

    private final String text;
    private final String command;

    StandardCommand(String text, String command) {
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
        if (!input.equals(DISTANCE.getCommand())
                && !input.equals(TIME.getCommand())
                && !input.equals(BACK_TO_MAIN.getCommand())
        ) {
            throw new IllegalArgumentException();
        }
    }

    @Override
    public String toString() {
        return getCommand()
                + FIELD_DELIMITER
                + getText()
                + "\n";
    }
}
