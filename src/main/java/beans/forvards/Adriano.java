package beans.forvards;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("adriano")
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class Adriano implements Forvard {
    private static Logger LOGGER = Logger.getLogger(Adriano.class.getName());

    public void goal() {
        LOGGER.info("goal from Adriano");
    }
}
