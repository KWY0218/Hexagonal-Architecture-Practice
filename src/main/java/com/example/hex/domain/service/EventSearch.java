package com.example.hex.domain.service;

import com.example.hex.domain.entity.Event;
import com.example.hex.domain.vo.ParsePolicyType;

import java.util.ArrayList;
import java.util.List;

public class EventSearch {
    List<Event> retrieveEvents(List<String> unparsedEvents, ParsePolicyType parsePolicyType) {
        var parsedEvents = new ArrayList<Event>();
        unparsedEvents.forEach(event -> {
            parsedEvents.add(Event.parsedEvent(event, parsePolicyType));
        });
        return parsedEvents;
    }
}
