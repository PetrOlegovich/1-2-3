import java.util.HashMap;
import java.util.Objects;

public class ResearchFather implements  Researchimp<Person>{
    private final HashMap<Node, Node> tree;
    public ResearchChildren(Repository<Person> geoTree){
        tree = geoTree.getDs();

    }
    public String find(Person person) {
        StringBuilder result = new StringBuilder();
        for (Node t : tree.values()) {
            if (Objects.equals(t.p1.getFirstName(), person.getFirstName())) {
                result.append(t.p2).append(" ");
            }
        }
        return String.format( "Children '%s' has father : '%s' ", person, result );
    }

}
