class RAFFLEMANIA {
    public static void main (String args[]){
        
        System.out.println("Hello players, and welcome to a game you will never forget. The game is of course Rafflemania, but you already knew that. The challenge is to get 40 points to win the game. The game is a two player game, so bad luck number three. In this game, the players take turns to play with a virtual raffle cup and two dice. To use the raffle cup with the two dice, all the player needs to do is press the 'r' button, which will generate two numbers, which represents the face value of each 6-sided die. The sum of both dice will then be given as points to the player whose turn it was. If the player gets two numbers which are the same, then the same player gets to roll again. However if the player gets a double 1, then the player loses all his points, but the player still gets an extra turn. When a player gets to the 40 points mark, then to win the game, the same player has to get a double to win. If a player gets a double 1, at the 40 points mark, then he just loses all his points. If the player doesn't hit a double, then the other player gets to play. There is however a faster way to win the game, and that is with the golden rule, that if a player hits double 6s, twice in a row, then the player wins the game immediately.");

        //made scanner and variables for points and names
        var scanner = new java.util.Scanner(System.in);
        var point1 = 0;
        var point2 = 0;

        //Makes player1 start and helps change between the two
        var currentplayer = 1;

        System.out.println("\n"+"What is player 1's name?");
        var player1name = scanner.nextLine();
        System.out.println("May the RAFFLEMANIA be with you " + player1name + "!" + "\n");

        System.out.println("What is player 2's name?");
        var player2name = scanner.nextLine();
        System.out.println("May the RAFFLEMANIA be with you " + player2name + "!" + "\n");



        System.out.println(player1name + ": " + point1);
        System.out.println(player2name + ": " + point2 + "\n");
       
        System.out.println("Press 'r' and 'Enter' to roll the dice and start the game");

        //Basically the game. We put it inside a loop to keep running
        while (scanner.hasNextLine()){
            var rollInput = scanner.nextLine(); 

            //If the user enters "r" the game begins and they roll the dice
            if(rollInput.equals("r")){
                int dice1result = Diceroll.dice();
                int dice2result = Diceroll.dice();
                int dicesumresult = dice1result+dice2result;
                System.out.println( "First die: " + dice1result + "\n" +
                                    "Second die: " + dice2result + "\n" + 
                                    "Sum of Dice: " + dicesumresult + "\n");

            //We need to check if they get an extra turn
            if(dice1result==dice2result){
                if (currentplayer==1) {
                    //We need to check if both die show 1, as that will remove all points

                    if(dice1result+dice2result==2){
                        System.out.println("Ouch... I'm sorry " + player1name + " but you just lost all your point");
                        point1=0;
                        System.out.println("Press 'r' and 'Enter' to roll the dice again" + "\n");
                    }
                    if(point1>=40){
                        System.out.println("CONGRATS " + player1name + " you just won the game");
                        break;
                    }else {
                        point1+=dicesumresult;
                        System.out.println("How lucky! You just got an extra turn!");
                        System.out.println("Press 'r' and 'Enter' to roll the dice again" + "\n");
                    }
                    System.out.println("The turn stays with: " + player1name + "\n");
                }
                if (currentplayer==2){

                    if(dice1result+dice2result==2){
                        System.out.println("Ouch... I'm sorry " + player2name + " but you just lost all your point");
                        point2=0;
                        System.out.println("Press 'r' and 'Enter' to roll the dice again" + "\n");
                    }
                    if(point2>=40){
                        System.out.println("CONGRATS " + player2name + " you just won the game");
                        break;
                    }else {
                        point2+=dicesumresult;
                        System.out.println("How lucky! You just got an extra turn!");
                        System.out.println("Press 'r' and 'Enter' to roll the dice again" + "\n");
                    }      
                    System.out.println("The turn stays with: " + player2name + "\n");
                }
            //If the dice arent equal we run the normal program
            }else{
                 if (currentplayer==1){
                    point1+=dicesumresult;
                    currentplayer=2;
                    System.out.println("Press 'r' and 'Enter' to roll the dice" + "\n");
                    System.out.println("The turn goes to: " + player2name + "\n");

            }   else{
                    point2+=dicesumresult;
                    currentplayer=1;
                    System.out.println("Press 'r' and 'Enter' to roll the dice" + "\n");
                    System.out.println("The turn goes to: " + player1name + "\n");
                }
            }
                System.out.println(player1name + ": " + point1);
                System.out.println(player2name + ": " + point2 + "\n");
            

            
            }
        }
        scanner.close();
    }
}


class Diceroll{

    static int dice(){
        //We get a random double value (0 to 1) from the Math.random
        var randomValue = Math.random();
        //Here we convert the double value from the Math.random to an integer
        //and we also have to use Math.floor to round down 
        int dice = (int) Math.floor(randomValue*6)+1; 
        return dice;
    }
}
