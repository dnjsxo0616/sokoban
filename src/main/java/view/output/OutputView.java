package view.output;

import view.contents.ContentsMessage;

public class OutputView {

    public static void println(ContentsMessage contentsMessage, int count) {
        System.out.println(contentsMessage.getFormattedMessage(count));
    }

    public static void printNewLine() {
        System.out.println();
    }

    public static void println(ContentsMessage contentsMessage, int row, int columns) {
        System.out.println(contentsMessage.getFormattedPosition(row, columns));
        printNewLine();
    }

    public static void printlnArray(String[][] array) {
        for(String[] row : array) {
            for(String column : row) {
                System.out.println(column);
            }
            System.out.println();
        }
        printNewLine();
    }
}
