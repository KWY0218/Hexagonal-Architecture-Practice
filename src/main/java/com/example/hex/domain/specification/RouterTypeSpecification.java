package com.example.hex.domain.specification;

import com.example.hex.domain.entity.Router;
import com.example.hex.domain.vo.RouterType;

public class RouterTypeSpecification extends AbstractSpecification<Router> {
    @Override
    public boolean isSatisfiedBy(Router router) {
        return router.getRouterType().equals(RouterType.EDGE) ||
                router.getRouterType().equals(RouterType.CORE);
    }
}
