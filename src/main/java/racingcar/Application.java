package racingcar;

import camp.nextstep.edu.missionutils.Console;
import racingcar.controller.RacingController;

public class Application {
    public static void main(String[] args) {
        // 사용자 입력
    	System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
    	Console.readLine();
    	System.out.println("시도할 회수는 몇회인가요?");
    	Console.readLine();
    	
    	RacingController racingController = new RacingController();
    	racingController.start();
    	
    }
}
