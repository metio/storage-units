/*
 * This file is part of storage-units. It is subject to the license terms in the LICENSE file found in the top-level
 * directory of this distribution and at http://creativecommons.org/publicdomain/zero/1.0/. No part of storage-units,
 * including this file, may be copied, modified, propagated, or distributed except according to the terms contained
 * in the LICENSE file.
 */
package de.xn__ho_hia.utils.storage_unit;

import static de.xn__ho_hia.quality.null_analysis.NullsafeMath.addNullsafe;
import static de.xn__ho_hia.quality.null_analysis.NullsafeMath.asBigInteger;
import static de.xn__ho_hia.quality.null_analysis.NullsafeMath.divideNullsafe;
import static de.xn__ho_hia.quality.null_analysis.NullsafeMath.multiplyNullsafe;
import static de.xn__ho_hia.quality.null_analysis.NullsafeMath.subtractNullsafe;

import java.math.BigInteger;

/**
 * Pebibyte as specified in ISO IEC 80000-13:2008 (1 Pebibyte = 1 125 899 906 842 624 Byte).
 */
public final class Pebibyte extends StorageUnit<Pebibyte> {

    private static final long serialVersionUID = -6112472064345339882L;

    Pebibyte(final BigInteger bytes) {
        super(bytes);
    }

    /**
     * @param numberOfBytes
     *            The amount of bytes the pebibyte contains.
     * @return A new Pebibyte unit with the given value.
     */
    public static Pebibyte valueOf(final BigInteger numberOfBytes) {
        return new Pebibyte(numberOfBytes);
    }

    /**
     * @param numberOfBytes
     *            The amount of bytes the pebibytes contains.
     * @return A new Pebibyte unit with the given value.
     */
    public static Pebibyte valueOf(final long numberOfBytes) {
        return new Pebibyte(asBigInteger(numberOfBytes));
    }

    /**
     * @param numberOfBytes
     *            The amount of bytes the pebibytes contains.
     * @return A new Pebibyte unit with the given value.
     */
    public static Pebibyte valueOf(final Long numberOfBytes) {
        return valueOf(numberOfBytes.longValue());
    }

    @Override
    public Pebibyte add(final long bytesToAdd) {
        return new Pebibyte(addNullsafe(bytes, asBigInteger(bytesToAdd)));
    }

    @Override
    public Pebibyte add(final StorageUnit<?> storageAmount) {
        return new Pebibyte(addNullsafe(bytes, storageAmount.bytes));
    }

    @Override
    public Pebibyte divide(final long divisor) {
        return new Pebibyte(divideNullsafe(bytes, asBigInteger(divisor)));
    }

    @Override
    public Pebibyte multiply(final long factor) {
        return new Pebibyte(multiplyNullsafe(bytes, asBigInteger(factor)));
    }

    @Override
    public Pebibyte subtract(final long bytesToSubtract) {
        return new Pebibyte(subtractNullsafe(bytes, asBigInteger(bytesToSubtract)));
    }

    @Override
    public Pebibyte subtract(final StorageUnit<?> storageAmount) {
        return new Pebibyte(subtractNullsafe(bytes, storageAmount.bytes));
    }

    @Override
    protected BigInteger getNumberOfBytesPerUnit() {
        return StorageUnit.BYTES_IN_A_PEBIBYTE;
    }

    @Override
    protected String getSymbol() {
        return "PiB"; //$NON-NLS-1$
    }

}
