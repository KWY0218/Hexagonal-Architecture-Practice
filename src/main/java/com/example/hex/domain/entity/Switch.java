package com.example.hex.domain.entity;

import com.example.hex.domain.vo.IP;
import com.example.hex.domain.vo.Network;
import com.example.hex.domain.vo.SwitchId;
import com.example.hex.domain.vo.SwitchType;
import lombok.Getter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Getter
public class Switch {
    private SwitchType type;
    private SwitchId switchId;
    private List<Network> networks;
    private IP address;

    public Switch(SwitchType type, SwitchId switchId,
                  List<Network> networks, IP address) {
        this.type = type;
        this.switchId = switchId;
        this.networks = networks;
        this.address = address;
    }

    public Switch addNetwork(Network network) {
        var networks = new ArrayList<>(Arrays.asList(network));
        networks.add(network);
        return new Switch(this.type, this.switchId, networks, this.address);
    }
}
