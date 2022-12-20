import java.io.IOException;
import java.text.NumberFormat;
import java.util.List;
import java.util.Locale;

public class Driver {
    
    private String path;

    Driver(String path){
        this.path = path;
    }

    public void performSteps() throws IOException {
        Reader_CSV read_csv = new Reader_CSV(this.path);
        List<String> lines = read_csv.getData();

        Parser parse = new Parser(lines);
        List<String> population = parse.getPopulation();
        
        long sumOfPopulation = Sum_Population.sum(population);

        String num = NumberFormat.getInstance(Locale.getDefault()).format(sumOfPopulation);
        System.out.printf("World population is: %s\n", num);
    }

}
