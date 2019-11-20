package com.tavisca.javatraining.hcm.model;

public class AppraisalForm {
    private int id;
    private String[] technologies;
    private Level interpersonal;
    private Level communication;
    private String rating;
    private String remarks;

    public AppraisalForm() {
    }

    public AppraisalForm(String[] technologies, Level interpersonal,
                         Level communication, String rating, String remarks) {
        this.technologies = technologies;
        this.interpersonal = interpersonal;
        this.communication = communication;
        this.rating = rating;
        this.remarks = remarks;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String[] getTechnologies() {
        return technologies;
    }

    public void setTechnologies(String[] technologies) {
        this.technologies = technologies;
    }

    public Level getInterpersonal() {
        return interpersonal;
    }

    public void setInterpersonal(Level interpersonal) {
        this.interpersonal = interpersonal;
    }

    public Level getCommunication() {
        return communication;
    }

    public void setCommunication(Level communication) {
        this.communication = communication;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
}
