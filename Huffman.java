import java.util.*;

public class Huffman {

    private static int R = 256; // number of character in ASCII

    // Huffman trie node
    private static class Node implements Comparable<Node> {
        private final char ch;
        private final int freq;
        private final Node left, right;

        Node(char ch, int freq, Node left, Node right) {
            this.ch = ch;
            this.freq = freq;
            this.left = left;
            this.right = right;
        }

        private boolean isLeaf() {
            return left == null && right == null;
        }

        @Override
        public int compareTo(Node that) {
            return this.freq - that.freq;
        }
    }

    // build the Huffman trie
    public static Node buildTrie(int[] freq) {
        PriorityQueue<Node> pq = new PriorityQueue<>();
        for (char i = 0; i < R; i++) {
            if (freq[i] > 0)
                pq.offer(new Node(i, freq[i], null, null));
        }

        while (pq.size() > 1) {
            Node left = pq.poll();
            Node right = pq.poll();
            Node parent = new Node('\0', left.freq + right.freq, left, right);
            pq.offer(parent);
        }
        return pq.poll();
    }

    // Write bit string-encoded trie to standard output
    private static void writeTrie(Node x) {
        if (x.isLeaf()) {
            System.out.write(1);
            System.out.write(x.ch);
            return;
        }
        System.out.write(0);
        writeTrie(x.left);
        writeTrie(x.right);
    }

    // make a lookup table from symbols and their encodings
    private static void buildCode(String[] st, Node x, String s) {
        if (!x.isLeaf()) {
            buildCode(st, x.left, s + '0');
            buildCode(st, x.right, s + '1');
        } else {
            st[x.ch] = s;
        }
    }

    // Compress the input text
    public static void compress() {
        Scanner in = new Scanner(System.in);
        String text = in.nextLine();
        int[] freq = new int[R];
        for (int i = 0; i < text.length(); i++) {
            freq[text.charAt(i)]++;
        }

        Node root = buildTrie(freq);

        String[] st = new String[R];
        buildCode(st, root, "");

        writeTrie(root);

        for (int i = 0; i < text.length(); i++) {
            String code = st[text.charAt(i)];
            for (int j = 0; j < code.length(); j++) {
                if (code.charAt(
                    
            }