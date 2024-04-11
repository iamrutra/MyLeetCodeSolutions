package Easy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Solution1436 {
    public String destCity(List<List<String>> paths) {
        Set<String> hset = new HashSet<>();

        for (List<String> strings : paths) hset.add(strings.getFirst());

        for (List<String> path : paths) {
            if (!hset.contains(path.get(1))) {
                System.out.println(path.get(1));
                return path.get(1);
            }
        }
        return "What's wrong?";
    }
}
public class Ex1436Solution {
    public static void main(String[] args) {
        Solution1436 sol = new Solution1436();

        List<List<String>> paths = new ArrayList<>();
        paths.add(List.of(new String[]{"London", "New York"}));
        paths.add(List.of(new String[]{"New York","Lima"}));
        paths.add(List.of(new String[]{"Lima","Sao Paulo"}));

        sol.destCity(paths);
    }
}
