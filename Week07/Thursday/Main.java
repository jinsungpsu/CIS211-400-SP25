import java.util.HashMap;
import java.util.Map;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // {"Tadesse", "Mulu", "Genet", "Kebede", "Amina"};
        String[] finishers = new String[5000];
        finishers[0] = "Tadesse";
        finishers[1] = "Mulu";

        String[] students = new String[10000000];
        students[7000001] = "Q";





        MyMap<String, Integer> phonebook = new MyMap<>();
        phonebook.put("Mattress Store", 1800123456);
        phonebook.put("Kars for Kids", 888123415);


        System.out.println(phonebook.get("Kars for Kids"));
        System.out.println(phonebook.get("Jed"));
        System.out.println(phonebook.get("Mattress Store"));
        System.out.println(phonebook.get("Elliot"));
    }
}
