package com.example.hex.application.usecases;

import com.example.hex.domain.entity.Router;
import com.example.hex.domain.vo.Network;
import com.example.hex.domain.vo.RouterId;

public interface RouterNetworkUseCase {
    Router addNetworkToRouter(RouterId routerId, Network network);
}
