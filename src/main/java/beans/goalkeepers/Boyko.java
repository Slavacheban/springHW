package beans.goalkeepers;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("boyko")
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class Boyko implements Goalkeeper {
    private static final Logger LOGGER = Logger.getLogger(Boyko.class.getName());

    public void keep() {
        LOGGER.info("keep as Boyko");
    }
}
