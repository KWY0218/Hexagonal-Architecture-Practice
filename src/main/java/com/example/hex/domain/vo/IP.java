package com.example.hex.domain.vo;

public class IP {
    private final String address;
    private final Protocol protocol;

    public IP(String address, Protocol protocol) {
        if (address == null) throw new IllegalArgumentException("NULL IP address");

        if (address.length() < 15) this.protocol = Protocol.IPV4;
        else this.protocol = Protocol.IPV6;
        this.address = address;
    }
}
