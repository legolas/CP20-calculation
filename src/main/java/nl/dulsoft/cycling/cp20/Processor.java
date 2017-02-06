package nl.dulsoft.cycling.cp20;

import nl.dulsoft.cycling.cp20.model.RunData;
import nl.dulsoft.cycling.cp20.model.Score;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 * @author <a href="mailto:marcel.dullaart@rws.nl">Marcel Dullaart</a>
 */
class Processor {

    private static final LocalTime START_TEST = LocalTime.of(0, 20);
    private static final LocalTime END_TEST = LocalTime.of(0, 40);
    private final Score score;
    private int count;
    private double totalPower;
    private double averagePower;
    private double totalHeartRate;
    private double averageHeartRate;

    Processor(File scoreFile) throws JAXBException {
        JAXBContext context = JAXBContext.newInstance(Score.class);

        Unmarshaller jaxbUnmarshaller = context.createUnmarshaller();
        this.score = (Score) jaxbUnmarshaller.unmarshal(scoreFile);
        System.out.println(score);
    }

    void doCalculate() {
        score.getRun()
                .getOuterRunData()
                .getRunDatas()
                .stream()
                .filter(this::betweenStartAndEndDate)
                .forEach(this::doCalculate);

        this.averagePower = this.totalPower / this.count;
        this.averageHeartRate = this.totalHeartRate / this.count;
    }

    double averageHeartRate() {
        return this.totalHeartRate / this.count;
    }

    double averagePower() {
        return this.totalPower / this.count;
    }

    private void doCalculate(RunData runData) {
        this.totalPower += runData.getPower();
        this.totalHeartRate += runData.getHeartRate();
        this.count++;
    }

    private boolean betweenStartAndEndDate(RunData runData) {

        LocalTime timeStamp = LocalTime.parse(runData.getTime(), DateTimeFormatter.ISO_LOCAL_TIME);
        return timeStamp.isAfter(START_TEST)
                && timeStamp.isBefore(END_TEST);
    }

    String getName() {
        return score.getUserInfo().getName();
    }
}
