public class TypeOfDatatype {
    public static void main(String[] args) {
        Integer a = 5;
        System.out.println(a.getClass().getName());
        System.out.println(a.getClass().getSimpleName());

        int b = 5;
        System.out.println(((Object)b).getClass().getName());
        System.out.println(((Object)b).getClass().getSimpleName());

        char c = 'a';
        System.out.println(((Object)c).getClass().getName());
        System.out.println(((Object)c).getClass().getSimpleName());
    }
}
