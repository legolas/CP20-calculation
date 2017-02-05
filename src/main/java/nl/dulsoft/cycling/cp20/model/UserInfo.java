package nl.dulsoft.cycling.cp20.model;

import javax.xml.bind.annotation.XmlElement;

/**
 * @author <a href="mailto:marcel.dullaart@rws.nl">Marcel Dullaart</a>
 */
public class UserInfo {

    private String name;
    private String email;
    private String gender;
    private String country;
    private String weight;
    private Integer minHeartRate;
    private Integer maxHeartRate;
    private String team;

    public String getName() {
        return name;
    }

    @XmlElement(name = "Name")
    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    @XmlElement(name = "Email")
    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    @XmlElement(name = "Gender")
    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCountry() {
        return country;
    }

    @XmlElement(name = "Country")
    public void setCountry(String country) {
        this.country = country;
    }

    public String getWeight() {
        return weight;
    }

    @XmlElement(name = "Weight")
    public void setWeight(String weight) {
        this.weight = weight;
    }

    public Integer getMinHeartRate() {
        return minHeartRate;
    }

    @XmlElement(name = "MinHeartRate")
    public void setMinHeartRate(Integer minHeartRate) {
        this.minHeartRate = minHeartRate;
    }

    public Integer getMaxHeartRate() {
        return maxHeartRate;
    }

    @XmlElement(name = "MaxHeartRate")
    public void setMaxHeartRate(Integer maxHeartRate) {
        this.maxHeartRate = maxHeartRate;
    }

    public String getTeam() {
        return team;
    }

    @XmlElement(name = "Team")
    public void setTeam(String team) {
        this.team = team;
    }
}
