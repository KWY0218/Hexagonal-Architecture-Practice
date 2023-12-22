package com.example.hex.domain.service;

import com.example.hex.domain.entity.Router;
import com.example.hex.domain.specification.CIDRSpecification;
import com.example.hex.domain.specification.NetworkAmountSpecification;
import com.example.hex.domain.specification.NetworkAvailabilitySpecification;
import com.example.hex.domain.specification.RouterTypeSpecification;
import com.example.hex.domain.vo.IP;
import com.example.hex.domain.vo.Network;

public class NetworkOperation {

    public void createNewNetwork(Router router, IP address, String name, int cidr) {
        var availabilitySpec = new NetworkAvailabilitySpecification(address, name, cidr);
        var cidrSpec = new CIDRSpecification();
        var routerTypeSpec = new RouterTypeSpecification();
        var amountSpec = new NetworkAmountSpecification();

        if (cidrSpec.isSatisfiedBy(cidr)) throw new IllegalArgumentException("CIDR is below ");
        if (availabilitySpec.isSatisfiedBy(router)) throw new IllegalArgumentException("Address already exist");
        if (amountSpec.and(routerTypeSpec).isSatisfiedBy(router)) {
            Network network = router.createNetwork(address, name, cidr);
            router.addNetworkToSwitch(network);
        }
    }
}
