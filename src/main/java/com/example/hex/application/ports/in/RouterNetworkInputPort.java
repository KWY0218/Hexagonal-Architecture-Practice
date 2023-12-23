package com.example.hex.application.ports.in;

import com.example.hex.application.ports.out.RouterNetworkOutputPort;
import com.example.hex.application.usecases.RouterNetworkUseCase;
import com.example.hex.domain.entity.Router;
import com.example.hex.domain.service.NetworkOperation;
import com.example.hex.domain.vo.Network;
import com.example.hex.domain.vo.RouterId;
import org.springframework.stereotype.Component;

@Component
public class RouterNetworkInputPort implements RouterNetworkUseCase {
    private final RouterNetworkOutputPort routerNetworkOutputPort;

    public RouterNetworkInputPort(RouterNetworkOutputPort routerNetworkOutputPort) {
        this.routerNetworkOutputPort = routerNetworkOutputPort;
    }

    @Override
    public Router addNetworkToRouter(RouterId routerId, Network network) {
        var router = fetchRouter(routerId);
        return createNetwork(router, network);
    }

    private Router fetchRouter(RouterId routerId) {
        return routerNetworkOutputPort.fetchRouterById(routerId);
    }

    private Router createNetwork(Router router, Network network) {
        var newRouter = NetworkOperation.createNewNetwork(router, network);
        return persistNetwork(router) ? newRouter : router;
    }

    private boolean persistNetwork(Router router) {
        return routerNetworkOutputPort.persistRouter(router);
    }
}
