import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;



public class OddEvenTest {
    OddEven rekt =new OddEven();
    @Nested
    class NegativeTests{
        @Test
        public void nil(){
            assertEquals(rekt.EvenCheck(0),true);
        }
        @Test
        public void Negative3(){
            assertEquals(rekt.EvenCheck(-3),false);
        }

        @Test
        public void Negative44(){
            assertEquals(rekt.EvenCheck(44),true);
        }

        @Test
        public void Negative847(){
            assertEquals(rekt.EvenCheck(-847),false);
        }


    }
    @Nested
    class PostiveTests{
        @Test
        public void nil(){
            assertEquals(rekt.EvenCheck(0),true);
        }
        @Test
        public void Postive44(){
            assertEquals(rekt.EvenCheck(4),true);
        }
        @Test
        public void Postive3(){
            assertEquals(rekt.EvenCheck(3),false);
        }
        @Test
        public void Positive6678(){
            assertEquals(rekt.EvenCheck(6678),true);
        }
    }

}
