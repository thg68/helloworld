public class squeue {
    public static class Queue<Item> {
        private Node<Item> first = null;
        private Node<Item> last = null;

        private static class Node<Item> {
            private Item item;
            private Node<Item> next;
        }
        public Queue() {
            first = null;
            last = null;
        }

        public void EnQueue (Item item) {
            Node<Item> oldlast = last;
            last = new Node<Item>();
            last.item = item;
            last.next = null;

            if (isEmpty()) {
                first = last;
            } else {
                oldlast.next = last;
            }
        }

        public Item Dequeue() {
            Item item = first.item;
            first = first.next;
            if (isEmpty()) last = null;
            return item;
        }

        public Item peek() {
            return first.item;
        }

        public boolean isEmpty() {
            return first == null;
        }
    }
}
