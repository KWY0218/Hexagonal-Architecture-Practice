package com.example.hex.chapter1.application.ports.in;

import com.example.hex.chapter1.application.ports.out.RouterViewOutputPort;
import com.example.hex.chapter1.application.usecases.RouterViewUseCase;
import com.example.hex.chapter1.domain.Router;

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
        return Router.retrieveRouter(routers, filter);
    }
}
