package bsu.comp152;

public class Food {
    // Define two instance variables
    private String name;
    private int temp;

    /**
     * Constructor to initialize the instance variable name with the nm parameter and
     * set the temperature to the refrigerator temperature of 40 degrees Fahrenheit.
     * @param nm
     */
    public Food(String nm){
        name = nm;
        temp = 40;
    }

    /**
     * Accessor to return the temperature
     * @return temp
     */
    public int getTemp() {
        return temp;
    }

    @Override
    /**
     * Accessor to return a string that details the food's
     * name and temp
     * The string should have the form name (temperature).
     * For example, if you print a chicken filet that is 40 degrees from client code,
     * you should see chicken filet (40 degrees).
     */
    public String toString() {
        return String.format("%s (%d degrees)", name, temp);
    }

    /**
     * Mutator to set the temperature to a new temperature
     * @param newTemp
     */
    public void setTemp(int newTemp){
        temp = newTemp;
    }

}
