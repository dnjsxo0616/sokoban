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

    public static Integer countHall(int[][] convertArray) {
        int count = 0;
        for(int[] row : convertArray) {
            for(int number : row) {
                if(number == 1) {
                    count ++;
                }
            }
        }
        return count;
    }

    public static Integer countBall(int[][] convertArray) {
        int count = 0;
        for(int[] row : convertArray) {
            for(int number : row) {
                if(number == 2) {
                    count ++;
                }
            }
        }
        return count;
    }

    public static int[] findPlayerPosition(int [][] convertArray) {
        for(int i=0; i<convertArray.length; i++) {
            for(int j=0; j<convertArray[i].length; j++) {
                if(convertArray[i][j] == 3) {
                    return new int[]{i+1, j+1};
                }
            }
        }
        throw new IllegalArgumentException("플레이어가 존재하지 않습니다.");
    }
}
