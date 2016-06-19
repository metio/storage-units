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
 * Petabyte as specified in ISO IEC 80000-13:2008 (1 Petabyte = 1 000 000 000 000 000 Byte).
 */
public class Petabyte extends StorageUnit<Petabyte> {

    private static final long serialVersionUID = 5889808368085688387L;

    Petabyte(final BigInteger bytes) {
        super(bytes);
    }

    /**
     * @param numberOfBytes
     *            The amount of bytes the petabyte contains.
     * @return A new Petabyte unit with the given value.
     */
    public static Petabyte valueOf(final BigInteger numberOfBytes) {
        return new Petabyte(numberOfBytes);
    }

    /**
     * @param numberOfBytes
     *            The amount of bytes the petabytes contains.
     * @return A new Petabyte unit with the given value.
     */
    public static Petabyte valueOf(final long numberOfBytes) {
        return new Petabyte(asBigInteger(numberOfBytes));
    }

    /**
     * @param numberOfBytes
     *            The amount of bytes the petabytes contains.
     * @return A new Petabyte unit with the given value.
     */
    public static Petabyte valueOf(final Long numberOfBytes) {
        return valueOf(numberOfBytes.longValue());
    }

    @Override
    public Petabyte add(final long bytesToAdd) {
        return new Petabyte(addNullsafe(bytes, asBigInteger(bytesToAdd)));
    }

    @Override
    public Petabyte add(final StorageUnit<?> storageAmount) {
        return new Petabyte(addNullsafe(bytes, storageAmount.bytes));
    }

    @Override
    public Petabyte divide(final long divisor) {
        return new Petabyte(divideNullsafe(bytes, asBigInteger(divisor)));
    }

    @Override
    public Petabyte multiply(final long factor) {
        return new Petabyte(multiplyNullsafe(bytes, asBigInteger(factor)));
    }

    @Override
    public Petabyte subtract(final long bytesToSubtract) {
        return new Petabyte(subtractNullsafe(bytes, asBigInteger(bytesToSubtract)));
    }

    @Override
    public Petabyte subtract(final StorageUnit<?> storageAmount) {
        return new Petabyte(subtractNullsafe(bytes, storageAmount.bytes));
    }

    @Override
    protected BigInteger getNumberOfBytesPerUnit() {
        return StorageUnit.BYTES_IN_A_PETABYTE;
    }

    @Override
    protected String getSymbol() {
        return "PB"; //$NON-NLS-1$
    }

}
