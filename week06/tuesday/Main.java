//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        for (int i =0; i < 99; i++) {
            System.out.print(i + " ");
            if (i%10 == 0) {
                System.out.println();
            }
        }

        System.out.println("#########################");

        System.out.println("#########################");

        System.out.println("#########################");


        Queue<Character> charQ = new ArrayQueue2<>(5);
        charQ.enqueue('A');
        charQ.enqueue('B');
        charQ.enqueue('C');
        charQ.enqueue('D');
        System.out.println(charQ);  // front: ABCD  :back
        System.out.println(charQ.dequeue());
        System.out.println(charQ.dequeue());
        System.out.println(charQ.dequeue());
        System.out.println(charQ.dequeue());
        charQ.enqueue('E');
        charQ.enqueue('F');
        charQ.enqueue('G');
        System.out.println(charQ);  // EFG
        charQ.enqueue('H');
        charQ.enqueue('I');
        try {
            charQ.enqueue('E'); // throw exception
        } catch (IllegalStateException e) {
            System.out.println("AAHHHH");
        }
        System.out.println(charQ.dequeue());
        System.out.println(charQ.dequeue());


    }
}
