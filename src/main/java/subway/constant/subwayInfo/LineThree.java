package subway.constant.subwayInfo;

public enum LineThree {

    GYODAE("교대역", 2, 3),
    NAMBU("남부터미널역", 6, 5),
    YANGJAE("양재역", 1, 1),
    MAEBONG("매봉역", 0, 0);

    private final String station;
    private final int distance;
    private final int time;

    LineThree(String station, int distance, int time) {
        this.station = station;
        this.distance = distance;
        this.time = time;
    }

}
