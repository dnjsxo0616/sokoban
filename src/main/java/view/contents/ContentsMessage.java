package view.contents;

public enum ContentsMessage {
    STAGE_COUNT("Stage %d"),
    WIDTH_SIZE("가로 길이: %d"),
    HEIGHT_SIZE("세로 길이: %d"),
    HOLE_COUNT("구멍의 수: %d"),
    BALLS_COUNT("공의 수: %d"),
    PLAYER_POSITION("플레이어 위치: %d행 %d열"),
    INPUT_MOVE_MESSAGE("SOKOVAN> ");

    private final String message;
    ContentsMessage(String message) {
        this.message = message;
    }

    public String getFormattedMessage(int count) {
        return String.format(message, count);
    }

    public String getFormattedPosition(int[] position) {
        return String.format(message, position[0], position[1]);
    }

    public String getMessage() {
        return message;
    }
}
