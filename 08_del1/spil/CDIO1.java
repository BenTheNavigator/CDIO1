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
