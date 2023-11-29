package domain;

public class PlayMoveState {

    private static char[][] stage = {
            {' ', ' ', '#', '#', '#', '#', '#', '#'},
            {'#', '#', '#', ' ', ' ', 'O', ' ', ' ', '#', '#', '#'},
            {'#', ' ', ' ', ' ', ' ', 'o', ' ', ' ', ' ', ' ', '#'},
            {'#', ' ', ' ', ' ', ' ', 'o', ' ', ' ', ' ', ' ', '#'},
            {'#', ' ', 'O', 'o', ' ', 'P', ' ', 'o', 'O', ' ', '#'},
            {'#', '#', '#', ' ', ' ', 'o', ' ', ' ', '#', '#', '#'},
            {' ', '#', ' ', ' ', ' ', 'O', ' ', ' ', '#'},
            {' ', '#', '#', '#', '#', '#', '#', '#', '#'}
    };

    public PlayMoveState() {
        findPlayer();
    }

    private static int playerRow;
    private static int playerCol;

    public char[][] getStage() {
        return stage;
    }

    private void findPlayer() {
        for (int i = 0; i < stage.length; i++) {
            for (int j = 0; j < stage[i].length; j++) {
                if (stage[i][j] == 'P') {
                    playerRow = i;
                    playerCol = j;
                    return;
                }
            }
        }
    }

    public void movePlayer(MoveDirection moveDirection) {
        int rowChange = moveDirection.getRowChange();
        int colChange = moveDirection.getColChange();

        int newRow = playerRow + rowChange;
        int newCol = playerCol + colChange;

        if(validateMove(newRow, newCol)) {
            char currentPosition = stage[playerRow][playerCol];
            char movePosition = stage[newRow][newCol];

            stage[playerRow][playerCol] = movePosition;
            stage[newRow][newCol] = currentPosition;

            playerRow = newRow;
            playerCol = newCol;
        } else {
            System.out.println("(경고!) 해당 명령을 수행할 수 없습니다!");
        }
    }

    private static boolean validateMove(int row, int col) {
        return row >= 0 && row < stage.length && col >=0 && col < stage[row].length && stage[row][col] == ' ';
    }

}
