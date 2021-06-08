package de.thkoeln.meilenstein3.models;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Entry {

    private String title;
    private double sleepduration;
    private double sleepquality;
    private double sportduration;
    private double sportintensity;
    private double wellbeing;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getSleepduration() {
        return sleepduration;
    }

    public void setSleepduration(double sleepduration) {
        this.sleepduration = sleepduration;
    }

    public double getSleepquality() {
        return sleepquality;
    }

    public void setSleepquality(double sleepquality) {
        this.sleepquality = sleepquality;
    }

    public double getSportduration() {
        return sportduration;
    }

    public void setSportduration(double sportduration) {
        this.sportduration = sportduration;
    }

    public double getSportintensity() {
        return sportintensity;
    }

    public void setSportintensity(double sportintensity) {
        this.sportintensity = sportintensity;
    }

    public double getWellbeing() {
        return wellbeing;
    }

    public void setWellbeing(double wellbeing) {
        this.wellbeing = wellbeing;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    public Long getId() {
        return id;
    }
}
