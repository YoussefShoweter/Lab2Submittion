import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class Sheet3Test {
    @Nested
    class ADUPTestSuit{
        Sheet3 rekt;
        @BeforeEach
        public void resetting(){
            rekt=new Sheet3();
        }
        @Test
        public void FirstADUP(){
            String[] res = rekt.input('c');
            assertEquals("UPDATE", res[0]);
            assertEquals("min", res[1]);
            assertEquals("2000-1-1", res[2]);
            assertEquals("0:0", res[3]);
        }
        @Test
        public void SecondADUP(){ rekt.input('c');
            String[] res = rekt.input('b');
            assertEquals("UPDATE", res[0]);
            assertEquals("min", res[1]);
            assertEquals("2000-1-1", res[2]);
            assertEquals("0:1", res[3]);
        }
        @Test
        public void ThirdADUP(){
            rekt.input('c');
            rekt.input('b');
            String[] res = rekt.input('b');
            assertEquals("UPDATE", res[0]);
            assertEquals("min", res[1]);
            assertEquals("2000-1-1", res[2]);
            assertEquals("0:2", res[3]);
        }

        @Test
        public void FourthADUP(){
            rekt.input('c');
            rekt.input('b');
            rekt.input('b');
            String[] res = rekt.input('a');
            assertEquals("UPDATE", res[0]);
            assertEquals("hour", res[1]);
            assertEquals("2000-1-1", res[2]);
            assertEquals("0:2", res[3]);
        }
        @Test
        public void FifthADUP(){
            rekt.input('c');
            rekt.input('b');
            rekt.input('b');
            rekt.input('a');
            String[] res = rekt.input('b');
            assertEquals("UPDATE", res[0]);
            assertEquals("hour", res[1]);
            assertEquals("2000-1-1", res[2]);
            assertEquals("1:2", res[3]);
        }

        @Test
        public void SixthADUP(){
            rekt.input('c');
            rekt.input('b');
            rekt.input('b');
            rekt.input('c');
            rekt.input('b');
            String[] res = rekt.input('b'); 
            assertEquals("UPDATE", res[0]);
            assertEquals("min", res[1]);
            assertEquals("2000-1-1", res[2]);
            assertEquals("0:4", res[3]);
        }

        @Test
        public void SeventhADUP(){
            rekt.input('c');
            rekt.input('b');
            rekt.input('b');
            rekt.input('a');
            rekt.input('b');
            rekt.input('b');
            String[] res = rekt.input('a');
            assertEquals("UPDATE", res[0]);
            assertEquals("day", res[1]);
            assertEquals("2000-1-1", res[2]);
            assertEquals("2:2", res[3]);
        }
        @Test
        public void EightADUP(){
            rekt.input('c');
            rekt.input('b');
            rekt.input('b');
            rekt.input('a');
            rekt.input('b');
            rekt.input('b');
            rekt.input('a');
            String[] res = rekt.input('b');
            assertEquals("UPDATE", res[0]);
            assertEquals("day", res[1]);
            assertEquals("2000-1-2", res[2]);
            assertEquals("2:2", res[3]);

        }

        @Test
        public void NinthADUP(){
            rekt.input('c');
            rekt.input('b');
            rekt.input('b');
            rekt.input('a');
            rekt.input('b');
            rekt.input('b');
            rekt.input('a');
            rekt.input('b');
            String[] res = rekt.input('b');
            assertEquals("UPDATE", res[0]);
            assertEquals("day", res[1]);
            assertEquals("2000-1-3", res[2]);
            assertEquals("2:2", res[3]);
        }

        @Test
        public void TenthADUP(){
            rekt.input('c');
            rekt.input('b');
            rekt.input('b');
            rekt.input('a');
            rekt.input('b');
            rekt.input('b');
            rekt.input('a');
            rekt.input('b');
            rekt.input('b');
            String[] res = rekt.input('a');
            assertEquals("UPDATE", res[0]);
            assertEquals("month", res[1]);
            assertEquals("2000-1-3", res[2]);
            assertEquals("2:2", res[3]);
        }

        @Test
        public void EleventhADUP(){
            rekt.input('c');
            rekt.input('b');
            rekt.input('a');
            rekt.input('a');
            rekt.input('b');
            rekt.input('b');
            rekt.input('a');
            rekt.input('b');
            rekt.input('c');
            rekt.input('b');
            String[] res = rekt.input('b');
            assertEquals("UPDATE", res[0]);
            assertEquals("month", res[1]);
            assertEquals("2000-4-3", res[2]);
            assertEquals("0:1", res[3]);
        }

        @Test

        public void TwelvthADUP(){
            rekt.input('c');
            rekt.input('b');
            rekt.input('b');
            rekt.input('a');
            rekt.input('b');
            rekt.input('b');
            rekt.input('a');
            rekt.input('b');
            rekt.input('b');
            rekt.input('a');
            rekt.input('b');
            String[] res = rekt.input('b');
            assertEquals("UPDATE", res[0]);
            assertEquals("month", res[1]);
            assertEquals("2000-3-3", res[2]);
            assertEquals("2:2", res[3]);
        }

        @Test
        public void ThirteenthADUP(){
            rekt.input('c');
            rekt.input('b');
            rekt.input('b');
            rekt.input('a');
            rekt.input('b');
            rekt.input('b');
            rekt.input('a');
            rekt.input('b');
            rekt.input('b');
            rekt.input('a');
            rekt.input('b');
            rekt.input('b');
            String[] res = rekt.input('a');
            assertEquals("UPDATE", res[0]);
            assertEquals("year", res[1]);
            assertEquals("2000-3-3", res[2]);
            assertEquals("2:2", res[3]);
        }
        @Test
        public void FourteenthADUP(){
            rekt.input('c');
            rekt.input('b');
            rekt.input('b');
            rekt.input('a');
            rekt.input('b');
            rekt.input('b');
            rekt.input('a');
            rekt.input('b');
            rekt.input('b');
            rekt.input('a');
            rekt.input('b');
            rekt.input('b');
            rekt.input('a');
            String[] res = rekt.input('b');
            assertEquals("UPDATE", res[0]);
            assertEquals("year", res[1]);
            assertEquals("2001-3-3", res[2]);
            assertEquals("2:2", res[3]);
        }

        @Test
        public void FifteenthADUP(){
            rekt.input('c');
            rekt.input('b');
            rekt.input('b');
            rekt.input('a');
            rekt.input('b');
            rekt.input('b');
            rekt.input('a');
            rekt.input('b');
            rekt.input('b');
            rekt.input('a');
            rekt.input('b');
            rekt.input('b');
            rekt.input('a');
            rekt.input('b');
            String[] res = rekt.input('b');
            assertEquals("UPDATE", res[0]);
            assertEquals("year", res[1]);
            assertEquals("2002-3-3", res[2]);
            assertEquals("2:2", res[3]);
        }


    }
    @Nested
    class Q3EdgeCoverageTests{
        Sheet3 rekt;
        @BeforeEach
        public void resetting(){
            rekt=new Sheet3();
        }
        @Test
        public void Edge1(){
            String[] res = rekt.input('a');
            assertEquals("NORMAL", res[0]);
            assertEquals("DATE", res[1]);
            assertEquals("2000-1-1", res[2]);
            assertEquals("0:0", res[3]);
        }
        @Test
        public void Edge2(){
            rekt.input('a');
            String[] res = rekt.input('a');
            assertEquals("NORMAL", res[0]);
            assertEquals("TIME", res[1]);
            assertEquals("2000-1-1", res[2]);
            assertEquals("0:0", res[3]);
        }

        @Test
        public void Edge3(){
            rekt.input('a');
            rekt.input('a');
            String[] res = rekt.input('c');
            assertEquals("UPDATE", res[0]);
            assertEquals("min", res[1]);
            assertEquals("2000-1-1", res[2]);
            assertEquals("0:0", res[3]);
        }

        @Test
        public void Edge4(){
            rekt.input('a');
            rekt.input('a');
            rekt.input('c');
            String[] res = rekt.input('b');
            assertEquals("UPDATE", res[0]);
            assertEquals("min", res[1]); 
            assertEquals("2000-1-1", res[2]);
            assertEquals("0:1", res[3]);
        }

        @Test
        public void Edge5(){
            rekt.input('a');
            rekt.input('a');
            rekt.input('c');
            rekt.input('b');
            String[] res = rekt.input('a'); 
            assertEquals("UPDATE", res[0]);
            assertEquals("hour", res[1]); 
            assertEquals("2000-1-1", res[2]);
            assertEquals("0:1", res[3]);
        }

        @Test
        public void Edge6(){
            rekt.input('a');
            rekt.input('a');
            rekt.input('c');
            rekt.input('b');
            rekt.input('a');
            String[] res = rekt.input('b');
            assertEquals("UPDATE", res[0]);
            assertEquals("hour", res[1]);
            assertEquals("2000-1-1", res[2]);
            assertEquals("1:1", res[3]);
        }

        @Test
        public void Edge7(){
            rekt.input('a');
            rekt.input('a');
            rekt.input('c');
            rekt.input('b');
            rekt.input('a');
            rekt.input('b');
            String[] res = rekt.input('a');
            assertEquals("UPDATE", res[0]);
            assertEquals("day", res[1]);
            assertEquals("2000-1-1", res[2]);
            assertEquals("1:1", res[3]);
        }
        @Test
        public void Edge8(){
            rekt.input('a');
            rekt.input('a');
            rekt.input('c');
            rekt.input('b');
            rekt.input('a');
            rekt.input('b');
            rekt.input('a');
            String[] res = rekt.input('b'); 
            assertEquals("UPDATE", res[0]); 
            assertEquals("day", res[1]); 
            assertEquals("2000-1-2", res[2]);
            assertEquals("1:1", res[3]);
        }

        @Test
        public void Edge9(){
            rekt.input('a');
            rekt.input('a');
            rekt.input('c');
            rekt.input('b');
            rekt.input('a');
            rekt.input('b');
            rekt.input('a');
            rekt.input('b');
            String[] res = rekt.input('a');
            assertEquals("UPDATE", res[0]);
            assertEquals("month", res[1]); 
            assertEquals("2000-1-2", res[2]);
            assertEquals("1:1", res[3]);
        }

        @Test
        public void Edge10(){
            rekt.input('a');
            rekt.input('a');
            rekt.input('c');
            rekt.input('b');
            rekt.input('a');
            rekt.input('b');
            rekt.input('a');
            rekt.input('b');
            rekt.input('a');
            String[] res = rekt.input('b');
            assertEquals("UPDATE", res[0]);
            assertEquals("month", res[1]); 
            assertEquals("2000-2-2", res[2]);
            assertEquals("1:1", res[3]);
        }

        @Test
        public void Edge11(){
            rekt.input('a');
            rekt.input('a');
            rekt.input('c');
            rekt.input('b');
            rekt.input('a');
            rekt.input('b');
            rekt.input('a');
            rekt.input('b');
            rekt.input('a');
            rekt.input('b');
            String[] res = rekt.input('a'); 
            assertEquals("UPDATE", res[0]);
            assertEquals("year", res[1]);
            assertEquals("2000-2-2", res[2]);
            assertEquals("1:1", res[3]);
        }

        @Test
        public void Edge12(){
            rekt.input('a');
            rekt.input('a');
            rekt.input('c');
            rekt.input('b');
            rekt.input('a');
            rekt.input('b');
            rekt.input('a');
            rekt.input('b');
            rekt.input('a');
            rekt.input('b');
            rekt.input('a');
            String[] res = rekt.input('b');
            assertEquals("UPDATE", res[0]);
            assertEquals("year", res[1]); 
            assertEquals("2001-2-2", res[2]);
            assertEquals("1:1", res[3]);
        }

        @Test
        public void Edge13(){
            rekt.input('a');
            rekt.input('a');
            rekt.input('c');
            rekt.input('b');
            rekt.input('a');
            rekt.input('b');
            rekt.input('a');
            rekt.input('b');
            rekt.input('a');
            rekt.input('b');
            rekt.input('a');
            rekt.input('b');
            String[] res = rekt.input('a');
            assertEquals("NORMAL", res[0]);
            assertEquals("TIME", res[1]);
            assertEquals("2001-2-2", res[2]);
            assertEquals("1:1", res[3]);
        }

        @Test
        public void Edge14(){ rekt.input('a');

            rekt.input('a');
            rekt.input('c');
            rekt.input('b');
            rekt.input('a');
            rekt.input('b');
            rekt.input('a');
            rekt.input('b');
            rekt.input('a');
            rekt.input('b');
            rekt.input('a');
            rekt.input('b');
            rekt.input('a');
            String[] res = rekt.input('c'); 
            assertEquals("UPDATE", res[0]);
            assertEquals("min", res[1]);
            assertEquals("2001-2-2", res[2]);
            assertEquals("1:1", res[3]);
        }

        @Test
        public void Edge15(){
            rekt.input('a');
            rekt.input('a');
            rekt.input('c');
            rekt.input('b');
            rekt.input('a');
            rekt.input('b');
            rekt.input('a');
            rekt.input('b');
            rekt.input('a');
            rekt.input('b');
            rekt.input('a');
            rekt.input('b');
            rekt.input('a');
            rekt.input('c');
            String[] res = rekt.input('d');
            assertEquals("NORMAL", res[0]);
            assertEquals("TIME", res[1]);
            assertEquals("2001-2-2", res[2]);
            assertEquals("1:1", res[3]);
        }
        @Test
        public void Edge16(){
            rekt.input('a');
            rekt.input('a');
            rekt.input('c');
            rekt.input('b');
            rekt.input('a');
            rekt.input('b');
            rekt.input('a');
            rekt.input('b');
            rekt.input('a');
            rekt.input('b');
            rekt.input('a');
            rekt.input('b');
            rekt.input('a');

            rekt.input('c');
            rekt.input('d');
            String[] res = rekt.input('b');
            assertEquals("ALARM", res[0]);
            assertEquals("Alarm", res[1]);
            assertEquals("2001-2-2", res[2]);
            assertEquals("1:1", res[3]);
        }

        @Test
        public void Edge17(){
            rekt.input('a');
            rekt.input('a');
            rekt.input('c');
            rekt.input('b');
            rekt.input('a');
            rekt.input('b');
            rekt.input('a');
            rekt.input('b');
            rekt.input('a');
            rekt.input('b');
            rekt.input('a');
            rekt.input('b');
            rekt.input('a');
            rekt.input('c');
            rekt.input('d');
            rekt.input('b');
            String[] res = rekt.input('a');
            assertEquals("ALARM", res[0]);
            assertEquals("Chime", res[1]);
            assertEquals("2001-2-2", res[2]);
            assertEquals("1:1", res[3]);
        }

        @Test
        public void Edge18(){
            rekt.input('a');
            rekt.input('a');
            rekt.input('c');
            rekt.input('b');
            rekt.input('a');
            rekt.input('b');
            rekt.input('a');
            rekt.input('b');
            rekt.input('a');
            rekt.input('b');
            rekt.input('a');
            rekt.input('b');
            rekt.input('a');
            rekt.input('c');
            rekt.input('d');
            rekt.input('b');
            rekt.input('a');
            String[] res = rekt.input('d');
            assertEquals("NORMAL", res[0]);
            assertEquals("TIME", res[1]);
            assertEquals("2001-2-2", res[2]);

            assertEquals("1:1", res[3]);
        }

    }






}









 