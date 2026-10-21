class Solution {
    public boolean isAnagram(String s, String t) {
        char[] res1 = s.toCharArray();
        char[] res2 = t.toCharArray();
        Arrays.sort(res1);
        Arrays.sort(res2);
        if(s.length()!=t.length()) return false;
        for(int i=0;i<s.length();i++){
            if(res1[i]!=res2[i]) return false;
        }
        return true;
    }
}
