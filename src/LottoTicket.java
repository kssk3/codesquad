import java.util.ArrayList;
import java.util.List;

public class LottoTicket {
    private static final int TICKET_SIZE = 6;
    private final List<LottoNumber> numbers;

    public LottoTicket(List<LottoNumber> numbers) {
        this.numbers = new ArrayList<>(numbers);
    }

    private void validateSize(List<LottoNumber> numbers) {
        if (numbers.size() != TICKET_SIZE) {
            throw new IllegalArgumentException("로또 티켓은 6개의 숫자로 구성되어야 합니다.");
        }
    }
    
}
