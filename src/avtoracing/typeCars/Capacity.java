package avtoracing.typeCars;

public enum Capacity {
    N1(0f, 3.5f),
    N2(3.5f, 12f),
    N3(12f,null );
    private Float from;
    private Float to;

    Capacity(Float from, Float to) {
        this.from = from;
        this.to = to;
    }

    public Float getFrom() {
        return from;
    }

    public Float getTo() {
        return to;
    }

    public String toString(){
        if(to == null) return "Грузоподъемность от: " + from + " тонн ";
        else if(from == null) return "Грудоподъемность до: " + to + " тонн ";
        else return "Грузоподъемность: от "+ from +" тонн до " + to + " тонн";
    }



    public void setTo(Float to) {
        this.to = to;
    }

    public void setFrom(Float from) {
        this.from = from;
    }
}
