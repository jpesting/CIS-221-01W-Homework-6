/*
Name: Jonathan Pestinger
Class Number: CIS221
Time: Tuesdays and Thursdays at 2:10pm
Period: Spring 2022
*/

abstract class Root { // Private Values class - Used to withhold data from the user
    
    protected int die1 = Roll.roll(); // Assign roll 1 to a protected and randomly generated integer (1-6) using the roll method located in the Roll class
    protected int die2 = Roll.roll(); // Assign roll 2 to a protected and randomly generated integer (1-6) using the roll method located in the Roll class
    protected int sum = die1 + die2; // Assign the sum of the two rolls to a protected variable to be checked against the user's input

    public abstract void setValue(); // Create a public abstract method - Will be used to check the user's input with the sum of the two dice
    public abstract int getValue(); // Create a public abstract method- Will be used to return the value that the user inserted back to them

    protected void correct() { // Protected method to display a correct guess to the user
        System.out.println("\nYou guessed correctly!");
    }

    protected void incorrect() { // Protected method to display an incorrect guess to the user
        System.out.println("\nYou guessed incorrectly!");
    }

}

class Check extends Root { // Extend the Check subclass from the parent Root class

    protected int getSum() { // Getter for the sum of the two rolls
        return sum;
    }
    protected int getRoll1() { // Getter for the value of the first roll
        return die1;
    }
    protected int getRoll2() { // Getter for the value of the second roll
        return die2;
    }
    protected int getValue(int i) {
        return i;
    }
    protected void setValue(int x) { // setValue method - Used as a check to see if the user's input equals the sum of the two rolls
        if (x == getSum()) { // Will return positive feedback if the user's input equalled the sum of the two rolls
            correct();
        } else {
            incorrect();
        }
    }

    // Override
    @Override
    public int getValue() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public void setValue() {
        // TODO Auto-generated method stub
    }

}