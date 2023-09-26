public class test {
    
    public static void main(String[] args){
        // We start by entering in an array with the amount of possible sums, which is 11
        int[] sumCounts = new int[11];


        // We then make a loop that happens 1000 times
        for(var i = 0; i < 1000; i = i + 1){
            int dice1result = Diceroll.dice();
            int dice2result = Diceroll.dice();
            int dicesumresult = dice1result + dice2result;

            // We now create another array that updates the index that is 2 less than the sum result, since the array starts from 0 and goes to 10 (length of 11)
            sumCounts[dicesumresult - 2]++;

            //If we for example get a dice sum result of 7, it puts the array with the index of 5 up with 1
        }

        // We now make a loop for each possible sum (again 11 in total)
        for (int sum = 2; sum <= 12; sum++) {
            double percentage = ((double) sumCounts[sum-2] /1000) * 100;
            System.out.println("Sum " + sum + " occurred " + sumCounts[sum - 2] + " times. Which is: " + percentage + "%");
        }
    }
}

class Diceroll {

    static int dice(){
        // We get a random double value (0 to 1) from Math.random
        var randomValue = Math.random();
        // Here we convert the double value from Math.random to an integer
        // and we also have to use Math.floor to round down 
        int dice = (int) Math.floor(randomValue * 6) + 1;
        return dice;
    }
}
