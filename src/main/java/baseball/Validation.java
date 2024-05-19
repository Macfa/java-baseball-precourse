package baseball;

public class Validation {
    final static int NUMBER_MAX_LENGTH = 3;

    public static void validateInputLength(String input) {
        if(input.length() < NUMBER_MAX_LENGTH ) {
            throw new IllegalArgumentException("입력값이 " + NUMBER_MAX_LENGTH + " 글자보다 적을 수 없습니다");
        } else if(input.length() > NUMBER_MAX_LENGTH) {
            throw new IllegalArgumentException("입력값이 " + NUMBER_MAX_LENGTH +" 글자보다 클 수 없습니다");
        }
    }
}
