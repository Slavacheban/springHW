package beans.forvards;

import beans.backs.Isma;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("facundo")
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class Facundo implements Forvard {
    private static final Logger LOGGER = Logger.getLogger(Isma.class.getName());

    public void goal() {
        LOGGER.info("goal from Facundo");
    }
}
