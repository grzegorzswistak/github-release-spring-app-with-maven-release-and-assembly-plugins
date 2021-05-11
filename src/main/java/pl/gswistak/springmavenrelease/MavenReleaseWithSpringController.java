package pl.gswistak.springmavenrelease;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.invoke.MethodHandles;

@RestController
public class MavenReleaseWithSpringController {

    private static final Logger LOG = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

    @GetMapping("/")
    public String hello() {
        LOG.info("hello endpoint");
        return "Hello!";
    }
}
