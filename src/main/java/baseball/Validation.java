package baseball;

public class Validation {

    public static void validateInputLength(String input) {
        if(input.length() < 3 ) {
            throw new IllegalArgumentException("입력값이 3글자보다 적을 수 없습니다");
        } else if(input.length() > 3) {
            throw new IllegalArgumentException("입력값이 3글자보다 클 수 없습니다");
        }
    }
}
