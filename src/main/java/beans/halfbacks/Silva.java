package beans.halfbacks;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("silva")
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class Silva implements HalfBack {
    private static Logger LOGGER = Logger.getLogger(Silva.class.getName());

    public void pass() {
        LOGGER.info("pass from Silva");
    }
}
