import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Main {
    Map<String,Integer> map = new HashMap<>();
    public static void main(String[] args) {

    }

    public void addMap(String key, int value){
       if (!map.containsKey(key)){
           map.put(key,value);
       }else {
           int valueMap = map.get(key);
           if (valueMap == value){
               throw new RuntimeException();
           } else {
               map.put(key, valueMap + value);
           }

       }
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Main main = (Main) o;
        return Objects.equals(map, main.map);
    }

    @Override
    public int hashCode() {
        return Objects.hash(map);
    }
}