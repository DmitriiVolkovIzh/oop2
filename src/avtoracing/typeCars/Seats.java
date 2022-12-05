package avtoracing.typeCars;

public enum Seats  {
    EXTRA_SMALL(0,10),SMALL(0,25),MEDIUM(40,50),LARGE(60,80),EXTRA_LARGE(100,120);

    private final int from;
    private final int to;

    Seats(int from, int to) {
        this.from = from;
        this.to = to;
    }

    public int getFrom() {
        return from;
    }

    public int getTo() {
        return to;
    }

    @Override
    public String toString() {
        return "Seats{" +
                "from=" + from +
                ", to=" + to +
                '}';
    }
}
