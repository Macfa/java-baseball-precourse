package baseball;

import camp.nextstep.edu.missionutils.Console;

import java.util.List;
import java.util.Scanner;

public class BaseBallGame {
    private Player player;
    private Computer computer;
    private Integer BALL;
    private Integer STRIKE;
    private boolean GAMEOVER;
    private Scanner scan;
    private List<Integer> question;


    public BaseBallGame() {
        this.player = new Player();
        this.computer = new Computer();
        this.scan = new Scanner(System.in);
    }

    public void start() {
//        System.out.println("------ Game Start ------");
        prepareGame();

        do {
            resetGameInfo();
            processGame();
            processMarking();
        }
        while(!this.GAMEOVER);

//        recordScore();

    }
    private void resetGameInfo() {
        this.STRIKE = 0;
        this.BALL = 0;
        this.GAMEOVER = false;
    }
    private void prepareGame() {
        this.question = this.computer.getNumber();
        System.out.println("question = " + question);
    }
    private void processGame() {
        List<Integer> answer = this.player.getNumber();
        System.out.println("answer = " + answer);

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
            this.STRIKE += 1;
        } else {
            this.BALL += 1;
        }
    }
    private void processMarking() {
        if(this.STRIKE == 3) {
            displayGameOver();
        } else if(this.STRIKE < 3){
            displayResult();
        }
    }
    private void displayResult() {
        if(this.STRIKE > 0) {
            System.out.println(this.STRIKE + " 스트라이크");
        }
        if(this.BALL > 0) {
            System.out.println(this.BALL + " 볼");
        }
    }
    private void displayGameOver() {
        this.GAMEOVER = true;
        System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
        getUserInput();
    }
    private void getUserInput() {
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.\n");
        Integer userChoice = scan.nextInt();

        Application.RESTART = userChoice;
    }
}

/*

 */