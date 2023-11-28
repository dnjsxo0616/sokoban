package view.input;

import view.contents.ContentsMessage;
import view.output.OutputView;

import java.util.Scanner;

public class InputView {

    public static String readInput() {
        Scanner scanner = new Scanner(System.in);
        OutputView.print(ContentsMessage.INPUT_MOVE_MESSAGE);

        return scanner.nextLine();
    }
}
