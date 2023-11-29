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

}
