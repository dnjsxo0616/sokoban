package domain;

public class SecondStage {
    private String[][] secondArray = {
            {"  #######"},
            {"###  O  ###"},
            {"#    o    #"},
            {"# Oo P oO #"},
            {"###  o  ###"},
            {" #   O  # "},
            {" ######## "}
    };

    private int currentX;
    private int currentY;

    public SecondStage() {
        findPlayer();
    }

    public String[][] getSecondArray() {
        return secondArray;
    }

    public int[][] convertArrays() {
        return StageConverter.convertArrays(secondArray);
    }

    public int countWidth() {
        return StageConverter.countWidth(secondArray);
    }

    public int countColumn() {
        return StageConverter.countColumn(secondArray);
    }

    private void findPlayer() {
        for (int i = 0; i < countColumn(); i++) {
            for (int j = 0; j < secondArray[i].length; j++) {
                if (secondArray[i][j].equals("P")) {
                    currentX = i;
                    currentY = j;
                    return;
                }
            }
        }
    }

    private void validateMoveRange(int x, int y) {
        if (x < 0 || x >= countColumn() || y < 0 || y >= secondArray[x][0].length()) {
            throw new IllegalArgumentException("(경고) 범위를 벗어난 이동입니다.");
        }
    }

    private void validateMoveSpace(int x, int y) {
        if (secondArray[x][0].charAt(y) != ' ') {
            throw new IllegalArgumentException("(경고!) 해당 명령을 수행할 수 없습니다!");
        }
    }

    private void moveToPlayer(int x, int y) {
        StringBuilder currentRow = new StringBuilder(secondArray[currentX][0]);
        StringBuilder newRow = new StringBuilder(secondArray[x][0]);

        currentRow.setCharAt(currentY, ' ');
        newRow.setCharAt(y, 'P');

        secondArray[currentX][0] = currentRow.toString();
        secondArray[x][0] = newRow.toString();

        currentX = x;
        currentY = y;
    }

    private void movePlayer(int x, int y) {
        validateMoveRange(x, y);
        validateMoveSpace(x, y);
        moveToPlayer(x, y);
    }

    public void movePlayer(MoveDirection direction) {
        switch (direction) {
            case UP:
                movePlayer(currentX - 1, currentY);
                break;
            case DOWN:
                movePlayer(currentX + 1, currentY);
                break;
            case LEFT:
                movePlayer(currentX, currentY - 1);
                break;
            case RIGHT:
                movePlayer(currentX, currentY + 1);
                break;
            case QUIT:
                System.out.print("Bye~");
                System.exit(0);
        }
    }
}