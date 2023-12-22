package com.example.hex.domain.specification;

import com.example.hex.domain.entity.Router;
import com.example.hex.domain.vo.IP;
import com.example.hex.domain.vo.Network;

public class NetworkAvailabilitySpecification extends AbstractSpecification<Router> {
    private IP address;
    private String name;
    private int cidr;

    public NetworkAvailabilitySpecification(IP address, String name, int cidr) {
        this.address = address;
        this.name = name;
        this.cidr = cidr;
    }

    @Override
    public boolean isSatisfiedBy(Router router) {
        return router != null && isNetworkAvailable(router);
    }

    private boolean isNetworkAvailable(Router router) {
        for (Network network : router.retrieveNetworks()) {
            if (network.getAddress().equals(address) && network.getCidr() == cidr) return false;
        }
        return true;
    }
}
