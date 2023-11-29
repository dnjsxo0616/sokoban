package domain;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MoveDirectionTest {
    @Test
    @DisplayName("UP_테스트")
    void testUp() {
        assertEquals(MoveDirection.UP, MoveDirection.fromCommand('w'));
        assertEquals(MoveDirection.UP, MoveDirection.fromCommand('W'));
    }

    @Test
    @DisplayName("DOWN_테스트")
    void testDown() {
        assertEquals(MoveDirection.DOWN, MoveDirection.fromCommand('s'));
        assertEquals(MoveDirection.DOWN, MoveDirection.fromCommand('S'));
    }

    @Test
    @DisplayName("LEFT_테스트")
    void testLeft() {
        assertEquals(MoveDirection.LEFT, MoveDirection.fromCommand('a'));
        assertEquals(MoveDirection.LEFT, MoveDirection.fromCommand('A'));
    }

    @Test
    @DisplayName("RIGHT_테스트")
    void testRight() {
        assertEquals(MoveDirection.RIGHT, MoveDirection.fromCommand('d'));
        assertEquals(MoveDirection.RIGHT, MoveDirection.fromCommand('D'));
    }

    @Test
    @DisplayName("오류_명령어_테스트")
    void testInvalidCommand() {
        Assertions.assertThatThrownBy(()-> MoveDirection.fromCommand('z'))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Z: (경고) 지원하지 않는 명령입니다!");
    }
}