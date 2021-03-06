package org.belowski.weather.model.forecast;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;

@XmlType(propOrder={"mps", "name"})
public class WindSpeed {

    private float mps;

    private String name;

    public WindSpeed() {
        super();
    }

    public WindSpeed(float mps) {
        super();
        this.mps = mps;
        // set the name from the mps
        this.name = "gentle Breeze";
    }

    @XmlAttribute
    public float getMps() {
        return mps;
    }

    public void setMps(float mps) {
        this.mps = mps;
    }

    @XmlAttribute
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "WindSpeed [mps=" + mps + ", name=" + name + "]";
    }
    
}
