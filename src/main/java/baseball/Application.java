package baseball;

public class Application {
    public static Integer RESTART = 2;

    public static void main(String[] args) {
        //TODO: 숫자 야구 게임 구현

        do {
            BaseBallGame game = new BaseBallGame();
            game.start();
        }
        while(Application.RESTART == 1);
    }
}
/*
    게임
    플레이어     컴퓨터
     입력         출력 검증
 */