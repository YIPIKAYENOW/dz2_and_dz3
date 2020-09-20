import static org.junit.jupiter.api.Assertions.*;

class AuthorTest {
    public static void main(String[] args)
    {
        Author q1 = new Author ("Harry Harrison",'M',"harry.harrison@gmail.com");
        Author q2 = new Author ("Andre Alice Norton",'W',"andre.alice.norton@gmail.com");
        System.out.println("\n"+q1.toString());
        System.out.println(q2.toString());
    }

}