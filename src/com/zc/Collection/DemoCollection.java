package com.zc.Collection;

import java.util.ArrayList;
import java.util.Collection;

public class DemoCollection {
    public static void main(String[] args) {
        Collection<String> collection=new ArrayList<>();
        boolean zc = collection.add("zc");
        boolean zc1 = collection.remove("zc");
        boolean zc2 = collection.add("zcc");
        boolean zc3 = collection.add("zcasd");
        collection.clear();
        collection.contains("z");
        collection.isEmpty();
        collection.size();
    }
}
