package domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayMoveStateTest {
    private PlayMoveState playMoveState;

    @BeforeEach
    void setUp() {
        playMoveState = new PlayMoveState();
    }

    @Test
    @DisplayName("오른쪽_이동_테스트")
    void rightMovePlayer() {
        char[][] stageBeforeMove = playMoveState.getStage();

        int currentPlayerRow = -1, currentPlayerCol = -1;
        for (int i = 0; i < stageBeforeMove.length; i++) {
            for (int j = 0; j < stageBeforeMove[i].length; j++) {
                if (stageBeforeMove[i][j] == 'P') {
                    currentPlayerRow = i;
                    currentPlayerCol = j;
                    break;
                }
            }
        }

        playMoveState.movePlayer(MoveDirection.RIGHT);

        char[][] stageAfterMove = playMoveState.getStage();
        assertEquals('P', stageAfterMove[currentPlayerRow][currentPlayerCol + 1]);
        assertEquals(' ', stageAfterMove[currentPlayerRow][currentPlayerCol]);
    }

    @Test
    @DisplayName("왼쪽_이동_테스트")
    void LeftMovePlayer() {
        char[][] stageBeforeMove = playMoveState.getStage();

        int currentPlayerRow = -1, currentPlayerCol = -1;
        for (int i = 0; i < stageBeforeMove.length; i++) {
            for (int j = 0; j < stageBeforeMove[i].length; j++) {
                if (stageBeforeMove[i][j] == 'P') {
                    currentPlayerRow = i;
                    currentPlayerCol = j;
                    break;
                }
            }
        }

        playMoveState.movePlayer(MoveDirection.LEFT);

        char[][] stageAfterMove = playMoveState.getStage();
        assertEquals('P', stageAfterMove[currentPlayerRow][currentPlayerCol - 1]);
        assertEquals(' ', stageAfterMove[currentPlayerRow][currentPlayerCol]);
    }

    @Test
    @DisplayName("위쪽_이동_테스트")
    void UpMovePlayer() {
        char[][] stageBeforeMove = playMoveState.getStage();

        int currentPlayerRow = -1, currentPlayerCol = -1;
        for (int i = 0; i < stageBeforeMove.length; i++) {
            for (int j = 0; j < stageBeforeMove[i].length; j++) {
                if (stageBeforeMove[i][j] == 'P') {
                    currentPlayerRow = i;
                    currentPlayerCol = j;
                    break;
                }
            }
        }

        playMoveState.movePlayer(MoveDirection.UP);

        char[][] stageAfterMove = playMoveState.getStage();
        assertEquals('P', stageAfterMove[currentPlayerRow][currentPlayerCol]);
    }

    @Test
    @DisplayName("아래_이동_테스트")
    void DownMovePlayer() {
        char[][] stageBeforeMove = playMoveState.getStage();

        int currentPlayerRow = -1, currentPlayerCol = -1;
        for (int i = 0; i < stageBeforeMove.length; i++) {
            for (int j = 0; j < stageBeforeMove[i].length; j++) {
                if (stageBeforeMove[i][j] == 'P') {
                    currentPlayerRow = i;
                    currentPlayerCol = j;
                    break;
                }
            }
        }

        playMoveState.movePlayer(MoveDirection.DOWN);

        char[][] stageAfterMove = playMoveState.getStage();
        assertEquals('P', stageAfterMove[currentPlayerRow][currentPlayerCol]);
    }
}