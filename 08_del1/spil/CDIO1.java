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
        System.out.println("May the RAFFLEMANIA be with you " + player1name + "!");

        System.out.println("What is player 2's name?");
        var player2name = scanner.nextLine();
        System.out.println("May the RAFFLEMANIA be with you " + player2name + "!");

        System.out.println(player1name + ": " + point1);
        

        






        scanner.close();
    }


}
class Diceroll{
    public static void main(String args[]){

        //We get a random double value (0 to 1) from the Math.random
        var randomValue = Math.random();
        var randomValue2 = Math.random();

        //Here we convert the double value from the Math.random to an integer
        //and we also have to use Math.floor to round down
        int dice = (int) Math.floor(randomValue*6)+1; 
        int dice2 = (int) Math.floor(randomValue2*6)+1; 
        //We find the sum, which is the important part
        var diceSum = dice+dice2;
        //To check if the dice work
        System.out.println("First dice: " + dice);
        System.out.println("Second dice: " + dice2);
        System.out.println("Sum: " + diceSum);
    } 
}
