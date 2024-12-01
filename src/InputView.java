import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InputView {
    private static final int LOTTO_SIZE = 6;
    private final Scanner scanner;

    public InputView() {
        this.scanner = new Scanner(System.in);
    }

    public LottoTicket getUserTicket() {
        List<LottoNumber> playerNumbers = new ArrayList<>();
        while (playerNumbers.size() < LOTTO_SIZE) {
            try {
                int input = getUserInput();
                LottoNumber number = new LottoNumber(input);
                if (!playerNumbers.contains(number)) {
                    playerNumbers.add(number);
                } else {
                    System.out.println("이미 같은 " + input + "이 있습니다. 다른 번호를 입력해주세요.");
                }
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
        return new LottoTicket(playerNumbers);
    }

    public int getUserInput() {
        return scanner.nextInt();
    }
}
