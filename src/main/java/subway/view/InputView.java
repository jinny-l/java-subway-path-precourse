package subway.view;

import java.util.Scanner;
import subway.constant.ErrorMessage;
import subway.constant.command.MainCommand;
import subway.constant.command.StandardCommand;
import subway.constant.subwayInfo.AllStation;

public class InputView {

    private static final String MENU_DELIMITER = "## ";
    private static final String INPUT_COMMAND = MENU_DELIMITER + "원하는 기능을 선택하세요.";
    private static final String INPUT_DEPARTURE_STATION = MENU_DELIMITER + "출발역을 입력하세요.";
    private static final String INPUT_ARRIVAL_STATION = MENU_DELIMITER + "도착역을 입력하세요.";

    private final Scanner scanner;

    public InputView(Scanner scanner) {
        this.scanner = scanner;
    }

    public String readMainCommand() {
        System.out.println(INPUT_COMMAND);
        return MainCommand.from(readLine());
    }

    public String readStandardCommand() {
        System.out.println(INPUT_COMMAND);
        return StandardCommand.from(readLine());
    }

    public String readDepartureStation() {
        System.out.println(INPUT_DEPARTURE_STATION);
        return AllStation.from(readLine());
    }

    // TODO: 도착역 검증 로직 추가 구현 필요
    public String readArrivalStation() {
        System.out.println(INPUT_ARRIVAL_STATION);
        return AllStation.from(readLine());
    }

    private String readLine() {
        String input = scanner.nextLine().trim();
        validateHasInput(input);
        return input;
    }

    private void validateHasInput(String input) {
        if (input.isEmpty()) {
            throw new IllegalArgumentException(ErrorMessage.INPUT_IS_EMPTY.toString());
        }
    }

}
