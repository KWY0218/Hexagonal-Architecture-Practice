package com.example.hex.chapter1.framework.input;

import com.example.hex.chapter1.application.ports.in.RouterViewInputPort;
import com.example.hex.chapter1.application.usecases.RouterViewUseCase;
import com.example.hex.chapter1.domain.Router;
import com.example.hex.chapter1.domain.RouterType;
import com.example.hex.chapter1.framework.output.RouterViewFileAdapter;

import java.util.List;

public class RouterCLIAdapter {
    RouterViewUseCase routerViewUseCase;

    public RouterCLIAdapter() {
        setAdapters();
    }

    public List<Router> obtainRelateRouters(String type) {
        return routerViewUseCase.getRouters(
                Router.filterRouterByType(RouterType.valueOf(type)));
    }

    private void setAdapters() {
        routerViewUseCase = new RouterViewInputPort(new RouterViewFileAdapter());
    }
}
