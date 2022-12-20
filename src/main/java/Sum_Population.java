import java.util.List;

import org.apache.commons.math3.stat.descriptive.summary.Sum;

public class Sum_Population {
    
    public static long sum(List<String> list){
        return list.stream().mapToInt(x-> Integer.parseInt(x)).sum();
    }
}
