package data;

import java.util.ArrayList;
import java.util.List;

public class DataProvider {

   static List<String> names= new ArrayList<>();
    public static List<String> getValidNames(){
        names.clear();
        names.add("Vasiliy");
        names.add("Nikolay");
        return names;
    }
    public static List<String> getNoValidNames(){
        names.clear();
        names.add("mkldnsvfklj");
        names.add("Nihja67723i3n");
        return names;
    }
    public static List<String> getCertNoValid(){
        names.clear();
        names.add("mkldnsvfklj");
        names.add("Nihja67723i3n");
        return names;
    }
}
