public class SimpleStartupGame {

    public static void main(String[] args) {
        int numOfGuesses = 0;
        int locStart = (int) (Math.random() * 10);
        
        SimpleStartup startup = new SimpleStartup();
        int[] startupLocations = {locStart, locStart+1, locStart+2 };
        startup.setLocationCells(startupLocations);

        boolean isAlive = true;

        while(isAlive) {
            int guess = (int) System.in.readLine("enter a number");
            numOfGuesses++;
            String result = startup.checkYourself(guess);
            System.out.println(result);

            if (result == "kill") {
                isAlive = false;
                System.out.println("You took " + numOfGuesses + " guesses");
            }
        }

        
    }
}