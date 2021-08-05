package day40_CustomClass_Statics;

import java.util.ArrayList;
import java.util.Arrays;

public class StaticBlocks {

    public static int a = 11;
    // public static Excel excelData =

    public static ArrayList<String> list = new ArrayList<>();

    static { // first to tun, ONLY runs one time
        list.addAll(Arrays.asList("A", "B", "C"));
    }






}
