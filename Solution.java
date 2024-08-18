class Solution {
    public static int lengthOfLongestSubstring(String s) {
        char x[] = s.toCharArray();
        int j = 0, count = 0;
        for (int i = 1; i < x.length - 1; i++) {
            if (x[i] != x[i + 1]) {
                j = i;
                count++;
                while (j > 0) {
                    if (x[i] == x[j-1]) {
                        return count;
                        //System.out.println("i=" + i + " x[i]=" + x[i] + " x[i+1]=" + x[i + 1] + " j=" + j + " x[j]="
                                //+ x[j] + " count=" + count);
                    } 
                    
                    /*else if(x[i+1]==x[j]){
                        return count;
                        
                    }*/
                    j--;
                }
            } else
                break;
            System.out.println();
        }

        return count;
    }

    public static void main(String args[]) {
        int c = lengthOfLongestSubstring("abcabcbb");
        System.out.println(c);
    }
}