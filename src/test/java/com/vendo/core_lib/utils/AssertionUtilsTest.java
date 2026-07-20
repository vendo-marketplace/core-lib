package com.vendo.core_lib.utils;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatCode;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class AssertionUtilsTest {

    private static class Source {
        private final String name;
        private final int age;

        Source(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }

    private static class Target {
        private final String name;
        private final int age;

        Target(String name, int age) {
            this.name = name;
            this.age = age;
        }
    }

    private static class TargetWithExtraField {
        private final String name;
        private final String extra;

        TargetWithExtraField(String name, String extra) {
            this.name = name;
            this.extra = extra;
        }
    }

    private static class WithStaticField {
        private static final String STATIC_FIELD = "static-value";
        private final String name;

        WithStaticField(String name) {
            this.name = name;
        }
    }

    @Test
    void assertFrom_shouldNotThrow_whenAllFieldsMatch() {
        Source source = new Source("Alice", 30);
        Target target = new Target("Alice", 30);

        assertThatCode(() -> AssertionUtils.assertFrom(source, target)).doesNotThrowAnyException();
    }

    @Test
    void assertFrom_shouldThrow_whenFieldValueMismatches() {
        Source source = new Source("Alice", 30);
        Target target = new Target("Bob", 30);

        assertThatThrownBy(() -> AssertionUtils.assertFrom(source, target))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("Mismatch for field: name")
                .hasMessageContaining("expected: Bob")
                .hasMessageContaining("actual: Alice");
    }

    @Test
    void assertFrom_shouldThrow_whenEntityIsMissingField() {
        Source source = new Source("Alice", 30);
        TargetWithExtraField target = new TargetWithExtraField("Alice", "extra");

        assertThatThrownBy(() -> AssertionUtils.assertFrom(source, target))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("Missing field in entity: extra");
    }

    @Test
    void assertFrom_shouldSkipFieldsListedInSkipFields() {
        Source source = new Source("Alice", 30);
        Target target = new Target("Bob", 30);

        assertThatCode(() -> AssertionUtils.assertFrom(source, target, "name")).doesNotThrowAnyException();
    }

    @Test
    void assertFrom_shouldIgnoreStaticFields() {
        WithStaticField target = new WithStaticField("Alice");
        Source source = new Source("Alice", 30);

        assertThatCode(() -> AssertionUtils.assertFrom(source, target)).doesNotThrowAnyException();
    }
}
