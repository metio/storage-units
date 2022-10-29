/*
 * SPDX-FileCopyrightText: The Storage-Units Authors
 * SPDX-License-Identifier: 0BSD
 */
package wtf.metio.storageunits.jackson;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import wtf.metio.storageunits.model.StorageUnit;

import java.io.IOException;

class JacksonDefaultDeserializationTest {

    private ObjectMapper mapper;

    @BeforeEach
    void setUp() {
        mapper = new ObjectMapper();
        mapper.registerModule(new StorageUnitModule());
    }

    @Test
    void shouldDeserializeStorageUnit() throws IOException {
        // given
        final String input = "1024";

        // when
        final StorageUnit<?> unit = mapper.readValue(input, StorageUnit.class);

        // then
        Assertions.assertEquals("1.00 KiB", unit.toString());
    }

    @Test
    void shouldDeserializeNonStorageUnit() throws IOException {
        // given
        final String input = "1024";

        // when
        final String output = mapper.readValue(input, String.class);

        // then
        Assertions.assertEquals("1024", output);
    }

}
