
package Flyweight;

import java.util.HashMap;
import java.util.Map;

public class PropertiesFactory {
    private static final Map<String, Properties> flyweights = new HashMap<>();

    public static Properties getFlyweight(String font, String color, int size) {
        String key = font + color + size;
        if (!flyweights.containsKey(key)) {
            flyweights.put(key, new Properties(font, color, size));
        }
        return flyweights.get(key);
    }
}
