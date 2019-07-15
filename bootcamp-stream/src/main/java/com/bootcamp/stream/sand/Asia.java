package com.bootcamp.stream.sand;

import java.math.BigInteger;

public final class Asia implements SandStorage {
    @Override
    public BigInteger getSandBeansQuantity() {
        return new BigInteger("98765432101234567890");
    }
}
