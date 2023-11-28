package domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FirstStageTest {
    @Test
    @DisplayName("구멍_수_계산_테스트")
    void countHall() {
        int[][] testArray = {
                {0, 4, 4, 0},
                {0, 1, 0, 1},
                {0, 4, 0, 4}
        };

        Integer result = FirstStage.countHall(testArray);

        assertEquals(2, result);
    }

    @Test
    @DisplayName("공_수_계산_테스트")
    void countBall() {
        int[][] testArray = {
                {0, 4, 4, 0},
                {0, 2, 2, 1},
                {0, 4, 0, 4}
        };

        Integer result = FirstStage.countBall(testArray);

        assertEquals(2, result);
    }
}