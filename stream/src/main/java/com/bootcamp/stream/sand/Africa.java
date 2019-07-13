package com.bootcamp.stream.sand;

import java.math.BigInteger;

public final class Africa implements SandStorage {
    @Override
    public BigInteger getSandBeansQuantity() {
        return new BigInteger("99999999901234567890");
    }
}