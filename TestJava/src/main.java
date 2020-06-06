import com.sun.org.apache.xml.internal.serializer.ToStream;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.lang.reflect.Method;
import java.util.*;

public class main {
    public static void main(String[] args) throws NoSuchMethodException {
        System.out.println(UUID.randomUUID().toString());
        System.out.println(UUID.randomUUID().toString().substring(1));
        ArrayList<Object> objects = new ArrayList<>();
        objects.add("a");
        objects.add("b");
        objects.add("c");
        for (Object o:objects
             ) {
            System.out.println(o);
        }

        HashMap<Integer, String> integerStringHashMap = new HashMap<>();
        integerStringHashMap.put(1,"a");
        integerStringHashMap.put(2,"b");
        integerStringHashMap.put(3,"c");
        Iterator<Map.Entry<Integer, String>> iterator = integerStringHashMap.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<Integer, String> next = iterator.next();
            System.out.println("key:"+next.getKey()+"-----value："+next.getValue());
        }

        for (Map.Entry<Integer,String> entry: integerStringHashMap.entrySet()
             ) {
            System.out.println(entry.getKey()+"$$$"+entry.getValue());
        }

}
