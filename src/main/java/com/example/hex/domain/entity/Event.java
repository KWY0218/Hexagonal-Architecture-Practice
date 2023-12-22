package com.example.hex.domain.entity;

import com.example.hex.domain.policy.RegexEventParser;
import com.example.hex.domain.policy.SplitEventParser;
import com.example.hex.domain.vo.Activity;
import com.example.hex.domain.vo.EventId;
import com.example.hex.domain.vo.ParsePolicyType;
import com.example.hex.domain.vo.Protocol;
import lombok.AllArgsConstructor;

import java.time.OffsetDateTime;
import java.util.Objects;

@AllArgsConstructor
public class Event implements Comparable<Event> {
    private OffsetDateTime timestamp;
    private EventId id;
    private Protocol protocol;
    private Activity activity;


    public static Event parsedEvent(String unparsedEvent, ParsePolicyType policy) {
        return switch (policy) {
            case REGEX -> new RegexEventParser().parseEvent(unparsedEvent);
            case SPLIT -> new SplitEventParser().parseEvent(unparsedEvent);
            default -> throw new IllegalArgumentException("");
        };
    }

    @Override
    public int compareTo(Event event) {
        return timestamp.compareTo(event.timestamp);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Event) {
            Event event = (Event) obj;
            return (event.timestamp.equals(this.timestamp)
                    && event.id.equals(this.id)
                    && event.protocol.equals(this.protocol)
                    && event.activity.equals(this.activity)
            );
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(timestamp, id, protocol, activity) + 31;
    }
}
