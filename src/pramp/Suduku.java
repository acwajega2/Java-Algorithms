//package pramp;
//
//public class Suduku {
//    public static void main(String[] args) {
//        HashSet<Character>[] rows = new HashSet[9];
//        HashSet<Character>[] cols = new HashSet[9];
//        HashSet<Character>[] boxes = new HashSet[9];
//        for(int i = 0; i < 9; i++){
//            rows[i] = new HashSet<>();
//            cols[i] = new HashSet<>();
//            boxes[i] = new HashSet<>();
//        }
//        for(int i = 0; i < 9; i++){
//            for(int j = 0; j < 9; j++){
//                if(board[i][j] != '.'){
//                    int boxIndex = (3*(i/3)) + (j/3);
//                    if(rows[i].contains(board[i][j]) || cols[j].contains(board[i][j]) ||      boxes[boxIndex].contains(board[i][j])) return false;
//                    rows[i].add(board[i][j]);
//                    cols[j].add(board[i][j]);
//                    boxes[boxIndex].add(board[i][j]);
//                }
//            }
//        }
//        return true;
//    }
//}
