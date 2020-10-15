package summer.health.application.health_app.model;

import java.util.ArrayList;
import java.util.List;

public class Therapy {

    private List listTherapy = new ArrayList();

    public List getListTherapy() {

        listTherapy.add(0,"Wodka");
        listTherapy.add(1,"Beer");
        listTherapy.add(2,"Whiskey");
        listTherapy.add(3,"Wine");
        return listTherapy;
    }

    @Override
    public String toString() {
        return "Therapy{" +
                "listTherapy=" + getListTherapy() +
                '}';
    }
}
