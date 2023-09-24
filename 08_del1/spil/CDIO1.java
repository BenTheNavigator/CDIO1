import java.lang.Math;

class Diceroll{
    public static void main(String args[]){
        var randomValue = Math.random();

        //Here we convert the double value from the Math.random to an integer
        //and we also have to use Math.floor to round down
        int dice = (int) Math.floor(randomValue*6)+1; 
        System.out.println(dice);
    } 
}
