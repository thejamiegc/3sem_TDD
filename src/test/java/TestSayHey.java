import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestSayHey {
    SayHey sayHey;
    @BeforeEach
    void setUp() {
        sayHey = new SayHey();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    public void hello(){
        String actual = sayHey.Hello("bob");
        String expected = "Hello, bob.";
        assertEquals(expected,actual);
    }

    @Test
    public void nullHello(){
        String actual = sayHey.Hello("");
        String expected = "Hello, my friend.";
        assertEquals(expected,actual);
    }

    @Test
    public void allCapsHello(){
        String actual = sayHey.Hello("JERRY");
        String expected = "HELLO, JERRY!";
        assertEquals(expected,actual);
    }

    @Test
    public void arrayHello(){
        String[] names = new String[]{"Jill", "Jane"};
        String actual = sayHey.Hello(names);
        String expected = "Hello, Jill and Jane.";
        assertEquals(expected,actual);
    }

    @Test
    public void arrayCommaHello(){
        String[] names = new String[]{"Amy", "Brian", "Charlotte"};
        String actual = sayHey.Hello(names);
        String expected = "Hello, Amy, Brian, and Charlotte.";
        assertEquals(expected,actual);
    }

}
