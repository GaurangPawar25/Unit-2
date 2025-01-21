public class Reference {
    public static void main(String[] args) {
        System.out.println("hello");
        int a[] ={1,3,5,7,9,11};
        System.out.println(a[1]);
        change(a);
        System.out.println(a[1]);
    }

    private static void change(int[] a) {
        a[1] = 0;
    }
}