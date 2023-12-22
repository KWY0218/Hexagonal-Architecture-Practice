package com.example.hex.domain.specification;

public abstract class AbstractSpecification<T> implements Specification<T> {

    public abstract boolean isSatisfiedBy(T t);

    @Override
    public Specification<T> and(Specification<T> specification) {
        return new AndSpecification<T>(this, specification);
    }
}
