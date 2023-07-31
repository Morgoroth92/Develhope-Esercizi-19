/**
 * This class contains various methods con modify the code
 * The author is Claudio Vittorio Carta
 */
public class WordGames {

    /**
     * this adds the word hello before the word
     *
     * @param word is the word in which the Hello will be added
     * @return this will return the phrase Hello + word
     */
    public String addHelloWord(String word) {

        return "Hello " + word;
    }

    /**
     * This method will add the name with the surname
     *
     * @param name    this is the name
     * @param surname this is the surname
     * @return this will return the name + the surname
     */
    public String getFullName(String name, String surname) {

        return name + " " + surname;
    }
}
