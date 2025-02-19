public class TicTacToe implements Game {

    char[][] layout = new char[3][3];
    char player;

    //firstone startGame
    public void startGame() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                layout[i][j] = ' ';
    }}
        player = 'X';
        System.out.println("Tic Tac Toe Game with Jovid");
    }

    //secondone printBoard
    public void printBoard() {
        System.out.println("  A B C");

        for (int i = 0; i < 3; i++) {
            System.out.print(i + " ");

        for (int j = 0; j < 3; j++) {
            System.out.print(layout[i][j]);
            if (j < 2) System.out.print("|"); }
            System.out.println();
            if (i < 2) System.out.println("  -+-+-");
    }}

    

    //thirdone takeTurn
    public void takeTurn() {
        System.out.println("Player " + player + "'s turn.");
        System.out.print("Enter square (e.g., A0): ");
        String choice_by_player = System.console().readLine().toUpperCase();

        int columns = choice_by_player.charAt(0) - 'A';
        int rows = choice_by_player.charAt(1) - '0';


        if (columns >= 0 && columns < 3 && rows >= 0 && rows < 3 && layout[rows][columns] == ' ') {
            layout[rows][columns] = player;
            player = (player == 'X') ? 'O' : 'X'; } 
        else {System.out.println("WRONG ONE. TRY AGAIN!"); }}

        

            //fourthone isGameOver
    public boolean isGameOver() {

        // NEed to check the rows and columns first matching
        for (int i = 0; i < 3; i++) {
            if ((layout[i][0] == layout[i][1] && layout[i][1] == layout[i][2] && layout[i][0] != ' ') ||
                (layout[0][i] == layout[1][i] && layout[1][i] == layout[2][i] && layout[0][i] != ' ')) {
                return true;}
}

        // Now dioganals matchig
        if ((layout[0][0] == layout[1][1] && layout[1][1] == layout[2][2] && layout[0][0] != ' ') ||
            (layout[0][2] == layout[1][1] && layout[1][1] == layout[2][0] && layout[0][2] != ' ')) {
            return true;
        }

        // In case no one won 
        for (int i = 0; i < 3; i++) {

         for (int j = 0; j < 3; j++) {
            if (layout[i][j] == ' ') {
           return false; } }
 }
return true;  }


    //fifthone endGame
    public void endGame() {
        char winner = (player == 'X') ? 'O' : 'X';

        if (isWinner(winner)) {
            System.out.println("Player " + winner + " wins!");} 
        else {System.out.println("Noone won, it is a draw");
        }}

    //sixthone isWinner
    private boolean isWinner(char player) {
    return isGameOver() && this.player != player;}
        

    //seventhone playGame
    public void playGame() {
        startGame();
        while (!isGameOver()) {
            printBoard();
            takeTurn(); }
        printBoard();
        endGame(); }

    public static void main(String[] args) {
        TicTacToe game = new TicTacToe();
        game.playGame();
    }}