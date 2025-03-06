import java.util.HashMap;
import java.util.Map;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static final int TABLE_SIZE = 353;

    public static void main(String[] args) {
        String[] pokemonNames = {
                "Bulbasaur", "Ivysaur", "Venusaur", "Charmander", "Charmeleon", "Charizard",
                "Squirtle", "Wartortle", "Blastoise", "Caterpie", "Metapod", "Butterfree",
                "Weedle", "Kakuna", "Beedrill", "Pidgey", "Pidgeotto", "Pidgeot",
                "Rattata", "Raticate", "Spearow", "Fearow", "Ekans", "Arbok",
                "Pikachu", "Raichu", "Sandshrew", "Sandslash", "Nidoran♀", "Nidorina",
                "Nidoqueen", "Nidoran♂", "Nidorino", "Nidoking", "Clefairy", "Clefable",
                "Vulpix", "Ninetales", "Jigglypuff", "Wigglytuff", "Zubat", "Golbat",
                "Oddish", "Gloom", "Vileplume", "Paras", "Parasect", "Venonat",
                "Venomoth", "Diglett", "Dugtrio", "Meowth", "Persian", "Psyduck",
                "Golduck", "Mankey", "Primeape", "Growlithe", "Arcanine", "Poliwag",
                "Poliwhirl", "Poliwrath", "Abra", "Kadabra", "Alakazam", "Machop",
                "Machoke", "Machamp", "Bellsprout", "Weepinbell", "Victreebel",
                "Tentacool", "Tentacruel", "Geodude", "Graveler", "Golem",
                "Ponyta", "Rapidash", "Slowpoke", "Slowbro", "Magnemite", "Magneton",
                "Farfetch’d", "Doduo", "Dodrio", "Seel", "Dewgong", "Grimer",
                "Muk", "Shellder", "Cloyster", "Gastly", "Haunter", "Gengar",
                "Onix", "Drowzee", "Hypno", "Krabby", "Kingler", "Voltorb",
                "Electrode", "Exeggcute", "Exeggutor", "Cubone"
        };


        // hash values between 0 and 352 inclusive
        Map<Integer, Integer> frequency = new HashMap<>();
        for (int i = 0; i < TABLE_SIZE; i++) {
            frequency.put(i, 0);
        }

        int collisions = 0;

        for(int i = 0; i < pokemonNames.length; i++) {
            int index = hash(pokemonNames[i],4);
            int occurrences = frequency.get(index);

            if (occurrences != 0)
                collisions++;

            frequency.put(index, ++occurrences);
        }

        for (int i = 0; i < TABLE_SIZE; i++) {
            System.out.println("Index " + i + " had " + frequency.get(i) + " occurrences.");
        }

        System.out.println("Total collisions: " + collisions);
        // only taking first character
        // resulted in 83 collisions

        // taking 2nd character also
        // 72 collisions

        // multiplication method
        // using factor of 0.0123
        // resulted in 72 collisions
        // with a lot of empty spots at the end
    }

    static int hash(Object o, int option) {
        switch(option) {
            case 1:
                // one character
                return stringHash(o.toString(), 1);
            case 2:
                // two characters
                return stringHash(o.toString(), 2);
            case 3:
                // multiplication
                final double MULTIPLICATION_FACTOR = 0.6123;
                return multiplicationHash(stringHash(o.toString(), 2), MULTIPLICATION_FACTOR);
            case 4:
                return midSquare(stringHash(o.toString(), 2)) % TABLE_SIZE;
            default:
                break;
        }
        return 0;
    }

    static int multiplicationHash(int key, double factor) {
        double hashVal = key * factor;
        hashVal = hashVal%1;

        return (int)(hashVal*TABLE_SIZE);
    }

    static int stringHash(String key, int length) {
        int index = 0;
        if (key.length() >= length) {
            for (int i = 0; i < length; i++) {
                index += key.charAt(i);
            }
        }
        return index;
    }

    private static int midSquare(int n) {
        n *= n;
        String num = String.valueOf(n);
        num = num.substring(1,4);
        return Integer.parseInt(num);
    }
}

class Pokemon {

}
