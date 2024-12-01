package model;

public enum Rank {
    FIRST(6, false, "1등",1_000_000),
    SECOND(5, true, "2등",100_000),
    THIRD(5, false, "3등",10_000),
    FOURTH(4, false, "4등",5_000),
    FIFTH(3, false, "5등",1_000),
    NONE(0, false, "낙첨",0);

    private final int matchCount;
    private final boolean matchBonus;
    private final String description;
    private final int winningBonus;


    Rank(int matchCount, boolean matchBonus, String description, int winningBonus) {
        this.matchCount = matchCount;
        this.matchBonus = matchBonus;
        this.description = description;
        this.winningBonus = winningBonus;
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
