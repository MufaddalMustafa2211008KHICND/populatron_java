import java.util.List;

public class Sum_Population {
    
    public static long sum(List<String> list){
        return list.stream().mapToInt(x-> Integer.parseInt(x)).sum();
    }
}
