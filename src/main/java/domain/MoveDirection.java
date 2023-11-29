package domain;

public enum MoveDirection {
    UP('W', -1, 0),
    LEFT('A', 0, -1),
    DOWN('S', 1, 0),
    RIGHT('D', 0, 1),
    QUIT('Q', 0, 0);

    private final char command;
    private final int rowChange;
    private final int colChange;

    MoveDirection(char command, int rowChange, int colChange) {
        this.command = command;
        this.rowChange = rowChange;
        this.colChange = colChange;
    }

    public static MoveDirection fromCommand(char command) {
        char upperCommand = Character.toUpperCase(command);
        for (MoveDirection direction : values()) {
            if (direction.command == upperCommand) {
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
