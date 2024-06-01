public class Casino {

    public Card[] deck; // declare array of cards
    public Player player1; //future me needs to make an array of Player called players
    public Player[] players;

    public static void main(String[] args) {
        Casino myTable = new Casino();

    }

    public Casino() {
        System.out.println("Game starting!");
        deck = new Card[52]; // construct deck

        int counter = 0;

        for (int x = 1; x <= 4; x = x + 1) {
            for (int i = 1; i <= 13; i = i + 1) {
                Card c = new Card(i, x);

                deck[counter] = c;
                counter++;
//                deck[i - 1].printCard();
            }  // make 13 spades
        }

        shuffle();
//        printDeck();

        //construct player1
        player1 = new Player();
        players = new Player[4];
        //fill players array
        for(int x = 0; x < 3; x++){
            players[x] = new Player();
        }

        deal();
    }

    public void shuffle(){
        // first, swap deck[0] and deck[1] cards
        for(int m = 0; m < 52; m = m + 1) {
            Card temp = deck[m];
            int r = (int) (Math.random() * 52);
            deck[m] = deck[r];
            deck[r] = temp;
        }
        //eventually, loop through all deck
        // swapping each card into a random index



    }

    public void deal(){
        for(int x = 0; x < 3; x++) {
           for(int i = 0; i < 2; i++){
               players[x].hand[i] = deck[(int)(Math.random()*52)];
           }
        }

        for(int x = 0; x < 4; x++) {
            players[x].printHand();
        }

    }


    public void printDeck(){
        for(int x = 0; x < deck.length; x = x + 1){
            deck[x].printCard();

        }
    }

}
