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