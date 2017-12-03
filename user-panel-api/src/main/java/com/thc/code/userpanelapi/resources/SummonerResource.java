package com.thc.code.userpanelapi.resources;

import com.thc.code.userpanelapi.clients.SummonerClient;
import com.thc.code.userpanelapi.clients.domain.SummonerDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/Summoner")
@RestController
public class SummonerResource {

    @Autowired
    private SummonerClient summonerClient;

    @RequestMapping("/{name}")
    public SummonerDTO getSummonerInfo(@PathVariable("name") String name) {

        return summonerClient.getSummonerInfo(name);
    }
}
