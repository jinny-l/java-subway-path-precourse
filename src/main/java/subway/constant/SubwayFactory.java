package subway.constant;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import subway.domain.Station;

public class SubwayFactory {

    private static final String LINE_TWO = "2호선";
    private static final String LINE_THREE = "3호선";
    private static final String SIN_BUN_DANG = "신분당선";

    private static final List<Station> stationFactory = Arrays.asList(
            new Station("2호선", "교대역", 2, 3),
            new Station("2호선", "강남역", 2, 3),
            new Station("2호선", "역삼역", 0, 0),
            new Station("3호선", "교대역", 3, 2),
            new Station("3호선", "남부터미널역", 6, 5),
            new Station("3호선", "양재역", 1, 1),
            new Station("3호선", "매봉역", 0, 0),
            new Station("신분당선", "강남역", 2, 8),
            new Station("신분당선", "양재역", 10, 3),
            new Station("신분당선", "양재시민의숲역", 0, 0)
    );

    public static List<Station> getStationsOf(String input) {
        return stationFactory.stream()
                .filter(station -> station.getLine().equals(input))
                .map(Station::getStation)
                .collect(Collectors.toList());
    }

    public static List<String> getLinesOf(String input) {
        return stationFactory.stream()
                .filter(station -> station.getName().equals(input))
                .map(Station::getLine)
                .collect(Collectors.toList());
    }

    private static List<String> getAllNames() {
        return stationFactory.stream()
                .map(Station::getName)
                .collect(Collectors.toList());
    }

    public static void validate(String input) {
        if (!getAllNames().contains(input)) {
            throw new IllegalArgumentException();
        }
    }

}
