import java.util.HashMap;
import java.util.Map;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static final int TABLE_SIZE = 353;
    static final double MULTIPLICATION_FACTOR = 0.6123;

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
            int index = hash(pokemonNames[i]);
            int occurrences = frequency.get(index);

            if (occurrences != 0) collisions++;

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

    static int hash(Object o) {


        int index = o.toString().charAt(0);

        if (o.toString().length() > 1) {
            index += o.toString().charAt(1);
        }

        return midSquare(index) % TABLE_SIZE;
//
//        double hashVal = index * MULTIPLICATION_FACTOR;
//        hashVal = hashVal%1;
//
//        return (int)(hashVal*TABLE_SIZE);
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
