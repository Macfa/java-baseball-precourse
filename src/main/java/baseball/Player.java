package baseball;

import camp.nextstep.edu.missionutils.Console;
import java.lang.Exception;
import java.util.ArrayList;
import java.util.List;

public class Player {
    List<Integer> answer;

    public Player() {
//        this.answer = new ArrayList<>();
    }
    public List<Integer> getNumber() {
        this.answer = new ArrayList<>();

        System.out.printf("숫자를 입력해주세요 : ");
        String lines = Console.readLine();

        // validate
        Validation.validateInputLength(lines);

        String[] inputArr = lines.split("");
        convertInLoop(inputArr);

        return this.answer;
    }
    private void convertInLoop(String[] data) {
        for (int i = 0; i < data.length; i++) {
            this.answer.add(convertInt(data[i]));
        }
    }
    private Integer convertInt(String stringDigit) {
        try {
            return Integer.parseInt(stringDigit);
//            return number;
        } catch (NumberFormatException e) {
            System.out.println("e = " + e.getStackTrace());
            throw new NumberFormatException("숫자형 치환에 실패했습니다");
//            throw new IllegalArgumentException();
        }
    }

}
