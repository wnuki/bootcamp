package com.bootcamp.stream.sand;

import java.math.BigInteger;

public final class Europe implements SandStorage {
    @Override
    public BigInteger getSandBeansQuantity() {
        return new BigInteger("12345678901234567890");
    }
}