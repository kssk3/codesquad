package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class LottoGame {
    private static final int MAX_NUMBER = 45;
    private static final int TICKET_SIZE = 6;
    private final Random random;
    private LottoNumber bonusNumber;

    public LottoGame() {
        this.random = new Random();
    }

    public LottoTicket generateWinningTicket() {
        List<LottoNumber> winningNumbers = new ArrayList<>();
        while (winningNumbers.size() < TICKET_SIZE) {
            int randomNumber = random.nextInt(MAX_NUMBER) + 1;
            LottoNumber lottoNumber = new LottoNumber(randomNumber);
            if (!winningNumbers.contains(lottoNumber)) {
                winningNumbers.add(lottoNumber);
            }
        }
        return new LottoTicket(winningNumbers);
    }

    public LottoNumber generateBonusNumber(LottoTicket winningTicket) {
        LottoNumber bonusNumber;
        do {
            int randomNumber = random.nextInt(MAX_NUMBER) + 1;
            bonusNumber = new LottoNumber(randomNumber);
        } while (winningTicket.getNumbers().contains(bonusNumber));
        this.bonusNumber = bonusNumber;
        return bonusNumber;
    }

    public LottoNumber getBonusNumber() {
        return bonusNumber;
    }

    public Rank playRound(Player player){
        LottoTicket winningTicket = generateWinningTicket();
        LottoNumber bonusNumber = generateBonusNumber(winningTicket);

        int matchCount = checkWinningTicket(player.getTicket(), winningTicket);
        boolean matchBonus = player.getTicket().getNumbers().contains(bonusNumber);
        return Rank.getRank(matchCount, matchBonus);
    }

    public int checkWinningTicket(LottoTicket playerTicket, LottoTicket winningTicket) {
        return (int) playerTicket.getNumbers().stream()
                .filter(winningTicket.getNumbers()::contains)
                .count();
    }

}
