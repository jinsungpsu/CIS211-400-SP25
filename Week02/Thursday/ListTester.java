public class ListTester {
    public static void main(String[] args) {
        Pokemon pikachu = new Pokemon();
        System.out.println(pikachu.toString());

        List<Integer> list = new ActualList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.remove(3);
        list.remove(1);
        list.add(99);

    }
}

class Pokemon {
    @Override
    public boolean equals(Object another) {
        return true;
    }
}
