/**
 * This class tester will check the methods in the class WordGames
 *
 * The author is the same as before Claudio Vittorio Carta
 *
 */
public class Tester {

    public static void main(String[] args) {

        /**
         * Here we create a new object called wordGames
         *
         */
        WordGames wordGames = new WordGames();

        /**
         *  here we will test the addHelloWord method
         *
         */
        System.out.println(wordGames.addHelloWord("World"));
        /**
         *
         * and here we will test the getFullName method
         */
        System.out.println(wordGames.getFullName("Pino", "Rossi"));
    }
}
