# Advanced Java Programming

## 1 - Generics

### Generic Class Nedir?

Belirli bir veri türünden bağımsız olarak çalışabilen ve tip güvenliğini arttıran sınıflardır. 
Sınıf tanımlaması yaparken belirli bir türü temsil eden parametre alır. 
Bu yeri geldiğinde Integer, yeri geldiğinde String ya da farklı türde olabilir.

```
public class List<T> { 
  // Burada List adında class oluşturduk.
  // Class'ımız T generic tür paramtresi alıyor. Böylece class tür bağımsız hale geliyor.

  private T[] datastore;  // Generic türde verilerin depolandığı bir array. 
  private int size; // Dizinin boyutu
  private int pos;  // Dizideki mevcut konumu gösterir(takip etmek için)

  public List(int numElements) {
    // Class, constructor parametresi olarak size'ı alır.
    size = numElements;
    pos = 0; // Başlangıç konum sıfırdır.

    datastore = (T[]) new Object[size]; 
    // Burada aslında bir tür dönüşümü(cast) gerçekleşiyor.
    // Generic'ler doğrudan dizilerin oluşturulmasında kullanılamamaktadır.
    // Object --> Tüm sınıfların ortak üst sınıfı
  }

  public void add(T element) {
    datastore[pos] = element; // pos değerindeki indekse element eklenir
    ++pos; //p++ ile aynı değil. 
    // ++pos, önce pos arttır, sonra değer döndür
    // pos++, önce değer döndür, sonra arttır
  }

  public String toString() {
    String elements = ""; 
    for(int i=0; i < pos; i++) {
      elements += datastore[i] + " ";
    }
    return elements.toString();
  }

}

public class ListDriver{
    public static void main(String[] args) {
        List<String> genericList = new List<String>(10);
        genericList.add("tomato");
        genericList.add("potato");
        System.out.println("Shopping list: " + genericList.toString());

        List<Integer> numbers = new List<Integer>(5);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        System.out.println("Numbers: " + numbers.toString());
    }
}
```

### Generic Interface Nedir?

Sınıfların veya başka interface'lerin belirli türleri kullanarak genelleştirilmesini sağlar.

```
interface Conversion<T1,T2> {
    //Generic bir interface tanımlanmıştır. İki farklı türde parametre alır 
    T1 convert(T2 x); // T2 türündeki bir değeri T1 türüne dönüştürür
    T2 reverseConvert(T1 x); // T1 türündeki bir değeri T2 türüne dönüştürür
}

class Converter implements Conversion<String, Integer> {
    public String convert(Integer x) {
        //Bu metot Integer türündeki değerini String türüne çevirir 
        return x.toString();
    }

    public Integer reverseConvert(String x) {
        //Bu metot String değerini, Integer türüne çevirir.
        return Integer.parseInt(x);
    }
}
```

### Generic Method nedir?

Bir veya birden fazla tür parametresi alıp, içerisinde belirli işlemler yapar.
Avantaj - Aynı method ile farklı türlerle çalışabilir.

```
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
```
