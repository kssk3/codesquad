public enum Rank {
    FIRST(6, false, "1등"),
    SECOND(5, true, "2등"),
    THIRD(5, false, "3등"),
    FOURTH(4, false, "4등"),
    FIFTH(3, false, "5등"),
    NONE(0, false, "낙첨");

    private final int matchCount;
    private final boolean matchBonus;
    private final String description;

    Rank(int matchCount, boolean matchBonus, String description) {
        this.matchCount = matchCount;
        this.matchBonus = matchBonus;
        this.description = description;
    }

    public static Rank getRank(int matchCount, boolean matchBonus) {
        if (matchCount == 6) return FIRST;
        if (matchCount == 5 && matchBonus) return SECOND;
        if (matchCount == 5) return THIRD;
        if (matchCount == 4) return FOURTH;
        if (matchCount == 3) return FIFTH;
        return NONE;
    }

    public String getDescription() {
        return description;
    }
}
