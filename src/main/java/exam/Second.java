package exam;

import data.DataProvider;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Collection;

@RunWith(Parameterized.class)
public class Second {

    String name;


    @Parameterized.Parameters
    public static Collection options() {
        return DataProvider.getValidNames();
    }

    public Second(String name) {
        this.name = name;
    }
    @Test
    public void testOpenPage() {
        System.out.println(name);
    }

}
