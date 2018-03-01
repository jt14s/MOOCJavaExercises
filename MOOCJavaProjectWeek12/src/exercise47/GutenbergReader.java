package exercise47;

import java.util.ArrayList;
import java.util.List;

public class GutenbergReader {

	private List<String> lines;

    public GutenbergReader(String address) throws IllegalArgumentException {
       
    }

    public List<String> linesWhichComplyWith(Criterion c){
        List<String> complyingLines = new ArrayList<String>();

        for (String line : lines) {
            if (c.compiles(line)) {
                complyingLines.add(line);
            }
        }

        return complyingLines;
    }
}
