package com.example.hex.chapter1.application.ports.out;

import com.example.hex.chapter1.domain.Router;

import java.util.List;

public interface RouterViewOutputPort {
    List<Router> fetchRouters();
}
