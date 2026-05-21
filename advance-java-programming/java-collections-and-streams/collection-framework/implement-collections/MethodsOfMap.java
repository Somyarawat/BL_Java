import java.util.*;
class MethodsOfMap{
    public static void main(String[] args) {
        Map<String, Integer> scores = new HashMap<>();
        scores.put("Luv", 85);
        scores.put("Kush", 87);
        scores.put("Kartikey", 90);
        scores.put("Luv", 87);
        System.out.println("Scores: " + scores);

        System.out.println("Scores of Kartikey: " + scores.get("Kartikey"));
        System.out.println("Scores of Harshita: " + scores.getOrDefault("Harshita", 0));

        System.out.println("Has Kush: " + scores.containsKey("Kush"));
        System.out.println("Has 90: " + scores.containsValue(90));

        for(Map.Entry<String, Integer> e : scores.entrySet()){
            System.out.println(e);
        }

        scores.keySet().forEach(k -> {
            System.out.println(k);
        });

        scores.values().forEach(v -> {
            System.out.println(v);
        });

        scores.putIfAbsent("Harshita", 89);
        scores.computeIfPresent("Luv",(k, v) -> v + 3);
        scores.merge("Kush", 3, Integer::sum);
        System.out.println("After Updates: " + scores);

        TreeMap<String, Integer> tm = new TreeMap<>(scores);
        System.out.println("TreeMap: " + tm);
        System.out.println("First Key: " + tm.firstKey());
        System.out.println("Last Key: " + tm.lastKey());
    }
}