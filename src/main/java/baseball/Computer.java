package baseball;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.List;

public class Computer {
    public List<Integer> getNumber() {
        List<Integer> question = Randoms.pickUniqueNumbersInRange(1, 9, 3);
        return question;
    }
}
