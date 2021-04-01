class Solution {
    //S1: 4 time DSF
    //S2: Trie
    char[][] _board = null;
    ArrayList<String> res = new ArrayList<>();
    public List<String> findWords(char[][] board, String[] words) {
        // Step1: construct the trie
        TrieNode root = new TrieNode();
        for (String word: words) {
            TrieNode node = root;
            for (Character letter: word.toCharArray()) {
                if (node.children.containsKey(letter)) {
                    node = node.children.get(letter);
                }
                else {
                    TrieNode newNode = new TrieNode();
                    node.children.put(letter, newNode);
                    node = newNode;
                }
            }
            node.word = word; // store words in Trie
        }

        this._board = board;

        // DFS to search board
        for (int i = 0; i < _board.length; i++) {
            for (int j = 0; j < _board[i].length; j++) {
                if (root.children.containsKey(board[i][j])) {
                    dfs(i, j, root);
                }
            }
        }
        return this.res;
    }

    private void dfs(int row, int column, TrieNode root) {
        Character letter = this._board[row][column];
        TrieNode curNode = root.children.get(letter);

        // check if there is any match
        if (curNode.word != null) {
            this.res.add(curNode.word);
            curNode.word = null;
        }

        this._board[row][column] = '#';
        int[] rowOffset = {-1, 0, 1, 0};
        int[] colOffset = {0, 1, 0, -1};
        for (int i = 0; i < 4; i++) {
            int newRow = row + rowOffset[i];
            int newCol = column + colOffset[i];
            if (newRow < 0 || newRow >= this._board.length || newCol < 0 || newCol >= this._board[0].length) {
                continue;
            }
            if (curNode.children.containsKey(this._board[newRow][newCol])) {
                dfs(newRow, newCol, curNode);
            }
        }

        this._board[row][column] = letter;

        if (curNode.children.isEmpty()) {
            root.children.remove(letter);
        }
    }
}

class TrieNode {
    HashMap<Character, TrieNode> children = new HashMap<>();
    String word = null;
    public TrieNode() {

    }
}

// Time: ()