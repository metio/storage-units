/* This program is free software. It comes without any warranty, to
 * the extent permitted by applicable law. You can redistribute it
 * and/or modify it under the terms of the Do What The Fuck You Want
 * To Public License, Version 2, as published by Sam Hocevar. See
 * http://sam.zoy.org/wtfpl/COPYING for more details. */
package com.github.sebhoss.units.storage;

import java.math.BigInteger;

import org.junit.Assert;
import org.junit.Test;

/**
 * Tests for Yottabytes.
 */
@SuppressWarnings({ "static-method", "nls" })
public class YottabyteTest {

    /**
     * Checks that a new {@link Yottabyte} instance must be created with a BigInteger.
     */
    @Test
    public void shouldConstructWithBigInteger() {
        // Given
        Yottabyte unit;

        // When
        unit = new Yottabyte(BigInteger.valueOf(1000));

        // Then
        Assert.assertNotNull(unit);
    }

    /**
     * Checks that {@link Yottabyte#valueOf(long)} does not return <code>null</code>.
     */
    @Test
    public void shouldCreateMegabyte() {
        // Given
        final StorageUnit<?> unit;

        // When
        unit = Yottabyte.valueOf(1000);

        // Then
        Assert.assertNotNull("The created unit should never be NULL.", unit);
    }

    /**
     * Checks that {@link Yottabyte#toString()} shows the correct symbol.
     */
    @Test
    public void shouldShowCorrectSymbol() {
        // Given
        final StorageUnit<?> unit;

        // When
        unit = StorageUnits.yottabyte(1);

        // Then
        Assert.assertTrue("The symbol for yottabyte should be 'YB'.", unit.toString().endsWith("YB"));
    }

    /**
     * Checks that {@link Yottabyte#toString()} shows the correct value.
     */
    @Test
    public void shouldShowCorrectValue() {
        // Given
        final StorageUnit<?> unit;

        // When
        unit = StorageUnits.yottabyte(1);

        // Then
        Assert.assertTrue("One yottabyte should be interpreted as '1.00' yottabytes.",
                unit.toString().startsWith("1.00"));
    }

    /**
     * Checks that {@link Yottabyte#add(long)} returns a new instance.
     */
    @Test
    public void shouldReturnNewInstanceAfterAddLong() {
        // Given
        final Yottabyte first = StorageUnits.yottabyte(1);

        // When
        final Yottabyte second = first.add(1000);

        // Then
        Assert.assertNotSame("The add(long) method must return a new instance.", first, second);
    }

    /**
     * Checks that {@link Yottabyte#add(long)} adds the given number of bytes to the new instance.
     */
    @Test
    public void shouldAddLongNumberOfBytes() {
        // Given
        Yottabyte unit = StorageUnits.yottabyte(1);

        // When
        unit = unit.add(StorageUnits.zettabyte(1).longValue());

        // Then
        Assert.assertEquals("The sum of 1 yottabyte and 1 zettabyte should be ~ '1.00 YB'.", "1.00 YB", unit.toString());
    }

    /**
     * Checks that {@link Yottabyte#add(StorageUnit)} returns a new instance.
     */
    @Test
    public void shouldReturnNewInstanceAfterAddStorage() {
        // Given
        final Yottabyte first = StorageUnits.yottabyte(1);

        // When
        final Yottabyte second = first.add(StorageUnits.yottabyte(1));

        // Then
        Assert.assertNotSame("The add(StorageUnit) method must return a new instance.", first, second);
    }

    /**
     * Checks that {@link Yottabyte#add(StorageUnit)} adds the given storage amount to the new instance.
     */
    @Test
    public void shouldAddStorage() {
        // Given
        Yottabyte unit = StorageUnits.yottabyte(1);

        // When
        unit = unit.add(StorageUnits.yottabyte(1));

        // Then
        Assert.assertEquals("The sum of '1.00 YB' + '1.00 YB' should be '2.00 YB'.", "2.00 YB", unit.toString());
    }

    /**
     * Checks that {@link Yottabyte#divide(long)} returns a new instance.
     */
    @Test
    public void shouldReturnNewInstanceAfterDivide() {
        // Given
        final Yottabyte first = StorageUnits.yottabyte(1);

        // When
        final Yottabyte second = first.divide(5);

        // Then
        Assert.assertNotSame("The divide(long) method must return a new instance.", first, second);
    }

    /**
     * Checks that {@link Yottabyte#divide(long)} divides the current storage amount correct to the new instance.
     */
    @Test
    public void shouldDivide() {
        // Given
        Yottabyte unit = StorageUnits.yottabyte(1);

        // When
        unit = unit.divide(5);

        // Then
        Assert.assertEquals("The division '1.00 YB' / 5 should be '0.20 YB'.", "0.20 YB", unit.toString());
    }

    /**
     * Checks that {@link Yottabyte#multiply(long)} returns a new instance.
     */
    @Test
    public void shouldReturnNewInstanceAfterMultiply() {
        // Given
        final Yottabyte first = StorageUnits.yottabyte(1);

        // When
        final Yottabyte second = first.multiply(5);

        // Then
        Assert.assertNotSame("The multiply(long) method must return a new instance.", first, second);
    }

    /**
     * Checks that {@link Yottabyte#multiply(long)} multiplies the current storage amount correct to the new instance.
     */
    @Test
    public void shouldMultiply() {
        // Given
        Yottabyte unit = StorageUnits.yottabyte(1);

        // When
        unit = unit.multiply(5);

        // Then
        Assert.assertEquals("The product of '1.00 YB' and 5 should be '5.00 YB'.", "5.00 YB", unit.toString());
    }

    /**
     * Checks that {@link Yottabyte#subtract(long)} returns a new instance.
     */
    @Test
    public void shouldReturnNewInstanceAfterSubtractLong() {
        // Given
        final Yottabyte first = StorageUnits.yottabyte(10);

        // When
        final Yottabyte second = first.subtract(1000);

        // Then
        Assert.assertNotSame("The subtract(long) method must return a new instance.", first, second);
    }

    /**
     * Checks that {@link Yottabyte#subtract(long)} subtracts the given number of bytes to the new instance.
     */
    @Test
    public void shouldSubtractLongNumberOfBytes() {
        // Given
        Yottabyte unit = StorageUnits.yottabyte(1);

        // When
        unit = unit.subtract(StorageUnits.zettabyte(1).longValue());

        // Then
        Assert.assertEquals("The difference between 1 yottabytes and 1 zettabytes should not be noticeable.",
                "1.00 YB", unit.toString());
    }

    /**
     * Checks that {@link Yottabyte#subtract(StorageUnit)} returns a new instance.
     */
    @Test
    public void shouldReturnNewInstanceAfterSubtractStorage() {
        // Given
        final Yottabyte first = StorageUnits.yottabyte(10);

        // When
        final Yottabyte second = first.subtract(StorageUnits.yottabyte(1));

        // Then
        Assert.assertNotSame("The subtract(StorageUnit) method must return a new instance.", first, second);
    }

    /**
     * Checks that {@link Yottabyte#subtract(StorageUnit)} subtracts the given storage amount to the new instance.
     */
    @Test
    public void shouldSubtractStorage() {
        // Given
        Yottabyte unit = StorageUnits.yottabyte(10);

        // When
        unit = unit.subtract(StorageUnits.yottabyte(1));

        // Then
        Assert.assertEquals("The difference between '10.00 YB' and '1.00 YB' should be '9.00 YB'.", "9.00 YB",
                unit.toString());
    }

}
