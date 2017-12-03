package com.thc.code.userpanelapi.clients;

import com.thc.code.userpanelapi.clients.domain.SummonerDTO;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class SummonerClient {


    private static final String CLIENT_URL = "https://la2.api.riotgames.com/lol/summoner/v3/summoners/by-name/";
    private static final String LOL_API_KEY = "?api_key=RGAPI-1a476be5-b38c-4b62-a945-67332269cfb9";


    public SummonerDTO getSummonerInfo(String name) {
        String completeURL = CLIENT_URL + name + LOL_API_KEY;
        RestTemplate restTemplate = new RestTemplate();

        SummonerDTO summonerDTO = restTemplate.getForObject(completeURL, SummonerDTO.class);

        return summonerDTO;

    }
}
