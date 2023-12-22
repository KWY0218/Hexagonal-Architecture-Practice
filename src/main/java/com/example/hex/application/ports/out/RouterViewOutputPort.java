package com.example.hex.application.ports.out;

import com.example.hex.domain.Router;

import java.util.List;

public interface RouterViewOutputPort {
    List<Router> fetchRouters();
}
