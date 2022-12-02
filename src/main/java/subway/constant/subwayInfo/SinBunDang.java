package subway.constant.subwayInfo;

public enum SinBunDang {

    GANGNAM("강남역", 2, 8),
    YANGJAE("양재역", 10, 3),
    YANGJAE_FOREST("양재시민의숲역", 0, 0);

    private final String station;
    private final int distance;
    private final int time;

    SinBunDang(String station, int distance, int time) {
        this.station = station;
        this.distance = distance;
        this.time = time;
    }

}
