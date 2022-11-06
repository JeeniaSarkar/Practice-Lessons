public class CountCharacter {
    public static void main(String[] args) {
        String example="ywydgfwgdeewliohhd";
        String [] value=example.split("");
        String [] vowels={"a","e","i","o","u"};
        int countvowel=0;
        int countconsonant=0;
        for(int i=0;i<value.length;i++) {
            boolean vowelFound=false;
            for (String x : vowels) {
                if(value[i].equals(x)){
                    countvowel=countvowel+1;
                    vowelFound=true;
                    break;
                }

            }
            if(!vowelFound) {
                countconsonant = countconsonant + 1;
            }
        }
        System.out.println("The consonant count is : "+countconsonant);
        System.out.println("The vowel count is : "+countvowel);
    }
}
