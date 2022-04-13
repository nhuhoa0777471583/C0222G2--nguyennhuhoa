package ss8_clean_code_va_refactoring.bai_tap.refactoring;


public class TennisGame {

    public static final char POINT_0 = 0;
    public static final char POINT_1 = 1;
    public static final char POINT_2 = 2;
    public static final char POINT_3 = 3;

    public static String getPoint(String player1Name, String player2Name, int playerScore_1, int playerScore_2) {
        String score = "";
        int tempScore = 0;

        boolean player_1 = playerScore_1 >= 4;
        boolean player_2 = playerScore_2 >= 4;

        if (playerScore_1 == playerScore_2) {
            switch (playerScore_1) {
                case POINT_0:
                    score = "Love-All";
                    break;
                case POINT_1:
                    score = "Fifteen-All";
                    break;
                case POINT_2:
                    score = "Thirty-All";
                    break;
                case POINT_3:
                    score = "Forty-All";
                    break;
                default:
                    score = "Deuce";
                    break;
            }

        }
        else if (player_1 || player_2) {
            score = playerDraw(playerScore_1, playerScore_2);
        } else {
            for (int i = 1; i < 3; i++) {
                if (i == 1) tempScore = playerScore_1;
                else {
                    score += "-";
                    tempScore = playerScore_2;
                }
                switch (tempScore) {
                    case POINT_0:
                        score+="Love";
                        break;
                    case POINT_1:
                        score+="Fifteen";
                        break;
                    case POINT_2:
                        score+="Thirty";
                        break;
                    case POINT_3:
                        score+="Forty";
                        break;
                }
            }
        }
        return score;
    }

    private static String playerDraw(int playerScore_1, int playerScore_2) {
        String score;
        int minusResult = playerScore_1 - playerScore_2;
        if (minusResult == 1) {
            score = "Advantage player1";
        } else if (minusResult == -1) {
            score = "Advantage player2";
        } else if (minusResult >= 2) {
            score = "Win for player1";
        } else {
            score = "Win for player2";
        }
        return score;
    }
}

