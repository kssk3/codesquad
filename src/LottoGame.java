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
}
