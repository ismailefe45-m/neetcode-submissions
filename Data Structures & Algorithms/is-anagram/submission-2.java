class Solution {
    public boolean isAnagram(String s, String t) {
        int[] sS=new int[256];
        int[] tS=new int[256];

        for(int i=0;i<s.length();i++){
            sS[s.charAt(i)]++;
        }
        for(int i=0;i<t.length();i++){
            tS[(t.charAt(i))]++;
        }
        if( Arrays.equals(tS,sS)){
            return true;
        }
        else return false;
    }
}
