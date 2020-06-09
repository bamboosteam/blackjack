import com.sun.source.tree.IfTree;

public class Result {
    private int playerScore;
    private int dealerScore;

    public Result(int playerScore, int dealerScore){
        this.playerScore = playerScore;
        this.dealerScore = dealerScore;
    }

    public void resultShow(){
        System.out.println("Player's final score: " + this.playerScore);
        System.out.println("Dealer's final score: " + this.dealerScore);
        if(this.dealerScore >= 22 && this.playerScore >= 22){
            System.out.println("Dealer wins!");
        }else if(this.playerScore >= 22){
            System.out.println("Dealer wins!");
        }else if(this.dealerScore >= 22){
            System.out.println("Player wins!");
        }else if(this.playerScore == this.dealerScore){
            System.out.println("Draw!");
        }else if(this.playerScore > this.dealerScore){
            System.out.println("Player wins!");
        }else{
            System.out.println("Dealer wins!");
        }
    }

}
