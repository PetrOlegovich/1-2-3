public class Node extends Person {
    Person p1;
    RelationShips re;
    Person p2;

    public Node(Person p1, RelationShips re, Person p2){
        this.p1 = p1;
        this.re = re;
        this.p2 = p2;

    }

    public Node(String firstName, int age) {
        super(firstName, age);
    }

    @Override
    public String toString() {
        return String.format( " %s %s %s ", p1, re, p2);

    }
}
