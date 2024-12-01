package controller;

import model.LottoGame;
import model.LottoNumber;
import model.LottoTicket;
import model.Rank;
import view.InputView;
import view.OutputView;

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

            int matchCount = lottoGame.checkWinningTicket(playerTicket, winningTicket);
            boolean matchBonus = playerTicket.getNumbers().contains(bonusNumber);
            Rank rank = Rank.getRank(matchCount, matchBonus);
            outputView.displayResult(matchCount, rank);
            System.out.println("test");

        }
    }
