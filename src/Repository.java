import java.util.HashMap;

public class Repository<T extends Person> {
    private HashMap<Node, Node> ds;
    private String name;

    public Repository(String name){
        this.ds = new HashMap<>();
        this.name = name;

    }

    public void append(T p1, RelationShips re, T p2){
        switch (re){
            case FATHER -> ds.put(new Node(p1, re, p2), new Node(p2, RelationShips.SON, p1));
            case SON -> ds.put(new Node(p1, re, p2), new Node(p2, RelationShips.FATHER, p1));
            case WIFE -> ds.put(new Node(p1, re, p2), new Node(p2, RelationShips.HUSBANT, p1));
            case HUSBANT -> ds.put(new Node(p1, re, p2), new Node(p2, RelationShips.WIFE, p1));
            case BROTHER -> ds.put(new Node(p1, re, p2), new Node(p2, RelationShips.SISTER, p1));
            case SISTER -> ds.put(new Node(p1, re, p2), new Node(p2, RelationShips.BROTHER, p1));
        }
    }


    @Override
    public String toString() {
        return String.format( "%s", ds);
    }

}
