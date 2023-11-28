package domain;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MoveStageTest {

    @Test
    @DisplayName("입력값_변환_소문자_테스트")
    void validateLowerInput() {
        MoveStage moveStage = new MoveStage("asdw");
        List<String> testList = Arrays.asList("a", "s", "d", "w");
        assertEquals(testList, moveStage.getMovement());
    }

    @Test
    @DisplayName("입력값_변환_대문자_테스트")
    void validateUpperInput() {
        MoveStage moveStage = new MoveStage("ASDW");
        List<String> testList = Arrays.asList("A", "S", "D", "W");
        assertEquals(testList, moveStage.getMovement());
    }

}