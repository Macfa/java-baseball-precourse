package lotto;

import java.util.List;

/*
    가게로 가, 번호를 찍는 용도로 받는 종이
    가게에서 종이를 받아 번호를 찍고 다시 가게에 전달하여
    로또종이를 받는다
 */
public class LottoTicket {
    private LottoVO lottoVO;

    public void setLottoVO(LottoVO lottoVO) {
        this.lottoVO = lottoVO;
    }
    public LottoVO getLottoVO() {
        return this.lottoVO;
    }
}
