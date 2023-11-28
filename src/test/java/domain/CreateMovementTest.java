package domain;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CreateMovementTest {

    @Test
    @DisplayName("입력값_변환_소문자_테스트")
    void validateLowerInput() {
        CreateMovement createMovement = new CreateMovement("asdw");
        List<String> testList = Arrays.asList("a", "s", "d", "w");
        assertEquals(testList, createMovement.getMovement());
    }

    @Test
    @DisplayName("입력값_변환_대문자_테스트")
    void validateUpperInput() {
        CreateMovement createMovement = new CreateMovement("ASDW");
        List<String> testList = Arrays.asList("A", "S", "D", "W");
        assertEquals(testList, createMovement.getMovement());
    }

    @Test
    @DisplayName("입력값_유효성_테스트")
    void validateInput() {
        assertDoesNotThrow(() -> new CreateMovement("wasd"));
        assertDoesNotThrow(() -> new CreateMovement("q"));
        assertDoesNotThrow(() -> new CreateMovement("WASDQ"));
    }

    @Test
    @DisplayName("입력값_유효성_오류_테스트")
    void validateInputFail() {
        Assertions.assertThatThrownBy(() -> new CreateMovement("asdy"))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("(경고) 지원하지 않는 명령입니다!");
    }

}