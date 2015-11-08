/*
 * This is free and unencumbered software released into the public domain.
 *
 * Anyone is free to copy, modify, publish, use, compile, sell, or
 * distribute this software, either in source code form or as a compiled
 * binary, for any purpose, commercial or non-commercial, and by any
 * means.
 *
 * In jurisdictions that recognize copyright laws, the author or authors
 * of this software dedicate any and all copyright interest in the
 * software to the public domain. We make this dedication for the benefit
 * of the public at large and to the detriment of our heirs and
 * successors. We intend this dedication to be an overt act of
 * relinquishment in perpetuity of all present and future rights to this
 * software under copyright law.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
 * EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF
 * MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT.
 * IN NO EVENT SHALL THE AUTHORS BE LIABLE FOR ANY CLAIM, DAMAGES OR
 * OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE,
 * ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR
 * OTHER DEALINGS IN THE SOFTWARE.
 *
 * For more information, please refer to <http://unlicense.org>
 */
package com.github.sebhoss.units.storage;

import com.github.sebhoss.warnings.CompilerWarnings;

import org.junit.Assert;
import org.junit.Test;

/**
 * Tests for conversions between units.
 */
@SuppressWarnings({ CompilerWarnings.NLS, CompilerWarnings.STATIC_METHOD })
public class ConversionTest {

    /**
     * Checks that {@link StorageUnit#asMegabyte()} converts a kilobyte into a megabyte.
     */
    @Test
    public void shouldConvertKilobyteToMegabyte() {
        // Given
        final Kilobyte kilo = Kilobyte.valueOf(1);

        // When
        final Megabyte mega = kilo.asMegabyte();

        // Then
        Assert.assertEquals("Both units should represent the same amount of storage.", kilo.inByte(), mega.inByte());
    }

    /**
     * Checks that {@link StorageUnit#asMegabyte()} does not return <code>null</code>.
     */
    @Test
    public void shouldNotReturnNullForMegabyteConversion() {
        // Given
        final StorageUnit<?> unit = StorageUnits.metricValueOf(1);

        // When
        final Megabyte megabyte = unit.asMegabyte();

        // Then
        Assert.assertNotNull("The converted megabyte should never be NULL.", megabyte);
    }

}
