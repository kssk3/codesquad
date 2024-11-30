public class LottoNumber {
    private static final String REQUEST_NUMBER = "1~45사이의 숫자만 입력 가능합니다.";
    private static final int MIN_NUMBER = 1;
    private static final int MAX_NUMBER = 45;

    private int number;

    public LottoNumber(int number) {
        validate(number);
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    private static void validate(int input) {
        if (input < MIN_NUMBER || input > MAX_NUMBER) {
            System.out.println(REQUEST_NUMBER);
        }
    }
}
