package Map;

public class Main {
    public static void main(String[] args) {
        MyMap<String, Integer> myMap = new MyMap<>();

        myMap.put("Pardo", 10);
        myMap.put("Mingla", 20);
        myMap.put("Talisay", 30);

        try{
        System.out.println("Value of Pardo: " + myMap.get("Pardo"));
        System.out.println("Value of Talisay: " + myMap.get("Talisay"));
        System.out.println("Value of N.Bacalso: " + myMap.get("N.Bacalso"));

        System.out.println("Removed value of Pardo: " + myMap.remove("Pardo"));
        System.out.println("Removed value of Talisay: " + myMap.remove("Talisay"));
        System.out.println("Removed value of N.Bacalso: " + myMap.remove("N.Bacalso"));

        System.out.println();

        MyMap<String, Double> myMap2 = new MyMap<>();

        myMap2.put("Pardo", 20.51);
        myMap2.put("Mingla", 30.15);
        myMap2.put("Talisay", 100.12);

        System.out.println("Value of Pardo: " + myMap2.get("KEY1"));
        System.out.println("Value of Mingla: " + myMap2.get("Mingla"));
        System.out.println("Value of N.Bacalso: " + myMap2.get("N.Bacalso"));

        System.out.println("Removed value of Pardo: " + myMap2.remove("Pardo"));
        System.out.println("Removed value of Talisay: " + myMap2.remove("Talisay"));
        System.out.println("Removed value of N.Bacalso: " + myMap2.remove("N.Bacalso"));
    }catch(IllegalArgumentException e){
        e.getMessage();
    }
}
}