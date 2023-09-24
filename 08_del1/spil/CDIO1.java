class RAFFLEMANIA {
    public static void main (String args[]){
        System.out.println("spilbeskrivelse"); 
        // here enter game description


        //made scanner and variables for points and names
        var scanner = new java.util.Scanner(System.in);
        var point1 = 0;
        var point2 = 0;

        System.out.println("What is player 1's name?");
        var player1name = scanner.nextLine();
        System.out.println("May the RAFFLEMANIA be with you " + player1name + "!" + "\n");

        System.out.println("What is player 2's name?");
        var player2name = scanner.nextLine();
        System.out.println("May the RAFFLEMANIA be with you " + player2name + "!" + "\n");



        System.out.println(player1name + ": " + point1);
        System.out.println(player2name + ": " + point2 + "\n");
       
        
        int dice1result = Diceroll.dice1();
        int dice2result = Diceroll.dice2();
        int dicesumresult = dice1result+dice2result;

        System.out.println("First die: " + dice1result + "\n" +
                            "Second die: " + dice2result + "\n" + 
                            "Sum of Dice: " + dicesumresult);


        scanner.close();
    }



class Diceroll{

    static int dice1(){
        //We get a random double value (0 to 1) from the Math.random
        var randomValue = Math.random();
        //Here we convert the double value from the Math.random to an integer
        //and we also have to use Math.floor to round down 
        int dice1 = (int) Math.floor(randomValue*6)+1; 
        return dice1;
        }

    static int dice2(){
        //We get a random double value (0 to 1) from the Math.random
        var randomValue2 = Math.random();
        //Here we convert the double value from the Math.random to an integer
        //and we also have to use Math.floor to round down 
        int dice2 = (int) Math.floor(randomValue2*6)+1; 
        return dice2;
        }
    }

}