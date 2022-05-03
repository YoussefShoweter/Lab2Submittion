import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import org.junit.jupiter.api.AfterEach;
import java.util.Collections;
import static org.junit.jupiter.api.Assertions.*;

public class MaxMinArrTest {
    MaxArr rekt=new MaxArr();
    ArrayList Test1=new ArrayList();
    @Nested
    class MaxCases{
        @AfterEach
        public void loop(){
            Test1.clear();
        }
        @Test
        public void Empty(){
            assertEquals(rekt.GetMaximum(Test1),null);
        }
//        @Test
//        public void OneElement(){
//            Test1.add(564);
//            assertEquals(rekt.GetMaximum(Test1),564 );
//        }
        @Test
        public void Eelemnts(){
            for(int i=1;i<23000;i*=5){
                Test1.add(i);
            }
            assertEquals(rekt.GetMaximum(Test1),Collections.max(Test1));
        }
        @Test
        public void Eelemnts2(){
            for(int i=7;i<2000;i*=6){
                Test1.add(i);
            }
            assertEquals(rekt.GetMaximum(Test1),Collections.max(Test1));
        }
        @Test
        public void NegativeEelemnts(){
            for(int i=-1245;i<0;i+=3){
                Test1.add(i);
            }
            assertEquals(rekt.GetMaximum(Test1),Collections.max(Test1));
        }

    }
    @Nested
    class MinCases{
        @AfterEach
        public void loop(){
            Test1.clear();
        }
        @Test
        public void Empty2(){
            assertEquals(rekt.GetMinimum(Test1),null);

        }
        @Test
        public void Eelemnts(){
            for(int i=1;i<23000;i*=5){
                Test1.add(i);
            }
            assertEquals(rekt.GetMinimum(Test1),Collections.min(Test1));
        }
        @Test
        public void Eelemnts2(){
            for(int i=5;i<27000;i*=5){
                Test1.add(i);
            }
            assertEquals(rekt.GetMinimum(Test1),Collections.min(Test1));
        }
        @Test
        public void NegativeEelemnts(){
            for(int i=-1245;i<0;i+=3){
                Test1.add(i);
            }
            assertEquals(rekt.GetMinimum(Test1),Collections.min(Test1));
        }


    }

}
