package baseball;

import java.util.List;
import java.util.Scanner;

public class BaseBallGame {
    private final Player player;
    private final Computer computer;
    private final Scanner scan;
    private Integer ball;
    private Integer strike;
    private boolean gameover;
    private int continue_game;
    private List<Integer> question;


    public BaseBallGame() {
        this.player = new Player();
        this.computer = new Computer();
        this.scan = new Scanner(System.in);
    }

    public void start() {
        do {
            playGame();
        }
        while(this.continue_game == 1 );

    }
    private void playGame() {
        prepareGame(); // 매게임마다 게임 문제를 출시

        do {
            // 게임이 진행 중
            resetGameInfo();
            processGame();
            processMarking();
        }
        while(!this.gameover);
    }
    private void resetGameInfo() {
        this.strike = 0;
        this.ball = 0;
        this.gameover = false;
        this.continue_game = 1;
    }
    private void prepareGame() {
        this.question = this.computer.getNumber();
    }
    private void processGame() {
        List<Integer> answer = this.player.getNumber();

        recordScore(answer);
    }
    private void recordScore(List<Integer> answer) {
        for ( Integer number : this.question ) {
            boolean existNumber = answer.contains(number);
            setHint(existNumber);
        }
    }
    private void setHint(boolean existNumber) {
        if(existNumber) {
            this.strike += 1;
        } else {
            this.ball += 1;
        }
    }
    private void processMarking() {
        if(this.strike == 3) {
            displayGameOver();
        } else if(this.strike < 3){
            displayResult();
        }
    }
    private void displayResult() {
        if(this.strike > 0) {
            System.out.println(this.strike + " 스트라이크");
        }
        if(this.ball > 0) {
            System.out.println(this.ball + " 볼");
        }
    }
    private void displayGameOver() {
        this.gameover = true;
        System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
        getUserInput();
    }
    private void getUserInput() {
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.\n");

        this.continue_game = scan.nextInt();
    }
}