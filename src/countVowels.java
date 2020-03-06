public class countVowels {
    public static int countVowels(String str){
        int count=0;
        String loweredStr= str.toLowerCase();
        for (int i=0; i<loweredStr.length(); i++){
            if(loweredStr.charAt(i)=='a'||loweredStr.charAt(i)=='e'||loweredStr.charAt(i)=='o'||loweredStr.charAt(i)=='u'||loweredStr.charAt(i)=='i'){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countVowels("this is a String."));
        System.out.println(countVowels("Are you checking Upper case?"));

    }
}

