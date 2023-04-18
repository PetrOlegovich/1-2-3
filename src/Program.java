public class Program {
    public static void main(String[] args) {
        Person f1 = new Person(" Father_1", 55);
        Person c1 = new Person("Children_1 ", 18 );
        Person h1 = new Person(" Husband_1", 40 );
        Person w1 = new Person(" Wife_1 ", 30);

        Repository<Person> repo = new Repository<>( "repo_1");
        repo.append(f1, RelationShips.FATHER, c1);
        repo.append(h1, RelationShips.HUSBANT, w1);
        System.out.println(repo);

        ResearchChildren researchChildren = new ResearchChildren(repo);
        System.out.println(researchChildren.find( f1));
        ResearchChildren researchFather = new ResearchFather(repo);
        System.out.println(researchFather.find( c1));
    }
}
