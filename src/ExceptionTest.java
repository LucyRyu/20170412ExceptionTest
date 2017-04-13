import java.util.Scanner;

/**
 * Created by danawacomputer on 2017-04-12.
 */
public class ExceptionTest {

    public static void main(String[] args) {
        while(true) {
            InputData();
        }
    }

    static void InputData() {
        System.out.println("숫자를 입력해주세요");
        Scanner in = new Scanner(System.in);
        String userInput = in.next();

        try {
            int converted = Integer.parseInt(userInput);
            System.out.printf("당신이 입력한 %d입니다\n", converted);
            System.exit(0);
        } catch (NumberFormatException e) {
            System.out.println("잘못된 숫자를 입력하셨습니다.\n");
        }
    }
}