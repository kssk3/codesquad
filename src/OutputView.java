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

    public void disPlayMatchCount(int count) {
        System.out.println("일치한 번호의 개수: " + count);
    }
}
