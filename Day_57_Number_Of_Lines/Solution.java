package Day_57_Number_Of_Lines;

class Solution {
    public int[] numberOfLines(int[] widths, String S) {
        int pos = 0;
        int line = 1;
        //int n = 0;
        for(int i = 0; i < S.length(); i++){
            pos += widths[S.charAt(i) - 'a'];
            if(pos > 100){
                line++;
                pos = 0;
                i--;
             }
        }
        int [] num = new int[2];
        num[0] = line;
        num[1] = pos;
        return num;
    }
}
