/* This program is free software. It comes without any warranty, to
 * the extent permitted by applicable law. You can redistribute it
 * and/or modify it under the terms of the Do What The Fuck You Want
 * To Public License, Version 2, as published by Sam Hocevar. See
 * http://sam.zoy.org/wtfpl/COPYING for more details. */
package com.github.sebhoss.units.storage;

import java.math.BigInteger;

/**
 * Mebibyte as specified in ISO IEC 80000-13:2008.
 */
public final class Mebibyte extends StorageUnit<Mebibyte> {

    /** Generated */
    private static final long serialVersionUID = 7697583678146919524L;

    /**
     * @param numberOfBytes
     *            The amount of bytes the mebibytes contains.
     * @return A new Mebibyte unit with the given value.
     */
    public static Mebibyte valueOf(final long numberOfBytes) {
        return new Mebibyte(BigInteger.valueOf(numberOfBytes));
    }

    Mebibyte(final BigInteger bytes) {
        super(bytes);
    }

    @Override
    public Mebibyte add(final long bytesToAdd) {
        return new Mebibyte(this.bytes.add(BigInteger.valueOf(bytesToAdd)));
    }

    @Override
    public Mebibyte add(final StorageUnit<?> storageAmount) {
        return new Mebibyte(this.bytes.add(storageAmount.bytes));
    }

    @Override
    public Mebibyte divide(final long divisor) {
        return new Mebibyte(this.bytes.divide(BigInteger.valueOf(divisor)));
    }

    @Override
    public Mebibyte multiply(final long factor) {
        return new Mebibyte(this.bytes.multiply(BigInteger.valueOf(factor)));
    }

    @Override
    public Mebibyte subtract(final long bytesToSubtract) {
        return new Mebibyte(this.bytes.subtract(BigInteger.valueOf(bytesToSubtract)));
    }

    @Override
    public Mebibyte subtract(final StorageUnit<?> storageAmount) {
        return new Mebibyte(this.bytes.subtract(storageAmount.bytes));
    }

    @Override
    protected BigInteger getNumberOfBytesPerUnit() {
        return StorageUnit.BYTES_IN_A_MEBIBYTE;
    }

    @Override
    protected String getSymbol() {
        return "MiB"; //$NON-NLS-1$
    }

}
