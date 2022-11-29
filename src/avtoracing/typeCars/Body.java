package avtoracing.typeCars;

public enum Body {
    SEDAN("Седан"), HATCHBACK("Хэтчбэк"), COUPE("Купе"), STATION_WAGON("Универсал"), OFFROAD("Внедорожник"),
    CROSSOVER("Кроссовер"), PICKUP("Пикап"),VAN("Фургон"),MINIVAN("Минивен");

    private final String body;

    Body(String body) {
        this.body = body;
    }

    public String getBody() {
        return body;
    }
    @Override
    public String toString() {
        return body;
    }
}


