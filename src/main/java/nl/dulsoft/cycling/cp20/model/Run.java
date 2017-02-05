package nl.dulsoft.cycling.cp20.model;

import javax.xml.bind.annotation.XmlElement;

/**
 * @author <a href="mailto:marcel.dullaart@rws.nl">Marcel Dullaart</a>
 */
public class Run {

    private OuterRunData outerRunData;

    public OuterRunData getOuterRunData() {
        return outerRunData;
    }

    @XmlElement(name = "RunData")
    public void setOuterRunData(OuterRunData outerRunData) {
        this.outerRunData = outerRunData;
    }
}
