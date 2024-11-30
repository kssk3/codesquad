import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class LottoGame {
    private static final int MAX_NUMBER = 45;
    private static final int TICKET_SIZE = 6;
    private final Random random;

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
        return bonusNumber;
    }

    public int checkWinningTicket(LottoTicket playerTicket, LottoTicket winningTicket) {
        return (int) playerTicket.getNumbers().stream()
                .filter(number -> winningTicket.getNumbers().stream()
                        .anyMatch(winningNumber -> winningNumber.getNumber() == number.getNumber()))
                .count();
    }

}
