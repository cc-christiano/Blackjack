public class Casino {

    public Card[] deck; // declare array of cards

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
        printDeck();
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

        }





    public void printDeck(){
        for(int x = 0; x < 52; x = x + 1){
            deck[x].printCard();

        }
    }

}
