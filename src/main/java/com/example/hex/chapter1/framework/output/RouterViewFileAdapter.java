package com.example.hex.chapter1.framework.output;

import com.example.hex.chapter1.application.ports.out.RouterViewOutputPort;
import com.example.hex.chapter1.domain.Router;

import java.util.List;

public class RouterViewFileAdapter implements RouterViewOutputPort {
    @Override
    public List<Router> fetchRouters() {
        return null;
    }
}
