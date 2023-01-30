import java.util.Random;

//The purpose of this program is to simulate 10 rolls of the dice. The dice are 6-sided and rolled together in pairs

public class DiceSimulation {


    public static void main(String[] args) {

        int dice1 = 0;
        int dice2 = 0;
        int rolls = 0;

        //creating a random number generator
        Random random = new Random();


        while(rolls < 10){

            //making 2 variables that use the R.N.G. to simulate rolling dice
            dice1 = random.nextInt(6)+1;
            dice2 = random.nextInt(6)+1;
            int total = dice1 + dice2;

            //printing out the value of the first and second die and the total between them
            System.out.print("Dice 1 = " + dice1 + "\t");
            System.out.print("Dice 2 = " +dice2 + "\t");
            System.out.println("Total: " + total);


            //counter that starts at 0. It counts up each iteration until it causes the condition in the while loop
            //to become false. w\o the counter, there would be an infinite loop.
            rolls++;
        }

    }//end main
}
