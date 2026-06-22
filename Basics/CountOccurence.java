public class CountOccurence {
    public static void main(String[] args) {
        String str = "Automation";
        char ch = 'a';
        int count = 0;

        str = str.toLowerCase();

        for(char c: str.toCharArray()){
            if(c == ch){
                count++;
            }
        }
        System.out.println(count);
    }
}
