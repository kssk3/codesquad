import java.util.ArrayList;
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
        LottoTicket playerTicket = new LottoTicket(playerNumbers);
        System.out.println("플레이어의 로또 번호: " + playerTicket);

        LottoTicket winningTicket = game.generateWinningTicket();
        System.out.println("당첨 로또 번호: " + winningTicket);

        int matchCount = game.checkWinningTicket(playerTicket, winningTicket);
        System.out.println("일치한 번호의 개수: " + matchCount);
    }
}
