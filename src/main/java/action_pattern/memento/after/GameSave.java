package action_pattern.memento.after;

/**
 * 메멘토 객체를 final클래스와 필드를 사용해서 생성
 */
public final class GameSave{
    private final int redTeamScore;

    private final int blueTeamScore;


    public GameSave(int redTeamScore,int blueTeamScore){
        this.redTeamScore = redTeamScore;
        this.blueTeamScore = blueTeamScore;
    }

    public int getBlueTeamScore() {
        return blueTeamScore;
    }

    public int getRedTeamScore() {
        return redTeamScore;
    }
}
