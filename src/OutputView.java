public class OutputView {
    public void displayMessage(String message) {
        System.out.println(message);
    }

    public void displayPlayerTicket(LottoTicket ticket) {
        System.out.println("플레이어번호: " + ticket);
    }

    public void displayWinningTicket(LottoTicket ticket, LottoNumber bonusNumber) {
        System.out.println("당첨 로또 번호: " + ticket + " 보너스 번호 " + bonusNumber);
    }

    public void displayResult(int matchCount, Rank rank) {
        System.out.println("결과: " + matchCount + "개 일치. " + rank.getDescription());
    }
}
