/* This program is free software. It comes without any warranty, to
 * the extent permitted by applicable law. You can redistribute it
 * and/or modify it under the terms of the Do What The Fuck You Want
 * To Public License, Version 2, as published by Sam Hocevar. See
 * http://sam.zoy.org/wtfpl/COPYING for more details. */
package com.github.sebhoss.units.storage;

import java.math.BigInteger;

/**
 * Kilobyte as specified in ISO IEC 80000-13:2008.
 */
public class Kilobyte extends StorageUnit<Kilobyte> {

    private static final long serialVersionUID = 6952239416014811456L;

    /**
     * @param numberOfBytes
     *            The amount of bytes the kilobytes contains.
     * @return A new Kilobyte unit with the given value.
     */
    public static Kilobyte valueOf(final long numberOfBytes) {
        return new Kilobyte(BigInteger.valueOf(numberOfBytes));
    }

    Kilobyte(final BigInteger numberOfBytes) {
        super(numberOfBytes);
    }

    @Override
    public Kilobyte add(final long bytesToAdd) {
        return new Kilobyte(this.bytes.add(BigInteger.valueOf(bytesToAdd)));
    }

    @Override
    public Kilobyte add(final StorageUnit<?> storageAmount) {
        return new Kilobyte(this.bytes.add(storageAmount.bytes));
    }

    @Override
    public Kilobyte divide(final long divisor) {
        return new Kilobyte(this.bytes.divide(BigInteger.valueOf(divisor)));
    }

    @Override
    public Kilobyte multiply(final long factor) {
        return new Kilobyte(this.bytes.multiply(BigInteger.valueOf(factor)));
    }

    @Override
    public Kilobyte subtract(final long bytesToSubtract) {
        return new Kilobyte(this.bytes.subtract(BigInteger.valueOf(bytesToSubtract)));
    }

    @Override
    public Kilobyte subtract(final StorageUnit<?> storageAmount) {
        return new Kilobyte(this.bytes.subtract(storageAmount.bytes));
    }

    @Override
    protected BigInteger getNumberOfBytesPerUnit() {
        return StorageUnit.BYTES_IN_A_KILOBYTE;
    }

    @Override
    protected String getSymbol() {
        return "kB"; //$NON-NLS-1$
    }

}
