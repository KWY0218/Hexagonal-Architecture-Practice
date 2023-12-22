package com.example.hex.domain.specification;

public class CIDRSpecification extends AbstractSpecification<Integer> {
    final static private int MINIMUM_ALLOWED_CIDR = 8;

    @Override
    public boolean isSatisfiedBy(Integer cidr) {
        return cidr > MINIMUM_ALLOWED_CIDR;
    }
}
