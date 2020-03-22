package by.tut.lect10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

//	Имеется текст. Следует составить для него частотный словарь.

public class ListIt6 {
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Map<String, Integer> map = new HashMap<>();
        while (true)
        {
            String id = reader.readLine();
            if (id.isEmpty())
                break;
            int id2 = Integer.parseInt(id);
            String name = reader.readLine();
            map.put(name, id2);
        }
        for (Map.Entry<String, Integer> pair : map.entrySet())
        {
            System.out.println(pair.getValue() + " " + pair.getKey());
        }
    }
}
