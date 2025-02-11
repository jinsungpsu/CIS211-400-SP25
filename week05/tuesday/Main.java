//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Queue<Character> charQ = new ArrayQueue<>(5);
        charQ.enqueue('A');
        charQ.enqueue('B');
        charQ.enqueue('C');
        charQ.enqueue('D');
        System.out.println(charQ.dequeue());
        System.out.println(charQ.dequeue());
        System.out.println(charQ.dequeue());
        System.out.println(charQ.dequeue());
    }
}
