package domain;

public class FirstStage {
    private static String[][] array = {
            {"#####"},
            {"#OoP#"},
            {"#####"}
    };

    private static int[][] convertArrays() {
        int[][] convertArray = new int[array.length][];

        for(int i=0; i<array.length; i++) {
            convertArray[i] = new int[array[i][0].length()];
            for(int j=0; j<array[i].length; j++) {
                switch (array[i][0].charAt(j)) {
                    case ' ':
                        convertArray[i][j] = 0;
                        break;
                    case 'O':
                        convertArray[i][j] = 1;
                        break;
                    case 'o':
                        convertArray[i][j] = 2;
                        break;
                    case 'P':
                        convertArray[i][j] = 3;
                        break;
                    case '#':
                        convertArray[i][j] = 4;
                        break;


                }
            }
        }
        return convertArray;
    }
}
