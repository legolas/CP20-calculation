package nl.dulsoft.cycling.cp20;

import javax.xml.bind.JAXBException;
import java.io.File;
import java.net.URL;
import java.util.Optional;

/**
 * @author <a href="mailto:marcel.dullaart@rws.nl">Marcel Dullaart</a>
 */
public class Main {
    public static void main(String... args) throws JAXBException {

        URL resource = Optional.ofNullable(Main.class.getResource("/score.xml"))
                .orElseThrow(() -> new IllegalArgumentException("Cannot read file"));


        Processor processor = new Processor(new File(resource.getFile()));
        processor.doCalculate();

        System.out.printf("Score for %s average heartbeat is %f and average power is %f%n",
                processor.getName(),
                processor.averageHeartRate(),
                processor.averagePower());
    }
}
