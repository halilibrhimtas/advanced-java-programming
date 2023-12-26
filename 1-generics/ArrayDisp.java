public class ArrayDisp {
    static <T> void Display(T[] arr) {
        // Generic bir metottur. --> <T>
        // Metot tanımlamasında static kullanımı ile Display metotu sınıf üzerinden çağrılabilir.
        // Herhangi bir örneği(instance) oluşturulmadan bellekte yeri ayrılır ve sınıf üzerinden çağrılır.
        for(int i=0; i < arr.length; ++i) {
            if(arr[i] != null) {
                System.out.println(arr[i] + " ");
            }
        }
    }

    public static void main(String[] args) {
        String[] names = new String[6];
        names[0] = "Name1";
        names[1] = "Name2";
        names[2] = "Name3";
        names[3] = "Name4";
        names[4] = "Name5";
        names[5] = "Name6";
        Display(names);
    }
}