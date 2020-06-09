public class PlayBlackJack {
    public static void main(String[] args) {
        Card card = new Card();
        int scorePlayer = card.takeCard();
        int scoreDealer = card.takeCard();

        // Initial card
        if(scorePlayer == 1) scorePlayer += 10;
        if(scoreDealer == 1) scoreDealer += 10;

        Player player = new Player(scorePlayer);
        Dealer dealer = new Dealer(scoreDealer);

        System.out.println("Player's 1st card: " + scorePlayer);
        System.out.println("Dealer's 1st card: " + scoreDealer);

        while(player.doTakeCard(scorePlayer)){
            int cardNumber = card.takeCard();
            if(cardNumber == 1){
                cardNumber = player.judgeAce(scorePlayer);
            }
            scorePlayer = player.scoreCalculate(cardNumber);
            System.out.println("Player: " + scorePlayer);
        }

        while(dealer.doTakeCard(scoreDealer)){
            int cardNumber = card.takeCard();
            if(cardNumber == 1){
                cardNumber = dealer.judgeAce(scoreDealer);
            }
            scoreDealer = dealer.scoreCalculate(cardNumber);
            System.out.println("Dealer: " + scoreDealer);
        }

        Result result = new Result(scorePlayer, scoreDealer);
        result.resultShow();
    }
}

