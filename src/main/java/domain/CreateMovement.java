package domain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CreateMovement {
    private final List<Character> movement;

    public CreateMovement(String input) {
        this.movement = createMovement(input);
    }

    private List<Character> createMovement(String input) {
        List<Character> movement = new ArrayList<>();
        for (char c : input.toCharArray()) {
            movement.add(c);
        }
        return movement;
    }

    public List<Character> getMovement() {
        return movement;
    }
}
