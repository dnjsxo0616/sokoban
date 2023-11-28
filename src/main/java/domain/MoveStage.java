package domain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MoveStage {

    private static void validateInput(String input) {
        List<String> validInputs = Arrays.asList("w", "a", "s", "d", "q", "W", "A", "S", "D", "Q");

        for (char c : input.toCharArray()) {
            if (!validInputs.contains(String.valueOf(c))) {
                throw new IllegalArgumentException("(경고) 지원하지 않는 명령입니다!");
            }
        }
    }
}
