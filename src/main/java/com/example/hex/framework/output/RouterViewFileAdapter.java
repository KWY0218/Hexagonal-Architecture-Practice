package com.example.hex.framework.output;

import com.example.hex.application.ports.out.RouterViewOutputPort;
import com.example.hex.domain.entity.Router;

import java.util.List;

public class RouterViewFileAdapter implements RouterViewOutputPort {
    @Override
    public List<Router> fetchRouters() {
        return null;
    }
}
