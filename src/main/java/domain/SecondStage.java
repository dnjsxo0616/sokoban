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
        for(int i=0; i<countColumn(); i++) {
            for(int j=0; j<secondArray[i].length; j++) {
                if(secondArray[i][j].equals("P")) {
                    currentX = i;
                    currentY = j;
                    return;
                }
            }
        }
    }
}
