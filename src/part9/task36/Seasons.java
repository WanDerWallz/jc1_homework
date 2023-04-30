package part9.task36;

public enum Seasons {
    ЗИМА("Холодно и грустно.", 90), ВЕСНА("Уже теплее и веселее.", 92), ЛЕТО("Тепло и вообще отлично.", 92), ОСЕНЬ("Прохладно, но красиво.", 91);
    private final String description;
    private final int countOfDays;

    Seasons(String description, int countOfDays) {
        this.description = description;
        this.countOfDays = countOfDays;
    }

    public String getDescription() {
        return description;
    }

    public int getCountOfDays() {
        return countOfDays;
    }
}
