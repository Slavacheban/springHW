import beans.DinamoKyev;
import beans.FootballClub;
import beans.ShakhtarDonetsk;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("F:\\Slava\\spring\\src\\main\\java\\beans");
        FootballClub shakhtarDonetsk = context.getBean(ShakhtarDonetsk.class);
        FootballClub shakhtarDonetsk2 = context.getBean(ShakhtarDonetsk.class);
        FootballClub dinamoKyev = context.getBean(DinamoKyev.class);
        FootballClub dinamoKyev2 = context.getBean(DinamoKyev.class);

        System.out.println(shakhtarDonetsk == shakhtarDonetsk2);
        System.out.println(dinamoKyev == dinamoKyev2);
    }

}
