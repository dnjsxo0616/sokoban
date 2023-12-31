package controller;

import domain.CreateMovement;
import domain.MoveDirection;
import domain.PlayMoveState;
import domain.SecondStage;
import view.contents.ContentsMessage;
import view.input.InputView;
import view.output.OutputView;

public class Stage2MoveController {


    public void playMoveController() {
        OutputView.println(ContentsMessage.STAGE_COUNT, 2);
        PlayMoveState playMoveState = new PlayMoveState();
        boolean continueInput = true;

        OutputView.printlnCharArray(playMoveState.getStage());

        while (continueInput) {
            continueInput = userInput(playMoveState);
        }
    }

    private boolean userInput(PlayMoveState playMoveState) {
        CreateMovement createMovement = new CreateMovement(InputView.readInput());
        OutputView.printNewLine();

        for (char command : createMovement.getMovement()) {
            try {
                MoveDirection moveDirection = MoveDirection.fromCommand(command);

                if (moveDirection == MoveDirection.QUIT) {
                    OutputView.println(moveDirection.getCommandMessage());
                    return false;
                }

                playMoveState.movePlayer(moveDirection);
                OutputView.printNewLine();

            } catch (IllegalArgumentException e) {
                OutputView.println(e.getMessage());
                OutputView.printlnCharArray(playMoveState.getStage());
            }
        }

        return true;
    }


}
