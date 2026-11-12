package team.projectpulse.system;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * StatusCode only holds constants, so nothing should ever instantiate it. PMD flags this as
 * InstantiableUtilityClass while the class still has its implicit public constructor.
 */
@DisplayName("Unit tests for StatusCode")
class StatusCodeTest {

    @Test
    @DisplayName("StatusCode is a utility class: its constructor is private")
    void testConstructorIsPrivate() throws NoSuchMethodException {
        Constructor<StatusCode> constructor = StatusCode.class.getDeclaredConstructor();

        assertThat(Modifier.isPrivate(constructor.getModifiers())).isTrue();
    }
}
