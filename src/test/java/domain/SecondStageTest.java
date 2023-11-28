package domain;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SecondStageTest {

    SecondStage secondStage = new SecondStage();

    @Test
    @DisplayName("Player_초기_위치_확인_테스트")
    void movePlayer() {
        String[][] initArray = secondStage.getSecondArray();
        assertEquals('P', initArray[3][0].charAt(5));
    }

}