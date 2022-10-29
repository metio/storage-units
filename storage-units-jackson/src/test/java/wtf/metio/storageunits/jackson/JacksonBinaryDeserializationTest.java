/*
 * SPDX-FileCopyrightText: The Storage-Units Authors
 * SPDX-License-Identifier: 0BSD
 */
package wtf.metio.storageunits.jackson;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import wtf.metio.storageunits.model.StorageUnit;

class JacksonBinaryDeserializationTest {

  private ObjectMapper mapper;

  @BeforeEach
  void setUp() {
    mapper = new ObjectMapper();
    mapper.registerModule(new StorageUnitModule(StorageUnitModule.PreferredUnitType.BINARY));
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

}
