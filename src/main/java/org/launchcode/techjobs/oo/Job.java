package org.launchcode.techjobs.oo;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;
    private final String dataUnavailable = "Data not available";

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.
    public Job(){
        id = nextId;
        nextId++;
    }

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency){
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }

// TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return id == job.id;
//        return id == job.id &&
//                Objects.equals(name, job.name) &&
//                Objects.equals(employer, job.employer) &&
//                Objects.equals(location, job.location) &&
//                Objects.equals(positionType, job.positionType) &&
//                Objects.equals(coreCompetency, job.coreCompetency);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
//        return Objects.hash(id, name, employer, location, positionType, coreCompetency);
    }

    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        String newLine = "\n";

//        String[] labels = {"ID: ", "Name: ", "Employer: ", "Location: ", "Position Type: ", "Core Competency: "};
//        String[] data = {Integer.toString(this.id), this.name, this.employer.getValue(), this.location.getValue(), this.positionType.getValue(), this.coreCompetency.getValue()};
//        StringBuilder output = new StringBuilder(newLine + labels[0] + data[0]);
//
//        boolean idOnly = true;
//        for (int i = 1; i < data.length; i++) {
//            output.append(newLine).append(labels[i]);
//            if (!data[i].equals(dataUnavailable)) {
//                output.append(data[i]);
//                idOnly = false;
//            }
//            if (data[i].isEmpty()) {
//                output.append(dataUnavailable);
//            }
//            if (i == data.length - 1) {
//                output.append(newLine);
//            }
//        }

//        if(idOnly) {
//            output = new StringBuilder("OOPS! This job does not seem to exist.");
//        }

        if(name.equals(" ")) name = "Data not available";
        if(employer.getValue().isBlank()) { employer.setValue("Data not available"); }
        if(location.getValue().isBlank()) { location.setValue("Data not available"); }
        if(positionType.getValue().isBlank()) { positionType.setValue("Data not available"); }
        if(coreCompetency.getValue().isBlank()) { coreCompetency.setValue("Data not available"); }
        String output = String.format("\nID: %d\n"
                + "Name: %s\n"
                + "Employer: %s\n"
                + "Location: %s\n"
                + "Position Type: %s\n"
                + "Core Competency: %s\n", id, name, employer, location, positionType, coreCompetency);

//        return output.toString();
        return output;
    }
}
