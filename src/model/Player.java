package model;

public class Player {
    private int money;
    private LottoTicket ticket;

    public Player(int money) {
        this.money = money;
    }

    public boolean canplay() {
        return money >= 1000;
    }
}