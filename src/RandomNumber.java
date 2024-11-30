import java.util.Random;

public class RandomNumber {

    private LottoNumber lottoNumber;

    public static int randomNumber(int input) {
        Random rand = new Random();
        return rand.nextInt(input);
    }
}
