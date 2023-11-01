package racingcar.model;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import camp.nextstep.edu.missionutils.Randoms;

public class Cars {
	private static final int MOVE_THRESHOLD = 4;
	private final Track track = new Track(new ArrayList<>());
    private final List<String> winners = new ArrayList<>();

    public void createCars(String carNames) {
        for (String carName : splitNames(carNames)) {
            track.addCar(new Car(carName, 0));
        }
    }

    private List<String> splitNames(String carNames) {
        return List.of(carNames.split(","));
    }

    public List<Car> getAllCars() {
        return track.getCars();
    }

    public void playRound() {
        for (Car car : track.getCars()) {
            int randomNumber = Randoms.pickNumberInRange(0, 9);
            moveCar(car, randomNumber);
        }
    }

    private void moveCar(Car car, int randomNumber) {
        if (randomNumber >= MOVE_THRESHOLD) {
            car.move();
        }
    }

    public List<String> getWinners() {
        int maxPosition = getMaxPosition();
        for (Car car : track.getCars()) {
            isWinner(car, maxPosition);
        }
        return winners;
    }

    private int getMaxPosition() {
        int maxPosition = 0;
        for (Car car : track.getCars()) {
            maxPosition = Math.max(maxPosition, car.getPosition());
        }
        return maxPosition;
    }

    private void isWinner(Car car, int maxPosition) {
        if (car.getPosition() == maxPosition) {
            winners.add(car.getName());
        }
    } 
}
