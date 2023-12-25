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