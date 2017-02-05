package nl.dulsoft.cycling.cp20.model;

import javax.xml.bind.annotation.XmlElement;
import java.time.Instant;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Timer;

/**
 * @author <a href="mailto:marcel.dullaart@rws.nl">Marcel Dullaart</a>
 */
public class RunData {

    private double speed;
    private String cadance;
    private int power;
    private int heartRate;
    private double distance;
    private String time;

    public String getTime() {
        return time;
    }

    @XmlElement(name = "Time")
    public void setTime(String time) {
        this.time = time;
    }

    public double getSpeed() {
        return speed;
    }

    @XmlElement(name = "Speed")
    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public String getCadance() {
        return cadance;
    }

    @XmlElement(name = "Cadence")
    public void setCadance(String cadance) {
        this.cadance = cadance;
    }

    public int getPower() {
        return power;
    }

    @XmlElement(name = "Power")
    public void setPower(int power) {
        this.power = power;
    }

    public int getHeartRate() {
        return heartRate;
    }

    @XmlElement(name = "HeartRate")
    public void setHeartRate(int heartRate) {
        this.heartRate = heartRate;
    }

    public double getDistance() {
        return distance;
    }

    @XmlElement(name = "Distance")
    public void setDistance(double distance) {
        this.distance = distance;
    }
}
