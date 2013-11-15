package Junit3;

import org.junit.Test;

/**
 * Created with IntelliJ IDEA.
 * User: witailab
 * Date: 13-11-15
 * Time: 下午4:42
 * To change this template use File | Settings | File Templates.
 */
public class HobbitsTest {
    Hobbits [] h ;
    @Test

    public void test(){
        h = new Hobbits[3];
        int z = 0;

        while (z < 3){

            h[z] = new Hobbits();
            h[z].name = "bilbo";
            if (z == 1){
                h[z].name = "frodo";
            }
            if (z == 2){
                h[z].name = "sam";
            }
            System.out.print(h[z].name + "is a");
            System.out.println("good Hobbit name");
            z = z + 1;
        }
    }
}
