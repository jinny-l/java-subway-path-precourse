package subway.constant.subwayInfo;

public enum LineTwo {

    GYODAE("교대역", 2, 3),
    GANGNAM("강남역", 2, 3),
    YEOKSAM("역삼역", 0, 0);

    private final String station;
    private final int distance;
    private final int time;

    LineTwo(String station, int distance, int time) {
        this.station = station;
        this.distance = distance;
        this.time = time;
    }
}
