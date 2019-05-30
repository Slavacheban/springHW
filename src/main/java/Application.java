import beans.DinamoKyev;
import beans.FootballClub;
import beans.ShakhtarDonetsk;
import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    private static final Logger LOGGER = Logger.getLogger(Application.class.getName());

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("src/main/java/beans");
        FootballClub shakhtarDonetsk = context.getBean(ShakhtarDonetsk.class);
        FootballClub shakhtarDonetsk2 = context.getBean(ShakhtarDonetsk.class);
        FootballClub dinamoKyev = context.getBean(DinamoKyev.class);
        FootballClub dinamoKyev2 = context.getBean(DinamoKyev.class);

        LOGGER.info("shakhtarDonetsk = shakhtarDonetsk2 : " + (shakhtarDonetsk == shakhtarDonetsk2));
        LOGGER.info("dinamoKyev = dinamoKyev2 : " + (dinamoKyev == dinamoKyev2));
    }
}
