package domain;

public class FirstStage {
    private String[][] firstArray = {
            {"#####"},
            {"#OoP#"},
            {"#####"}
    };

    public String[][] getFirstArray() {
        return firstArray;
    }

    public int[][] convertArrays() {
        return StageConverter.convertArrays(firstArray);
    }

    public int countWidth() {
        return StageConverter.countWidth(firstArray);
    }

    public int countColumn() {
        return StageConverter.countColumn(firstArray);
    }
}
