public class BST<T extends Comparable<T>> {
    private Node root;
    private int count = 0;

    public void insert(T item) {
        if (root == null) {
            root = new Node(item, null, null);
        } else {
            insert(item, root);
        }
    }

    private void insert(T item, Node root) {
        // there exists at least one node
        if (item.equals(root.data)) {
            // duplicate
            // not allowed right now...
        } else {
            if (item.compareTo(root.data) < 0) {
                if(root.left == null) {
                    root.left = new Node(item, null, null);
                    return;
                }
                // equivalent of
                // item < root.data
                // go left
                insert(item, root.left);
            } else {
                if (root.right == null) {
                    root.right = new Node(item, null, null);
                    return;
                }
                // go right
                insert(item, root.right);
            }
        }
    }

    class Node {
        T data;
        Node left, right;

        public Node(T data, Node left, Node right) {
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }
}

class Pokemon implements Comparable<Pokemon> {
    private int hp;
    @Override
    public int compareTo(Pokemon o) {
        if (this.hp > o.hp){
            return 1;
        } else if (this.hp < o.hp) {
            return -1;
        }
        return 0;

    }
}

class Cat {
    int age;
}

class App {
    public static void main(String[] args) {
        BST<Pokemon> pokedex = new BST<>();
        //BST<Cat> cats = new BST<>();

        BST<Integer> numTree = new BST<>();

        numTree.insert(5);
        numTree.insert(50);
        numTree.insert(15);
        numTree.insert(25);
        numTree.insert(1);
        numTree.insert(2);
    }
}
