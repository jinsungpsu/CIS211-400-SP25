import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Stack<String> stacky = new LinkedStack<>();
        stacky.push("Carl");
        System.out.println(stacky);
        stacky.push("Jed");
        System.out.println(stacky);
        System.out.println(stacky.pop());
        System.out.println(stacky);
        System.out.println(stacky.pop());
        System.out.println(stacky);
        System.out.println(stacky.pop());

        int count = 0;
        while(true) {
            System.out.println(count);
            stacky.push("poop"+count++);
        }








//        String name = null;
//        String blah = "";
//        // int num = null; // this is an error
//        Integer num = null;
//
//        ArrayList<Pokemon> pokelist = new ArrayList<>();
//        pokelist.add(new Pokemon());
//
//
//        DTCC_LinkedList list = new DTCC_LinkedList();
//        list.add(1);
//        list.add(2);
//        list.add(3);

    }
}
class Pokemon {

}
