package Array;

public class Anagram {
    public static void main(String[] args){
        String[] anagram = {"code","dcoe","ecod","framer","frame"};
        String[] result = new String[anagram.length];
        int[] occurenceIndexArr = new int[anagram.length];

        for(int i=0;i<anagram.length;i++){ //i=0
            boolean continueFurther = true;
//            since default initialised value of integerArray is 0, so we are checking after i>0
            if(i>0){ //i>0 (false)
//                this checks for the index which are already proved to be an anagram, if found then won't continuefurther
                for (int element:occurenceIndexArr) {
                    if(element == i){
                        continueFurther = false;
                        break;
                    }
                }
            }
            if(continueFurther) { //continueFurther=true
                for (int j = i + 1; j < anagram.length; j++) { //j=0+1=1
                    if (anagram[i].length() == anagram[j].length()) { //anagram[0].length==anagram[1].length //4==4 //code==doce
                        String[] arr1 = anagram[i].split(""); //anagram[0]=[c]
                        String[] arr2 = anagram[j].split("");//anagram[1]=[d]
                        int charCounter = 0;
                        for (int k = 0; k < arr1.length; k++) { //k=0, 0<1 arr1.length=1
                            for (int l = 0; l < arr2.length; l++) {//l=0, 0<1 arr2.length=1
                                if (arr1[k].equals(arr2[l])) { //arr1[0]==arr2[0]
                                    charCounter += 1;//c==d (false)
                                }
                            }
                        }
                        if (charCounter == arr1.length) { //0==1
                            result[i] = anagram[i];
                            //Get last empty index.
                            int nonEmptyIndex = 0;
                            for (int m = 0; m < occurenceIndexArr.length; m++) {
                                if (occurenceIndexArr[m] == 0) {
                                    nonEmptyIndex = m;
                                    break;
                                }
                            }
                            occurenceIndexArr[nonEmptyIndex] = j;

                        }
                    } else {
                        result[i] = anagram[i];
                        result[j] = anagram[j];
                        //Get last empty index.
                        int nonEmptyIndex = 0;
                        for (int m = 0; m < occurenceIndexArr.length; m++) {
                            if (occurenceIndexArr[m] == 0) {
                                nonEmptyIndex = m;
                                break;
                            }
                        }
                        occurenceIndexArr[nonEmptyIndex] = j;
                    }
                }
            }
        }
        for (String element:result) {
            System.out.println(element);
        }
    }
}
