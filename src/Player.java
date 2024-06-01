public class Player {

    public int points;
    public Card[] hand;

    public Player(){
        hand = new Card[2];


    }

    public void printHand(){
        for(int x = 0; x < hand.length; x = x + 1){
            hand[x].printCard();
        }
    }


}
