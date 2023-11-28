package domain;

public class StageConverter {

    public static int[][] convertArrays(String[][] array) {
        int[][] convertArray = new int[array.length][];

        for(int i = 0; i < array.length; i++) {
            String str = array[i][0];
            convertArray[i] = new int[str.length()];

            for(int j = 0; j < str.length(); j++) {
                convertArray[i][j] = charToNumber(str.charAt(j));
            }
        }
        return convertArray;
    }

    private static int charToNumber(char ch) {
        switch (ch) {
            case ' ':
                return 0;
            case 'O':
                return 1;
            case 'o':
                return 2;
            case 'P':
                return 3;
            case '#':
                return 4;
            default:
                return -1; // 예상치 못한 문자에 대한 처리
        }
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

    public static int countWidth(String[][] array) {
        int maxWidth = 0;
        for(String[] row : array) {
            if(row[0].length() > maxWidth) {
                maxWidth = row[0].length();
            }
        }
        return maxWidth;
    }

    public static int countColumn(String[][] array) {
        int countColumn = 0;
        for(String[] row : array) {
            countColumn ++;
        }

        return countColumn;
    }
}
