import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class LottoGameMain {

    private static final int LOTTO_SIZE = 6;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LottoGame game = new LottoGame();

        System.out.println("1~45중 로또 번호를 6개 입력해주세요.");
        List<LottoNumber> playerNumbers = new ArrayList<>();

        while (playerNumbers.size() < LOTTO_SIZE) {
            try {
                int input = scanner.nextInt();
                LottoNumber number = new LottoNumber(input);
                if (!playerNumbers.contains(number)) {
                    playerNumbers.add(number);
                } else {
                    System.out.println("이미 같은" + input + "이 있습니다. 다른 번호를 입력해주세요.");
                }
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }

        while (autoNumberList.size() < LOTTO_SIZE) {
            int input = random.nextInt(MAX_NUMBER - MIN_NUMBER) + MIN_NUMBER;
            if (!autoNumberList.contains(input)) {
                autoNumberList.add(input);
            }
        }
        Collections.sort(autoNumberList);
        System.out.println("로또 당첨 숫자: " + autoNumberList);

        winningNumberList.retainAll(autoNumberList);
        System.out.println("일치한 숫자의 개수: " + winningNumberList.size());

    }

    private static boolean validate(int input) {
        if (input < MIN_NUMBER || input > MAX_NUMBER) {
            System.out.println(REQUEST_NUMBER);
            return false;
        }
        return true;
    }
}
