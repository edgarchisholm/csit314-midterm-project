package com.edgarchisholm.midterm;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;

class StatusControllerTest {
    @Test
    void returnsRunningStatus() {
        assertThat(new StatusController().status()).containsEntry("status", "running");
    }
}
