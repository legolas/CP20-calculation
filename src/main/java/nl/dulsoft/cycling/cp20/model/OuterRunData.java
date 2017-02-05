package nl.dulsoft.cycling.cp20.model;

import javax.xml.bind.annotation.XmlElement;
import java.util.List;

/**
 * @author <a href="mailto:marcel.dullaart@rws.nl">Marcel Dullaart</a>
 */
public class OuterRunData {
    private List<RunData> runDatas;

    public List<RunData> getRunDatas() {
        return runDatas;
    }

    @XmlElement(name = "RunData")
    public void setRunDatas(List<RunData> runDatas) {
        this.runDatas = runDatas;
    }
}
