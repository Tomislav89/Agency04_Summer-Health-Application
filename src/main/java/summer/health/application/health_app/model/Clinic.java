package summer.health.application.health_app.model;

public class Clinic {

    private String clinicName;
    private String clinicUrl;
    private String linkedIn;
    private String twitter;
    private String picture;

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getLinkedIn() {
        return linkedIn;
    }

    public void setLinkedIn(String linkedIn) {
        this.linkedIn = linkedIn;
    }

    public String getTwitter() {
        return twitter;
    }

    public void setTwitter(String twitter) {
        this.twitter = twitter;
    }

    public String getClinicName() {
        return clinicName;
    }

    public void setClinicName(String clinicName) {
        this.clinicName = clinicName;
    }

    public String getClinicUrl() {
        return clinicUrl;
    }

    public void setClinicUrl(String clinicUrl) {
        this.clinicUrl = clinicUrl;
    }
}
