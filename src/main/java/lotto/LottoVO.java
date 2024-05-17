package lotto;

public class LottoVO {
    private int[] number;

    public LottoVO(int[] number) {
        this.number = number;
    }

    public int[] getNumber() {
        return number;
    }
    public void displayNumber() {
//        System.out.println("------- Lotto -------");
        numberLoop();
        System.out.println("");
//        System.out.println("\n------- DONE -------\n");
    }
    private void numberLoop() {
        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i] + "  ");
        }

    }
}
