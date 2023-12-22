package com.example.hex.framework.input;

import com.example.hex.application.ports.in.RouterViewInputPort;
import com.example.hex.application.usecases.RouterViewUseCase;
import com.example.hex.domain.entity.Router;
import com.example.hex.domain.vo.RouterType;
import com.example.hex.framework.output.RouterViewFileAdapter;

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
