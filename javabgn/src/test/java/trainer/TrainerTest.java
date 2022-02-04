package trainer;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrainerTest {

    Trainer youngTrainer;

    @BeforeEach
    void init() {
        youngTrainer = new Trainer("Nagy Béla", 19, new Address("Budapest", "Fő utca", 3));
    }

    @Test
    void testCreate() {
        assertEquals("Nagy Béla", youngTrainer.getNameOfTrainer());
        assertEquals(19, youngTrainer.getAge());
        assertEquals("Budapest", youngTrainer.getAddress().getCity());
        assertEquals(3, youngTrainer.getAddress().getHouseNumber());
    }

    @Test
    void testCourseList() {
        assertEquals(0, youngTrainer.getCourses().size());

        youngTrainer.addCourse(new Course("matek", 30));

        assertEquals(1, youngTrainer.getCourses().size());
        assertEquals("matek", youngTrainer.getCourses().get(0).getTitle());
    }

    @Test
    void testAsserts() {
        String word = null;

        assertNull(word);
        assertNotNull(youngTrainer);

        assertNotEquals("John", youngTrainer.getNameOfTrainer());

        Trainer trainer2 = new Trainer("John Doe", 34, new Address("Budapest", "Fő utca", 3));
        assertNotSame(youngTrainer, trainer2);

        Trainer trainer = trainer2;
        assertSame(trainer, trainer2);

        assertTrue("Nagy Béla".equals(youngTrainer.getNameOfTrainer()));
        assertFalse(youngTrainer.getAge() == 74);
        assertEquals(true, "Nagy Béla".equals(youngTrainer.getNameOfTrainer()));

        double number = 1 / 3.0; // 3.3333333334
        assertEquals(0.33, number, 0.005);

        int[] numbers1 = new int[]{2, 3, 4};
        int[] numbers2 = new int[]{2, 3, 5};
        assertArrayEquals(numbers1, numbers2);
    }

    /*
     public void addCourse(Course course) {
        courses.add(course);
    }

    public String getNameOfTrainer() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Address getAddress() {
        return address;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public String getNameAndAge() {
        return name + " " + age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

     */
}