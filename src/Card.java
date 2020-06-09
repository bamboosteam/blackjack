import java.util.Random;

public class Card {

    public int takeCard(){
        Random rand = new Random();
        int result = rand.nextInt(13) + 1;
        if(result >= 11){
            result = 10;
        }
        return result;
    }
}
