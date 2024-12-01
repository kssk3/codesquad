public class Controller {
    private LottoGame lottoGame;
    private InputView inputView;
    private OutputView outputView;

    public Controller() {
        this.lottoGame = new LottoGame();
        this.inputView = new InputView();
        this.outputView = new OutputView();
    }

    public void run() {
        outputView.displayMessage("1~45중 로또 번호를 6개 입력하세요.");
        LottoTicket playerTicket = inputView.getUserTicket();
        outputView.displayPlayerTicket(playerTicket);

        LottoTicket winningTicket = lottoGame.generateWinningTicket();
        LottoNumber bonusNumber = lottoGame.generateBonusNumber(winningTicket);
        outputView.displayWinningTicket(winningTicket, bonusNumber);
    }
}
