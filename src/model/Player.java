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

    public void buyTicket(LottoTicket ticket) {
        if (canplay()) {
            this.ticket = ticket;
            money -= 1000;
        }
    }

    

}
