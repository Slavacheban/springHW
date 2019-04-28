package beans;

import beans.backs.Back;
import beans.forvards.Forvard;
import beans.goalkeepers.Goalkeeper;
import beans.halfbacks.HalfBack;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Getter
@Setter
@Component
@NoArgsConstructor
@AllArgsConstructor
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class DinamoKyev implements FootballClub {
    private static Logger LOGGER = Logger.getLogger(ShakhtarDonetsk.class.getName());
    @Autowired
    @Qualifier("piatov")
    private Goalkeeper goalkeeper;
    @Autowired
    @Qualifier("srna")
    private Back back;
    @Autowired
    @Qualifier("ferna")
    private HalfBack halfBack;
    @Autowired
    @Qualifier("facundo")
    private Forvard forvard;

    public void play() {
        goalkeeper.keep();
        back.back();
        halfBack.pass();
        forvard.goal();
    }

    @PostConstruct
    private void postConFC() {
        LOGGER.info("FC DK init");
    }

    @PreDestroy
    private void preDistFC() {
        LOGGER.info("destroy FC DK");
    }
}

