package exam;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@RunWith(Parameterized.class)
public class First {

    String name;
    int i;

    @Parameterized.Parameters
    public static Collection options() {
        List<String> list =new ArrayList<>();
        list.add("Vasiliy");
        list.add("Ivan");
        return list;
    }

    public First(String name) {
        this.name = name;
        DATA.i++;
        i++;
    }
    @Test
    public void test1(){
        System.out.println(name+" "+DATA.i);
        System.out.println("=="+i);
    }
    @Test
    public void test2(){
        System.out.println(name+" "+DATA.i);
        System.out.println("=="+i);
    }
}
