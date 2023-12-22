package com.example.hex.domain.specification;

import com.example.hex.domain.entity.Router;

public class NetworkAmountSpecification extends AbstractSpecification<Router> {
    final static public int MAXIMUM_ALLOWED_NETWORKS = 6;

    @Override
    public boolean isSatisfiedBy(Router router) {
        return router.retrieveNetworks().size() <= MAXIMUM_ALLOWED_NETWORKS;
    }
}
