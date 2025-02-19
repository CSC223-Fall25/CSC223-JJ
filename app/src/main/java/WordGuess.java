public class WordGuess implements Game {
    
    String[] list = {"bride", "beach", "chair", "hotel", "image"};
    String word;
    char[] guessed;
    int tries;
    boolean won;


    //firstone start
    public void startGame() {

        int index = (int) (Math.random() * list.length);
        word = list[index];
        guessed = new char[word.length()];


        for (int i = 0; i < guessed.length; i++) {
        guessed[i] = '_';} tries = 7;
        won = false;
        System.out.println("Let's Play a Word Game with Jovid");  }


    //secondone printBoard
    public void printBoard() {
        for (int i = 0; i < guessed.length; i++) {

        System.out.print(guessed[i] + " "); }
        System.out.println(); }



    //thirdone takeTurn
    public void takeTurn() {
        System.out.print("Guess a letter or the entire word: ");
        String guess = System.console().readLine().toLowerCase();
        boolean guessed_right = false;

        if (guess.length() == 1) {
            char letter_given = guess.charAt(0);
            for (int i = 0; i < word.length(); i++) {
                if (word.charAt(i) == letter_given && guessed[i] == '_') {
                    guessed[i] = letter_given;
                    guessed_right = true;
                }
}} 
        else if (guess.equals(word)) {
            won = true;
            guessed = word.toCharArray();
            guessed_right = true;}

        if (!guessed_right) {
            tries--;
            System.out.println(guess + " is not in the word. You have " + tries + " chances left.");
        }}



    //fourthone isGameOver
    public boolean isGameOver() {
        won = true;

        for (int i = 0; i < guessed.length; i++) {
            if (guessed[i] == '_') {
                won = false;
                break;}}

        return won || tries == 0;
    
    }

    //fifthone endGame
    public void endGame() {
        if (won) {
            System.out.println("Congrats your guess was correct, the word was: " + word);
} else {
            System.out.println("Sorry, your guesses were wrong, the word was: " + word);}
}


    //sixthone playGame
        public void playGame() {
            String play2 = "yes";
        
            while (play2.equals("yes")) {
                startGame();
                while (!isGameOver()) {
                printBoard();
                takeTurn();
}
                endGame();
        
                System.out.print("Play again? (yes/no): ");
                play2 = System.console().readLine().toLowerCase();}
        
            System.out.println("Thanks for playing!");}
        

    public static void main(String[] args) {
        WordGuess game = new WordGuess();
        game.playGame();
    }
}
