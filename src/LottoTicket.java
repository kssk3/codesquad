import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class LottoTicket {
    private static final int TICKET_SIZE = 6;
    private final List<LottoNumber> numbers;

    public LottoTicket(List<LottoNumber> numbers) {
        validateSize(numbers);
        validateDuplicateNumber(numbers);
        this.numbers = new ArrayList<>(numbers);
        this.numbers.sort(Comparator.comparingInt(LottoNumber::getNumber));
    }

    private void validateSize(List<LottoNumber> numbers) {
        if (numbers.size() != TICKET_SIZE) {
            throw new IllegalArgumentException("로또 티켓은 6개의 숫자로 구성되어야 합니다.");
        }
    }

    private void validateDuplicateNumber(List<LottoNumber> numbers) {
        if (numbers.size() != numbers.stream().distinct().count()) {
            throw new IllegalArgumentException("로또 번호에 중복이 있습니다.");
        }
    }

    public List<LottoNumber> getNumbers() {
        return new ArrayList<>(numbers);
    }

    @Override
    public String toString() {
        return numbers.stream()
                .map(LottoNumber::toString)
                .collect(Collectors.joining(", "));
    }
}
