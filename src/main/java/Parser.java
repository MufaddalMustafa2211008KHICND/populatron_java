import java.util.ArrayList;
import java.util.List;

public class Parser {

    private List<String> data;
    
    Parser(List<String> data) {
        this.data = data;
    }

    public List<String> getPopulation() {
        List<String> population = new ArrayList<>();

        for (int i = 1; i < this.data.size(); i++) {
            String[] values = this.data.get(i).split(",");
            if (!values[4].isEmpty()) {
                population.add(values[4]);
            }
        }
        return population;
    }

}