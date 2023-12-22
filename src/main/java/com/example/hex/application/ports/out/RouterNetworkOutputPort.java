package com.example.hex.application.ports.out;

import com.example.hex.domain.entity.Router;
import com.example.hex.domain.vo.RouterId;

public interface RouterNetworkOutputPort {
    Router fetchRouterById(RouterId routerId);

    boolean persistRouter(Router router);
}
