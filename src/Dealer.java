public class Dealer{
    private int score;
    static int THRESHOLD = 17;

    public Dealer(int score){
        this.score = score;
    }

    public boolean doTakeCard(int score){
        if(score < this.THRESHOLD){
            return true;
        }
        return false;
    }

    public int scoreCalculate(int card){
        this.score += card;
        return this.score;
    }

    public int judgeAce(int score){
        if(score <= 10){
            return 11;
        }else{
            return 1;
        }
    }
}
