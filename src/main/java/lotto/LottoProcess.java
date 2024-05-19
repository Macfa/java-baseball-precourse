package lotto;

import java.util.Arrays;
import java.util.List;

public class LottoProcess {
    private Store store;
    private Customer customer;
    private Scam scam;
    private List<LottoTicket> tickets;

    public LottoProcess() {
        this.store = new Store();
        this.customer = new Customer();
        this.scam = new Scam();
    }

    public void start() {
        // Customer buy lotto
        int customerHasMoney = customer.getMoney();
        System.out.println(customerHasMoney);

        // 현재 금액 내에 로또종이(Ticket) 을 구매한다.
        tickets = customer.buy(store);
        int idx = 1;
        System.out.println("===== YOU BOUGHT =====");

        for (LottoTicket ticket : tickets) {
            System.out.println("Lotto " + idx);
            ticket.getLottoVO().displayNumber();
            System.out.println("");
            idx++;
        }

        int[] LottoNumber = scam.getLottoNumber();

        // check a Lotto Number
//        for (LottoTicket ticket : tickets) {
//            int[] ticket = ticket.getLottoVO().getNumber();
//            customer.checkLottoTicket(ticket);
//
//            System.out.println("test = " + test);
//            System.out.println("result : " +result);
//        }

    }
}
