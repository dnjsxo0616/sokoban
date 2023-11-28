package controller;

import domain.FirstStage;
import domain.SecondStage;
import domain.StageConverter;
import view.contents.ContentsMessage;
import view.output.OutputView;

public class Controller {

    public void play() {
        firstStagePlay();
        secondStagePlay();
    }

    private void firstStagePlay() {
        OutputView.println(ContentsMessage.STAGE_COUNT, 1);
        OutputView.printNewLine();

        FirstStage firstStage = new FirstStage();
        OutputView.printlnArray(firstStage.getFirstArray());
        OutputView.printNewLine();

        int [][] convertArray = firstStage.convertArrays();
        OutputView.println(ContentsMessage.WIDTH_SIZE, firstStage.countWidth());
        OutputView.println(ContentsMessage.HEIGHT_SIZE, firstStage.countColumn());
        OutputView.println(ContentsMessage.HOLE_COUNT, StageConverter.countHall(convertArray));
        OutputView.println(ContentsMessage.BALLS_COUNT, StageConverter.countBall(convertArray));
        OutputView.println(ContentsMessage.PLAYER_POSITION, StageConverter.findPlayerPosition(convertArray));
    }

    private void secondStagePlay() {
        OutputView.println(ContentsMessage.STAGE_COUNT, 2);
        OutputView.printNewLine();

        SecondStage secondArray = new SecondStage();
        OutputView.printlnArray(secondArray.getSecondArray());
        OutputView.printNewLine();

        int [][] convertArray = secondArray.convertArrays();
        OutputView.println(ContentsMessage.WIDTH_SIZE, secondArray.countWidth());
        OutputView.println(ContentsMessage.HEIGHT_SIZE, secondArray.countColumn());
        OutputView.println(ContentsMessage.HOLE_COUNT, StageConverter.countHall(convertArray));
        OutputView.println(ContentsMessage.BALLS_COUNT, StageConverter.countBall(convertArray));
        OutputView.println(ContentsMessage.PLAYER_POSITION, StageConverter.findPlayerPosition(convertArray));
    }
}
