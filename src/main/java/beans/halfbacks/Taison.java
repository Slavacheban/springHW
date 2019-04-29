package beans.halfbacks;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("taison")
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class Taison implements HalfBack {
    private static final Logger LOGGER = Logger.getLogger(Taison.class.getName());

    public void pass() {
        LOGGER.info("pass from Taison");
    }
}
