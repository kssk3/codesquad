import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LottoGameMain {
    private static final String REQUEST_NUMBER = "1~45사이의 숫자만 입력 가능합니다.";
    private static final int LOTTO_SIZE = 6;
    private static final int MIN_NUMBER = 1;
    private static final int MAX_NUMBER = 45;


    public static void main(String[] args) {
        List<Integer> numberList = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        System.out.println("1~45중 로또 번호를 6개 입력해주세요.");

        while (true) {
            int input = scanner.nextInt();

        }
    }

    private static void validate(int input) {

    }
}
