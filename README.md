# Advanced Java Programming

## 1 - Generics

### Generic Class Nedir?

Belirli bir veri türünden bağımsız olarak çalışabilen ve tip güvenliğini arttıran sınıflardır. 
Sınıf tanımlaması yaparken belirli bir türü temsil eden parametre alır. 
Bu yeri geldiğinde Integer, yeri geldiğinde String ya da farklı türde olabilir.

run command:

    > javac List.java
    > javac ListDriver.java
    > java ListDriver

### Generic Interface Nedir?

Sınıfların veya başka interface'lerin belirli türleri kullanarak genelleştirilmesini sağlar.

### Generic Method nedir?

Bir veya birden fazla tür parametresi alıp, içerisinde belirli işlemler yapar.
Avantaj - Aynı method ile farklı türlerle çalışabilir.
