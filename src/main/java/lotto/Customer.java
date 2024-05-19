package lotto;

import java.util.List;
import java.util.Scanner;

public class Customer {
    private int money;
    private Scanner scan;
    private final int MAX_TICKET = 10;
    private final String VALIDATE_LOTTO_LENGTH = "6개의 숫자를 입력해야합니다";

    public Customer() {
        this.money = (int) (Math.random()*100000);
        scan = new Scanner(System.in);
    }
    public int getMoney() {
        return this.money;
    }
    public List<LottoTicket> buy(Store store) {
        System.out.println("몇 장을 구매하시겠습니다 ? ");
        int quantityFromUser = scan.nextInt();
        scan.nextLine();

        // validate
        validateLottoQuantity(quantityFromUser);
        validateLottoPrice(quantityFromUser);

        // request to store buy lotto 
        List<LottoTicket> tickets = store.sellTicket(quantityFromUser);
        setNumberUsingTickets(tickets);

        return tickets;
    }
    private void validateLottoQuantity(int lottoQuantity) {
        System.out.println("lottoQuantity = " + lottoQuantity);
        if(lottoQuantity < 0) {
            throw new IllegalArgumentException("최소수량은 0개입니다");
        } else if(lottoQuantity > 10) {
            throw new IllegalArgumentException("개인이 구매할 수 있는 최대수량은 " + this.MAX_TICKET + "개입니다");
        }
    }
    private void validateLottoPrice(int quantity) {
        int totalPrice = quantity * 1000;
        System.out.println("totalPrice = " + totalPrice);
        if(totalPrice > this.money) {
            throw new IllegalArgumentException("보유한 돈 ( " + this.money + " ) 을 초과하여 구매할 수 없습니다");
        }
    }
    public void setNumberUsingTickets(List<LottoTicket> lottoTickets) {
        for (LottoTicket lottoTicket : lottoTickets) {
            LottoVO lottoVO = new LottoVO(getNumberFromUser());
            lottoTicket.setLottoVO(lottoVO);
        }
    }
    private int[] getNumberFromUser() {
        System.out.println("1 ~ 45 사이에 숫자를 6개 입력해주세요 [ 각 숫자는 공백으로 구분합니다 ]");
//        scan.
        String stringNumbers = scan.nextLine();
//        System.out.println(stringNumbers + "");
        String[] stringArray = stringNumbers.split(" ");
//        System.out.println(stringArray);
//        for(int i = 0; i < stringArray.length; i++) {
//            System.out.print(stringArray[i]);
//        }

        System.out.println("");
        validateLottoLength(stringArray);
        validateLottoNumbers(stringArray);

        return convertToIntArray(stringArray);
    }
    private void validateLottoLength(String[] stringArray) {
        if(stringArray.length > 6 || stringArray.length < 1 ) {
            throw new IllegalArgumentException(this.VALIDATE_LOTTO_LENGTH);
        }
    }
    private void validateLottoNumbers(String[] stringArray) {
        for (int i = 0; i < stringArray.length; i++) {
            validateLottoNumbersInLoop(stringArray[i]);
        }
    }
    private void validateLottoNumbersInLoop(String stringNumber) {
        try {
            Integer number = Integer.valueOf(stringNumber);

            if(number > 45 || number < 1) {
                throw new IllegalArgumentException("1~45 사이에 숫자를 입력해야합니다");
            }
        } catch ( NumberFormatException e ) {
            e.getStackTrace();
        }
    }
    private int[] convertToIntArray(String[] stringArray) {
        // define new int[]
        int[] tobeArray = new int[6];
        for(int i = 0; i < stringArray.length; i++) {
            tobeArray[i] = Integer.parseInt(stringArray[i]);
        }

        return tobeArray;
    }
}
