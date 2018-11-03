package pl.sdacademy.vending.util;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class ConfigurationTest {
    private Configuration testedConfig;

    @Before
    public void init() {
        testedConfig = new Configuration();
    }

    @Test
    public void shouldReturnDefaultStringValueWhenPropertyIsUnknown() {
        // Given
        String unknownPropertyName = "iwquuwuuuwooownnjkw";
        String expectedDefault = "javaIsAwesome";
        // ŁWhen
        String propertyValue = testedConfig.getStringProperty(unknownPropertyName, expectedDefault);
        // Then
        assertEquals(expectedDefault, propertyValue);
    }


    @Test
    public void shouldReturnDefaultNumberValueWhenPropertyIsUnknown() {
        // Given
        String unknownPropertyValue = "uuuuuuussssssss";
        Long expectedLongDefault = 6L;
        // When
        Long propertyValue = testedConfig.getLongProperty(unknownPropertyValue, expectedLongDefault);
        // Then
        assertEquals(expectedLongDefault, propertyValue);
    }

    @Test
    public void shouldReturnExistingStringValue() {
        // Given
        String propertyName = "test.property.string";
        String expectedStringValue = "qwerty";
        // When
        String propertyValue = testedConfig.getStringProperty(propertyName, "unknow");
        // Then
        assertEquals(expectedStringValue, propertyValue);
    }

    @Test
    public void shouldReturnExistingLongValue() {
        // Given
        String propertyName = "test.property.long";
        Long expectedLongValue = 9L;
        // When
        Long propertyValue = testedConfig.getLongProperty(propertyName, 13L);
        // Then
        assertEquals(expectedLongValue, propertyValue);
    }

    @Test
    public void shouldReturnKnownLongProperty() {
        // given
        String propertyName = "test.property.long";
        Long defaultValue = 1337L;

        // when
        Long propertyValue =
                testedConfig.getLongProperty(propertyName, defaultValue);

        // then
        assertEquals((Long) 9L, propertyValue);
    }
}