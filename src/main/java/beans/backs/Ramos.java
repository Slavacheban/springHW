package beans.backs;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("ramos")
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class Ramos implements Back {
    private static final Logger LOGGER = Logger.getLogger(Ramos.class.getName());

    public void back() {
        LOGGER.info("back as Ramos");
    }
}
