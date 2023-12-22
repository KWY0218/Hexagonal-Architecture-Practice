package com.example.hex.framework.output;

import com.example.hex.application.ports.out.RouterNetworkOutputPort;
import com.example.hex.domain.entity.Router;
import com.example.hex.domain.vo.RouterId;
import org.springframework.stereotype.Component;

@Component
public class NetworkJpaAdapter implements RouterNetworkOutputPort {
    @Override
    public Router fetchRouterById(RouterId routerId) {
        return null;
    }

    @Override
    public boolean persistRouter(Router router) {
        return false;
    }
}
