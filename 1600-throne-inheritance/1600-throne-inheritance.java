import java.util.*;

class ThroneInheritance {

    String king;
    HashMap<String, ArrayList<String>> children = new HashMap<>();
    HashSet<String> dead = new HashSet<>();

    public ThroneInheritance(String kingName) {
        king = kingName;
        children.put(kingName, new ArrayList<>());
    }

    public void birth(String parentName, String childName) {
        children.putIfAbsent(childName, new ArrayList<>());
        children.get(parentName).add(childName);
    }

    public void death(String name) {
        dead.add(name);
    }

    public List<String> getInheritanceOrder() {
        List<String> order = new ArrayList<>();
        dfs(king, order);
        return order;
    }

    private void dfs(String person, List<String> order) {
        if (!dead.contains(person)) {
            order.add(person);
        }

        for (String child : children.get(person)) {
            dfs(child, order);
        }
    }
}