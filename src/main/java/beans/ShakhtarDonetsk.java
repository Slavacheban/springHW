package beans;

import beans.backs.Back;
import beans.forvards.Forvard;
import beans.goalkeepers.Goalkeeper;
import beans.halfbacks.HalfBack;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Getter
@Setter
@Component
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
public class ShakhtarDonetsk implements FootballClub {
    private static final Logger LOGGER = Logger.getLogger(ShakhtarDonetsk.class.getName());
    @Autowired
    @Qualifier("boyko")
    private Goalkeeper goalkeeper;
    @Autowired
    @Qualifier("ramos")
    private Back back;
    @Autowired
    @Qualifier("taison")
    private HalfBack halfBack;
    @Autowired
    @Qualifier("adriano")
    private Forvard forvard;

    public void play() {
        goalkeeper.keep();
        back.back();
        halfBack.pass();
        forvard.goal();
    }

    @PostConstruct
    private void postConFC() {
        LOGGER.info("FC SD init");
    }

    @PreDestroy
    private void preDistFC() {
        LOGGER.info("destroy FC SH");
    }
}
