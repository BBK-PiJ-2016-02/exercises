import org.junit.*;
import static org.junit.Assert.*;

public class PersonQueueTest {
    @Test
    public void testsInsert() {
        PersonQueue queue = new SupermarketQueue();
        Person person = new Person("Bill", 45);

        queue.insert(person);
    }

    @Test
    public void testsRetrieve() {
        PersonQueue queue = new SupermarketQueue();
        Person person = new Person("Jill", 23);

        queue.insert(person);
        assertEquals(person, queue.retrieve());
    }

    @Test
    public void testsGetSize() {
        PersonQueue queue = new SupermarketQueue();
        Person person1 = new Person("Crystal", 26);
        Person person2 = new Person("Roy", 32);

        assertEquals(0, queue.getSize());
        queue.insert(person1);
        assertEquals(1, queue.getSize());
        queue.insert(person2);
        assertEquals(2, queue.getSize());
        queue.retrieve();
        assertEquals(1, queue.getSize());
        queue.retrieve();
        assertEquals(0, queue.getSize());
    }
}