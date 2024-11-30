import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class LottoGameMain {
    private static final String REQUEST_NUMBER = "1~45사이의 숫자만 입력 가능합니다.";
    private static final int LOTTO_SIZE = 6;
    private static final int MIN_NUMBER = 1;
    private static final int MAX_NUMBER = 45;


    public static void main(String[] args) {
        List<Integer> numberList = new ArrayList<>();
        List<Integer> autoNumberList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("1~45중 로또 번호를 6개 입력해주세요.");

        while (numberList.size() < LOTTO_SIZE) {
            int input = scanner.nextInt();
            validate(input);
            if (!numberList.contains(input)) {
                numberList.add(input);
            } else {
                System.out.println("이미 같은" + input + "이 있습니다. 다른 번호를 입력해주세요.");
            }
        }
        System.out.println(numberList);

        while (autoNumberList.size() < LOTTO_SIZE) {
            int input = random.nextInt(MAX_NUMBER - MIN_NUMBER) + MIN_NUMBER;
            if (!autoNumberList.contains(input)) {
                autoNumberList.add(input);
            } else {
                System.out.println("이미 같은" + input + "이 있습니다. 다른 번호를 입력해주세요.");
            }
        }
        System.out.println(autoNumberList);
    }

    private static void validate(int input) {
        if (input < MIN_NUMBER || input > MAX_NUMBER) {
            System.out.println(REQUEST_NUMBER);
        }
    }
}
