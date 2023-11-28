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
}
