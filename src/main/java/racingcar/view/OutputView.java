package racingcar.view;

import java.util.List;

import racingcar.model.Car;

public class OutputView {
	
	private static final String CAR_NAME_INPUT = "경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)";
	private static final String RACE_COUNT_INPUT = "시도할 회수는 몇회인가요?";
	
	public static void printInputCarName() {
		System.out.println(CAR_NAME_INPUT);
		
	}

	public void printInputRaceCount() {
		System.out.println(RACE_COUNT_INPUT);
	}
	
	public void printMove(List<Car> cars) {
		for (Car car : cars) {
            System.out.println(car);
        }
	}

}
