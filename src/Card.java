public class Card {

    public int cardNum;
    public int points;
    public String suitName;
    public int suitNum;
    public String cardName;

    public Card(int paramCardNum, int paramSuit){
        cardNum = paramCardNum;
        suitNum = paramSuit;

        if(suitNum == 1){
            suitName = "spades";
        }

        if(suitNum == 2){
            suitName = "diamonds";
        }

        if(suitNum == 3){
            suitName = "clubs";
        }

        if(suitNum == 4){
            suitName = "hearts";
        }

        if(cardNum == 1){
            cardName = "ace";
        }

        if(cardNum == 11){
            cardName = "jack";
        }

        if(cardNum == 2){
            cardName = "2";
        }

        if(cardNum == 3){
            cardName = "3";
        }

        if(cardNum == 4){
            cardName = "4";
        }

        if(cardNum == 5){
            cardName = "5";
        }

        if(cardNum == 6){
            cardName = "6";
        }

        if(cardNum == 7){
            cardName = "7";
        }

        if(cardNum == 8){
            cardName = "8";
        }

        if(cardNum == 9){
            cardName = "9";
        }

        if(cardNum == 10){
            cardName = "10";
        }

        if(cardNum == 12){
            cardName = "queen";
        }

        if(cardNum == 13){
            cardName = "king";
        }

    }

    public void printCard(){

        System.out.println("You have a " + cardName + " of " + suitName);
    }
}
