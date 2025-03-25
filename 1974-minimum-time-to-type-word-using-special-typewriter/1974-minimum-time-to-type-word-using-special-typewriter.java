class Solution {
    public int minTimeToType(String word) {
        int []freq = new int[26];
        int n = word.length();
        int j = 0, cnt  = 0;
        for ( int i = 26; i >= 1; i-- ) {
            freq[j++] = i;
        }
        cnt = Math.min(word.charAt(0) - 'a', freq[word.charAt(0) - 'a']);
        for ( int i = 0; i < n - 1; i++) {
            char ch2 = word.charAt(i);
            char ch1 = word.charAt(i + 1);
            if ( ch1 - ch2 >= 0 ) {
            int dif1 = ch1 - ch2;
            int dif2 = ( (ch2 - 'a') + ( freq[ch1 - 'a'] )  );
            cnt += (Math.min( dif1, dif2 ));
            }
            else {
            int dif1 = ch2 - ch1;
            int dif2 =  (ch1 - 'a') + ( freq[ch2 - 'a'] );
            cnt += (Math.min( dif1, dif2 ));
            }
        }
        return cnt + n;  
    }
}