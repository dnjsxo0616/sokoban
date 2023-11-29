import controller.Controller;
import controller.Stage2MoveController;
import domain.MoveDirection;
import domain.PlayMoveState;
import domain.SecondStage;
import view.output.OutputView;

public class Main {
    public static void main(String[] args) {
        Stage2MoveController stage2MoveController = new Stage2MoveController();
        stage2MoveController.PlayMoveController();
    }
}