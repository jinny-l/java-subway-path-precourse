package subway.view;

import subway.constant.command.MainCommand;
import subway.constant.command.StandardCommand;

public class OutputView {

    private static final String MENU_DELIMITER = "## ";
    private static final String MAIN = MENU_DELIMITER + "메인 화면%n%s%n";
    private static final String STANDARD = MENU_DELIMITER + "경로 기준%n%s%n";
    private static final String SEARCH_RESULT = "조회 결과";

    public static void printEmptyLine() {
        System.out.println();
    }

    public static void printMain() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < MainCommand.values().length; i++) {
            stringBuilder.append(MainCommand.values()[i].toString());
        }
        System.out.printf(MAIN, stringBuilder);
    }

    public static void printStandard() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < StandardCommand.values().length; i++) {
            stringBuilder.append(StandardCommand.values()[i].toString());
        }
        System.out.printf(STANDARD, stringBuilder);
    }

    private static void printResult() {
    }

}
