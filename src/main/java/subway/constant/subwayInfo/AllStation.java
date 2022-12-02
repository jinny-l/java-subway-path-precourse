package subway.constant.subwayInfo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public enum AllStation {

    GYODAE("교대역"),
    GANGNAM("강남역"),
    YEOKSAM("역삼역"),
    NAMBU("남부터미널역"),
    YANGJAE("양재역"),
    MAEBONG("매봉역"),
    YANGJAE_FOREST("양재시민의숲역");

    private final String station;

    AllStation(String station) {
        this.station = station;
    }

    public static String from(String input) {
        validate(input);
        return input;
    }

    private static void validate(String input) {
        if (!getAll().contains(input)) {
            throw new IllegalArgumentException();
        }
    }

    private static List<String> getAll() {
        return Arrays.stream(values())
                .map(AllStation::getStation)
                .collect(Collectors.toList());
    }

    private String getStation() {
        return station;
    }

}
