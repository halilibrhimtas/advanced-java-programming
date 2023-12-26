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

public class ConversionProgram{
    public static void main(String[] args) {
        Converter converter = new Converter();
        String string1 = "123";
        int number1 = 456;

        System.out.println(converter.convert(number1).getClass().getName());
        System.out.println(converter.reverseConvert(string1).getClass().getName());
    }
}