package domain;

public class SecondStage {
    private String[][] secondArray = {
            {"  #######"},
            {"###  O  ###"},
            {"#    o    #"},
            {"# Oo P oO #"},
            {"###  o  ###"},
            {" #   O  #"},
            {" ########"}
    };

    private int currentX;
    private int currentY;

    public SecondStage() {
        findPlayer();
    }

    public String[][] getSecondArray() {
        return secondArray;
    }

    public int getCurrentX() {
        return currentX;
    }

    public int getCurrentY() {
        return currentY;
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
        for(int i=0; i<countColumn(); i++) {
            for(int j=0; j<secondArray[i].length; j++) {
                int index = secondArray[i][j].indexOf("P");
                if (index != -1){
                    currentX = i;
                    currentY = index;
                    return;
                }
            }
        }
    }

    private void moveUpDownPlayer(int x, int y) {
        if(!validateMoveSpace(x, y)) {
            System.out.println("(경고!) 해당 명령을 수행할 수 없습니다!");
        } else {
            StringBuilder currentRow = new StringBuilder(secondArray[currentX][0]);
            StringBuilder newRow = new StringBuilder(secondArray[x][0]);

            currentRow.setCharAt(currentY, ' ');
            newRow.setCharAt(y, 'P');

            secondArray[currentX][0] = currentRow.toString();
            secondArray[x][0] = newRow.toString();

            currentX = x;
            currentY = y;
        }
    }

    private void RightLeftMoveToPlayer(int x, int y) {
        if(!validateMoveSpace(x, y)) {
            System.out.println("(경고!) 해당 명령을 수행할 수 없습니다!");
        } else {
            StringBuilder currentColumn = new StringBuilder(secondArray[currentX][0]);

            currentColumn.setCharAt(currentY, ' ');
            currentColumn.setCharAt(y, 'P');

            secondArray[currentX][0] = currentColumn.toString();
            secondArray[x][0] = currentColumn.toString();

            currentX = x;
            currentY = y;
        }
    }

    private boolean validateMoveSpace(int x, int y) {
        return secondArray[x][0].charAt(y) == ' ';
    }

    public void moveUpdatePlayer(MoveDirection direction) {
        switch (direction) {
            case UP:
                moveUpDownPlayer(currentX - 1, currentY);
                System.out.println(String.valueOf(currentX));
                break;
            case DOWN:
                moveUpDownPlayer(currentX + 1, currentY);
                break;
            case LEFT:
                RightLeftMoveToPlayer(currentX, currentY - 1);
                break;
            case RIGHT:
                RightLeftMoveToPlayer(currentX, currentY + 1);
                break;
            case QUIT:
                System.out.print("Bye~");
                System.exit(0);
        }
    }
}