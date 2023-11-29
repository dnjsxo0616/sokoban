package domain;

public enum MoveDirection {
    UP('W', -1, 0, "W: 위로 이동합니다."),
    LEFT('A', 0, -1, "A: 왼쪽으로 이동합니다."),
    DOWN('S', 1, 0, "S: 아래쪽으로 이동합니다."),
    RIGHT('D', 0, 1, "S: 아래쪽으로 이동합니다."),
    QUIT('Q', 0, 0, "Bye~");

    private final char command;
    private final int rowChange;
    private final int colChange;
    private final String commandMessage;

    MoveDirection(char command, int rowChange, int colChange, String commandMessage) {
        this.command = command;
        this.rowChange = rowChange;
        this.colChange = colChange;
        this.commandMessage = commandMessage;
    }

    public static MoveDirection fromCommand(char command) {
        char upperCommand = Character.toUpperCase(command);
        for (MoveDirection direction : values()) {
            if (direction.command == upperCommand) {
                System.out.println(direction.commandMessage);
                return direction;
            }
        }
        throw new IllegalArgumentException(upperCommand + ": (경고) 지원하지 않는 명령입니다!");
    }

    public int getRowChange() {
        return rowChange;
    }

    public int getColChange() {
        return colChange;
    }
}
