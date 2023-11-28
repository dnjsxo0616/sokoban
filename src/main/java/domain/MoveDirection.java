package domain;

public enum MoveDirection {
    UP('w'),
    LEFT('a'),
    DOWN('s'),
    RIGHT('d'),
    QUIT('q');

    private final char command;

    MoveDirection(char command) {
        this.command = command;
    }

    public static MoveDirection fromCommand(char command) {
        char lowerCommand = Character.toLowerCase(command);
        for (MoveDirection direction : values()) {
            if (direction.command == lowerCommand) {
                return direction;
            }
        }
        throw new IllegalArgumentException("(경고) 지원하지 않는 명령입니다!");
    }
}
