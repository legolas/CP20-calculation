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


        System.out.println(new Processor(new File(resource.getFile())).calculateFunctionalThresholdPower());
    }
}
