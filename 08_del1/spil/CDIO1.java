class RAFFLEMANIA {
    public static void main (String args[]){
        System.out.println("spilbeskrivelse");

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
