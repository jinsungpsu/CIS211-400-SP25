//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        HashTable<String, String> test = new HashTable<>();
        test.put("Hola", "Hello");
        test.put("Hola", "Hello1");
        test.put("Bye", "Goodbye");
        test.put("Uno", "one");

        Pokedex p1 = new Pokedex();
        p1.addPokemon(new Pokemon("Pikachu"));
    }
}
