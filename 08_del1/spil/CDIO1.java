class RAFFLEMANIA {
    public static void main (String args[]){
        System.out.println("spilbeskrivelse"); 
        // here enter game description
        var spilbeskrivelse = "Hello players, and welcome to a game you will never forget. The game is of course Rafflemania, but you already knew that. \n” The challenge is of course to get 40 points to win the game. You will only require one computer, which runs on Windows 10, to play this game. \n” The game is a two player game, so bad luck number three. In this game, the players take turns to play with a virtual raffle cup and two dice. \n” To use the raffle cup with the two dice, all the player needs to do is press the “Hit” button, which will generate two numbers, which represents the face value of each dice, so each dice head can be between 1-6. \n” The sum of both dice will then be given as points to the player who clicked the “Hit” button. \n” If the player gets two numbers which are the same, (like a 6 & 6, 5 & 5, 4 & 4, 3 & 3, 2 & 2, 1 & 1), then the same player gets to hit again as each double gives an extra turn. \n” However if the player gets a double 1, so 1 & 1, then the player loses all his points, but the player still gets an extra turn. \n” When a player gets to the 40 points mark, then to win the game, the same player has to get a double, (like a 6 & 6, 5 & 5, 4 & 4, 3 & 3, 2 & 2), to win. \n” If a player gets a double 1, 1&1, at the 40 points mark, then he still loses all his points. \n” But if the player doesnt hit a double, then the other player gets to play. \n” There is however a faster way to win the game, and that is with the golden rule, that if a player hits two 6s, so double 6, consecutively in a row during the game turn, then the player wins the game.";


        //made scanner and variables for points and names
        var scanner = new java.util.Scanner(System.in);
        var point1 = 0;
        var point2 = 0;

        System.out.println("What is player 1's name?");
        var player1name = scanner.nextLine();
        System.out.println("May the RAFFLEMANIA be with you " + player1name + "!");

        System.out.println("What is player 2's name?");
        var player2name = scanner.nextLine();
        System.out.println("May the RAFFLEMANIA be with you " + player2name + "!");

        System.out.println(player1name + ": " + point1);
        
        
        
        System.out.println(Diceroll.diceSum());





        scanner.close();
    }



class Diceroll{
    static String diceSum(){

        //We get a random double value (0 to 1) from the Math.random
        var randomValue = Math.random();
        var randomValue2 = Math.random();

        //Here we convert the double value from the Math.random to an integer
        //and we also have to use Math.floor to round down
        int dice1 = (int) Math.floor(randomValue*6)+1; 
        int dice2 = (int) Math.floor(randomValue2*6)+1; 
        //We find the sum, which is the important part
        int diceSum = dice1+dice2;
        //To check if the dice work
        
        return  "Result of first die: " + dice1 + "\n" +
                "Result of second die: " + dice2 + "\n" +
                "Sum of the dice: " + diceSum;
        } 
    }
}