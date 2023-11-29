package domain;

public enum MoveDirection {
    UP('w', -1, 0),
    LEFT('a', 0, -1),
    DOWN('s', 1, 0),
    RIGHT('d', 0, 1),
    QUIT('q', 0, 0);

    private final char command;
    private final int rowChange;
    private final int colChange;

    MoveDirection(char command, int rowChange, int colChange) {
        this.command = command;
        this.rowChange = rowChange;
        this.colChange = colChange;
    }

    public static MoveDirection fromCommand(char command) {
        char lowerCommand = Character.toLowerCase(command);
        for (MoveDirection direction : values()) {
            if (direction.command == lowerCommand) {
                return direction;
            }
        }
        throw new IllegalArgumentException(lowerCommand + ": (경고!) 해당 명령을 수행할 수 없습니다!");
    }

    public int getRowChange() {
        return rowChange;
    }

    public int getColChange() {
        return colChange;
    }
}
