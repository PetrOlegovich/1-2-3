
import java.io.FilePermission;
import java.util.HashMap;
import java.util.Objects;

public class ResearchChildren implements Researchimp<Person>{
    private final HashMap<Node, Node> tree;

    public ResearchChildren(Repository<Person> geoTree){
        tree = geoTree.getDs();

    }
    @Override
    public String find(Person person){
        StringBuilder result = new StringBuilder();
        for (Node t : tree.keySet()){
            if(Objects.equals( t.p1.getFirstName(), person.getFirstName() )) {
                result.append( t.p2 ).append( " " );
            }
        }
        return String.format( "Father '%s' has children : '%s' ", person, result );

    }



}