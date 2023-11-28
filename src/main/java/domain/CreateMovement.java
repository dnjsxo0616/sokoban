package domain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CreateMovement {
    private final List<String> movement;

    public CreateMovement(String input) {
        validateInput(input);
        this.movement = createMovement(input);
    }

    private List<String> createMovement(String input) {
        List<String> movement = new ArrayList<>();
        for (char c : input.toCharArray()) {
            movement.add(String.valueOf(c));
        }
        return movement;
    }

    private static void validateInput(String input) {
        List<String> validInputs = Arrays.asList("w", "a", "s", "d", "q", "W", "A", "S", "D", "Q");

        for (char c : input.toCharArray()) {
            if (!validInputs.contains(String.valueOf(c))) {
                throw new IllegalArgumentException("(경고) 지원하지 않는 명령입니다!");
            }
        }
    }

    public List<String> getMovement() {
        return movement;
    }
}
