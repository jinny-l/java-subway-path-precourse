package subway.constant;

public enum ErrorMessage {

    INPUT_IS_EMPTY("입력 값이 없습니다."),
    INVALID_COMMAND("유효하지 않은 명령어를 입력했습니다."),
    INVALID_STATION("조회할 수 없느 역을 입력했습니다."),
    INVALID_ARRIVAL_STATION("도착역과 출발역이 동일합니다.");

    private static final String ERROR = "[ERROR] ";

    private final String message;

    ErrorMessage(String errorMessage) {
        this.message = errorMessage;
    }

    @Override
    public String toString() {
        return ERROR + message;
    }

}
