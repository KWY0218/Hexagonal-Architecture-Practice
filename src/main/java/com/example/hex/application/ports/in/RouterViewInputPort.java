package com.example.hex.application.ports.in;

import com.example.hex.application.ports.out.RouterViewOutputPort;
import com.example.hex.application.usecases.RouterViewUseCase;
import com.example.hex.domain.entity.Router;
import com.example.hex.domain.service.RouterSearch;

import java.util.List;
import java.util.function.Predicate;

public class RouterViewInputPort implements RouterViewUseCase {
    private final RouterViewOutputPort routerViewOutputPort;

    public RouterViewInputPort(RouterViewOutputPort routerViewOutputPort) {
        this.routerViewOutputPort = routerViewOutputPort;
    }

    @Override
    public List<Router> getRouters(Predicate<Router> filter) {
        var routers = routerViewOutputPort.fetchRouters();
        return RouterSearch.retrieveRouter(routers, filter);
    }
}
