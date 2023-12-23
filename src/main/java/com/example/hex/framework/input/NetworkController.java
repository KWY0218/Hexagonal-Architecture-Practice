package com.example.hex.framework.input;

import com.example.hex.application.usecases.RouterNetworkUseCase;
import com.example.hex.domain.vo.IP;
import com.example.hex.domain.vo.Network;
import com.example.hex.domain.vo.RouterId;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequiredArgsConstructor
public class NetworkController {
    private final RouterNetworkUseCase routerNetworkUseCase;

    @GetMapping("/test")
    void test() {
        routerNetworkUseCase.addNetworkToRouter(RouterId.withoutId(), new Network(IP.fromAddress(""), "", 1));
    }
}
