package com.vendo.core_lib.utils;

import com.vendo.core_lib.type.ServiceRole;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class ClassFieldsTest {

    private static class Sample {
        private String name;
    }

    @Test
    void nameOfReturnsFieldNameWhenFieldExists() {
        assertThat(ClassFields.nameOf("name", Sample.class)).isEqualTo("name");
    }

    @Test
    void nameOfThrowsWhenFieldDoesNotExist() {
        assertThatThrownBy(() -> ClassFields.nameOf("missing", Sample.class))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("missing")
                .hasMessageContaining(Sample.class.getName());
    }

    @Test
    void getEnumValuesReturnsConstantNamesForEnum() {
        assertThat(ClassFields.getEnumValues(ServiceRole.class)).containsExactly("INTERNAL");
    }

    @Test
    void getEnumValuesReturnsEmptyArrayForNonEnumClass() {
        assertThat(ClassFields.getEnumValues(Sample.class)).isEmpty();
    }

    @Test
    void getEnumValuesReturnsEmptyArrayForNullClass() {
        assertThat(ClassFields.getEnumValues(null)).isEmpty();
    }
}
