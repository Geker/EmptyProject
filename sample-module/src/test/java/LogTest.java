import static org.junit.Assert.*;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogTest {

    private static final Logger logger = LoggerFactory.getLogger(LogTest.class);
    @Test
    public void testName() throws Exception {
        logger.debug("hello world");
    }
}
