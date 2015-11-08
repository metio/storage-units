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

import nl.jqno.equalsverifier.EqualsVerifier;

import org.junit.Test;

/**
 * Test for equals() implementations of the storage units.
 */
@SuppressWarnings({ CompilerWarnings.STATIC_METHOD })
public class EqualsTest {

    /**
     * Checks that storage units implement equals() correctly.
     */
    @Test
    public void shouldImplementEqualsContract() {
        EqualsVerifier.forClass(StorageUnit.class).verify();
        EqualsVerifier.forClass(Exabyte.class).verify();
        EqualsVerifier.forClass(Exbibyte.class).verify();
        EqualsVerifier.forClass(Gibibyte.class).verify();
        EqualsVerifier.forClass(Gigabyte.class).verify();
        EqualsVerifier.forClass(Kibibyte.class).verify();
        EqualsVerifier.forClass(Kilobyte.class).verify();
        EqualsVerifier.forClass(Mebibyte.class).verify();
        EqualsVerifier.forClass(Megabyte.class).verify();
        EqualsVerifier.forClass(Pebibyte.class).verify();
        EqualsVerifier.forClass(Petabyte.class).verify();
        EqualsVerifier.forClass(Tebibyte.class).verify();
        EqualsVerifier.forClass(Terabyte.class).verify();
        EqualsVerifier.forClass(Yobibyte.class).verify();
        EqualsVerifier.forClass(Yottabyte.class).verify();
        EqualsVerifier.forClass(Zebibyte.class).verify();
        EqualsVerifier.forClass(Zettabyte.class).verify();
    }

}
