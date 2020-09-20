import static org.junit.jupiter.api.Assertions.*;

class BallTest {
    public static void main(String[] args)
    {
        Ball q1 = new Ball (49,64);
        System.out.println("\n"+q1);
        q1.move(-25,-49);
        System.out.println(q1);
        q1.move(-24,-15);
        System.out.println(q1);
    }

}