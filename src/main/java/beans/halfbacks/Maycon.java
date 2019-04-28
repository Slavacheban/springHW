package beans.halfbacks;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("maycon")
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class Maycon implements HalfBack {
    private static Logger LOGGER = Logger.getLogger(Maycon.class.getName());

    public void pass() {
        LOGGER.info("long pass from Maycon");
    }
}
