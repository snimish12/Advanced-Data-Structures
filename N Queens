class Solution {
    List<List<String>> ans = new ArrayList<>();
    public List<String> arrange(char[][] board){
        List<String> str = new ArrayList<>();
        for(int i=0;i<board.length;i++){
            StringBuilder sb = new StringBuilder();
            for(int j= 0;j<board.length;j++){
                sb.append(board[i][j]);
            }
            str.add(sb.toString());
        }
    return str;
    }
    public void solve(int row, int n, char[][] board, Set<Integer> cols,Set<Integer> diag,Set<Integer> adiag){
        if(row == n){
            ans.add(arrange(board));
            return;
        }
        for(int col = 0; col<n;col++){
            if(cols.contains(col)|| diag.contains(row-col)|| adiag.contains(row+col)){
                continue;
            }
            board[row][col] = 'Q';
            cols.add(col);
            diag.add(row-col);
            adiag.add(row+col);
            solve(row+1, n,board,cols,diag,adiag);
            board[row][col] = '.';
            cols.remove(col);
            diag.remove(row-col);
            adiag.remove(row+col);
        }

    }
    public List<List<String>> solveNQueens(int n) {
        char [][] board = new char [n][n];
        for(char b[]: board){
            Arrays.fill(b,'.');
        }
        Set<Integer> cols = new HashSet<Integer>();
        Set<Integer> diag = new HashSet<Integer>();
        Set<Integer> adiag = new HashSet<Integer>();
        solve(0,n,board,cols, diag, adiag);
    return ans;
    }
}
