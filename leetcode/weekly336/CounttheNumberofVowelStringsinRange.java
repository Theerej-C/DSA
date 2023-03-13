public class CounttheNumberofVowelStringsinRange {

    public static int vowelStrings(String[] words, int left, int right) {
        String s = "aeiouAEIOU";
        int count = 0;
        for(int i=left;i<=right;i++){
            char f = words[i].charAt(0);
            char sec = words[i].charAt(words[i].length()-1);
            if(s.contains(f+"")&&s.contains(sec+"")){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String[] ar = {"are","amy","u"};
        int left = 0;
        int right = 2;
        System.out.println(vowelStrings(ar,left,right));
    }
}
