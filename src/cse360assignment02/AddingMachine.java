package cse360assignment02;

public class AddingMachine {
    private int total;
    private String together;

    /**
     * AddingMachine contains total variable and together to print out expressions
     */
    public AddingMachine () {
        total = 0;  // not needed - included for clarity
        together = "" + total;
    }

    /**
     * getTotal returns total
     * @return total
     */
    public int getTotal () {
        return total;
    }

    /**
     * add method takes in a value then adds it to together to be printed, prints method purpose and value
     * @param value
     */
    public void add (int value) {
        together += " + " + value;
        System.out.println("myCalulcator.add " + "(" + value + ");");
    }

    /**
     * subtract method does the same as add method except subtracts
     * @param value
     */
    public void subtract (int value) {
        together += " - " + value;
        System.out.println("myCalulcator.subtract " + "(" + value + ");");

    }

    /**
     * toString method returns together, results in the printing of the expression
     * @return together
     */
    @Override
    public String toString () {
        return together;
    }

    /**
     * clear method unknown purpose
     */
    public void clear() {
    }

    /**
     * Main runs the program, inputs the example numbers from assignment page.
     * @param args
     */
    public static void main(String[] args)
    {
        AddingMachine mach = new AddingMachine();
        mach.add(4);
        mach.subtract(2);
        mach.add(5);
        System.out.println(mach.toString());

    }
}
