public class Palindrome {
    public static void main(String[] args) {
        String number1="1221";
        String [] split1=number1.split("");
        int countElement=split1.length;


        int temp=countElement/2;
        int end=(countElement %2!=0)?temp+1 : temp;
        int start=temp-1;
        while(end<=countElement-1 && start>=0) {
            System.out.println(start);
            System.out.println(end);
            if (split1[start].equals(split1[end])) {
                end++;
                start--;
            }else{
                System.out.println("Not a palindrome number");
                break;
            }
            System.out.println("It's a palindrome number.");
        }

    }
}
