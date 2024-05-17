package lotto;

import java.util.ArrayList;
import java.util.List;

public class Store {
    private int money;
    private List<LottoTicket> tickets;

    public Store() {
        this.money = 0;
//        this.ticket;
    }
    public List<LottoTicket> sellTicket(int quantity) {
        tickets = new ArrayList<>();
        for (int i = 0; i < quantity; i++) {
            tickets.add( new LottoTicket() );
        }
        return tickets;
    }
}
