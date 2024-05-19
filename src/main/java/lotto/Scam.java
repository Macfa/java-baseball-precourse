package lotto;
import camp.nextstep.edu.missionutils.Randoms;

import java.util.List;
import java.util.Random;

/*
    로또 추첨
 */
public class Scam {

    public int[] getLottoNumber() {
        // temp lotto
        int[] tmp = new int[6];

        // loop
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = (int) (Math.random() * 45 + 1);
        }

        return tmp;
    }
}
