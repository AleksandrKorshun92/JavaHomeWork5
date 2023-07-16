import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class JavaHomeWork5 {
    public static void main(String[] args) {
        Map<String, ArrayList<Integer>> phoenbook = new HashMap <>();
        newnumber("Ivan Ivanovich", 8812276, phoenbook);
        newnumber("Alex Petrov", 1007911, phoenbook);
        newnumber("Kirill Petrov", 8874455, phoenbook);
        newnumber("Ivan Ivanovich", 77788855, phoenbook);
        newnumber("Renat", 1235468, phoenbook);
        newnumber("Kirill Petrov", 98542233, phoenbook);
        print(phoenbook);
    }

    public static void print(Map<String, ArrayList<Integer>> newnb) {
        for (var i : newnb.entrySet()) {
            String nummer = "";
            for (int el : i.getValue()) {
                nummer = nummer + el + ", ";
            }
            System.out.printf("%s: %s \n", i.getKey(), nummer);
        }
    }
    public static void newnumber (String key, int value, Map<String, ArrayList<Integer>> newnb) {
        if (newnb.containsKey(key)) {
            newnb.get(key).add(value);
        } else {
            ArrayList<Integer> list = new ArrayList<>();
            list.add(value);
            newnb.put(key, list);
        }
    }

}
