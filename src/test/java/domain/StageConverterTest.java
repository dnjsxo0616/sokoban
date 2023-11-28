package domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class StageConverterTest {
    @Test
    @DisplayName("구멍_수_계산_테스트")
    void countHall() {
        int[][] testArray = {
                {0, 4, 4, 0},
                {0, 1, 0, 1},
                {0, 4, 0, 4}
        };

        Integer result = StageConverter.countHall(testArray);

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

        Integer result = StageConverter.countBall(testArray);

        assertEquals(2, result);
    }

    @Test
    @DisplayName("플레이어_위치_검색_테스트")
    void findPlayerPosition() {
        int[][] testArray = {
                {0, 4, 4, 0},
                {0, 2, 2, 3},
                {0, 4, 0, 4}
        };

        int[] result = StageConverter.findPlayerPosition(testArray);

        assertArrayEquals(new int[]{2, 4}, result);
    }

    @Test
    @DisplayName("플레이어_위치_오류_테스트")
    void findPlayerNoposition() {
        int[][] testArray = {
                {0, 4, 4, 0},
                {0, 2, 2, 0},
                {0, 4, 0, 4}
        };

        assertThatThrownBy(() -> StageConverter.findPlayerPosition(testArray))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("플레이어가 존재하지 않습니다.");
    }

    @Test
    @DisplayName("가로_크기_테스트")
    void countWidth() {
        String[][] testArray = {
                {"  ##### "},
                {"#OoP#"},
                {"  #####  "}
        };

        Integer result = StageConverter.countWidth(testArray);

        assertEquals(9, result);
    }

    @Test
    @DisplayName("세로_크기_테스트")
    void countColumn() {
        String[][] testArray = {
                {"  ##### "},
                {"#OoP#"},
                {"  #####  "}
        };

        Integer result = StageConverter.countColumn(testArray);

        assertEquals(3, result);
    }
}