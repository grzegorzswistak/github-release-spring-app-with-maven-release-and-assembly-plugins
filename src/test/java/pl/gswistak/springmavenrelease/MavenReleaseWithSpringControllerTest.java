package pl.gswistak.springmavenrelease;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MavenReleaseWithSpringControllerTest {

    private MavenReleaseWithSpringController controller;

    @BeforeEach
    void setUp() {
        controller = new MavenReleaseWithSpringController();
    }

    @Test
    void hello() {
        String response = controller.hello();
        Assertions.assertEquals("Hello!", response);
    }
}