package summer.health.application.health_app.model;

import java.util.ArrayList;
import java.util.List;

public class Disease {

    private List listOfDiseases = new ArrayList();

    public List getListOfDiseases() {
        return listOfDiseases;
    }

    public void setListOfDiseases(List listOfDiseases) {
        this.listOfDiseases = listOfDiseases;
    }

    public void listprintout() {
        for(int i = 0; i < listOfDiseases.size(); i++) {
            System.out.println("List of diseases: " + listOfDiseases.toString());
        }
    }
}
