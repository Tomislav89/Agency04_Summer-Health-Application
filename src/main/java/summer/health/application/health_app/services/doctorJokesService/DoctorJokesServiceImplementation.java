package summer.health.application.health_app.services.doctorJokesService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DoctorJokesServiceImplementation implements  DoctorJokesService {

   private List listOfJokes = new ArrayList();

    public DoctorJokesServiceImplementation() {
        this.listOfJokes = listOfJokes;
    }

    @Override
    public List sayJoke() {
        listOfJokes.add(0,"Doctor: I have some bad news and some very bad news.\n" +
                "Patient: Well, might as well give me the bad news first.\n" +
                "Doctor: The lab called with your test results. They said you have 24 hours to live.\n" +
                "Patient: 24 HOURS! That’s terrible!! What could be worse? What’s the very bad news?\n" +
                "Doctor: I’ve been trying to reach you since yesterday.");
        listOfJokes.add(1,"Doctor, doctor, will I be able to play the violin after the operation?”\n" +
                "“Yes, of course…”\n" +
                "“Great! I never could before!”");
        listOfJokes.add(2,"Doctor: You are very sick.\n" +
                "Patient: Can I get a second opinion?\n" +
                "Doctor: Yes, of course! You are very ugly too.");
        listOfJokes.add(3,"A man speaks frantically into the phone, “My wife is pregnant, and her contractions are only two minutes apart!”\n" +
                "“Is this her first child?” the doctor Asks.\n" +
                "“No, you idiot!” the man shouts. “This is her husband!”");
        return listOfJokes;
    }
}
