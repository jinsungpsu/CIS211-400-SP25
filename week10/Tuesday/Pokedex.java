public class Pokedex {
    private HashTable<String, Pokemon> pokedex = new HashTable<>();
    private int count;

    void addPokemon(Pokemon p){
        pokedex.put(p.getName(), p);
    }

    Pokemon getPokemon(String name){
        return null;
    }

    void removePokemon(String name) {

    }

    void displayAllPokemon() {

    }

    int size() {
        return 0;
    }

    void clear() {

    }
}
