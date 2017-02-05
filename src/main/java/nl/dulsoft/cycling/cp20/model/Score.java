package nl.dulsoft.cycling.cp20.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

/**
 * @author <a href="mailto:marcel.dullaart@rws.nl">Marcel Dullaart</a>
 */
@XmlRootElement(name = "Score")
public class Score {

    private String version;
    private UserInfo userInfo;
    private Run run;

    public Run getRun() {
        return run;
    }

    @XmlElement(name = "Run")
    public void setRun(Run run) {
        this.run = run;
    }

    public String getVersion() {
        return version;
    }

    @XmlElement(name="Version")
    public void setVersion(String version) {
        this.version = version;
    }

    public UserInfo getUserInfo() {
        return userInfo;
    }

    @XmlElement(name = "UserInfo")
    public void setUserInfo(UserInfo userInfo) {
        this.userInfo = userInfo;
    }
}
