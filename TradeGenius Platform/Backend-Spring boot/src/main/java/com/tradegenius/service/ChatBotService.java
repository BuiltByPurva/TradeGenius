package com.tradegenius.service;

import com.tradegenius.model.CoinDTO;
import com.tradegenius.response.ApiResponse;

public interface ChatBotService {
    ApiResponse getCoinDetails(String coinName);

    CoinDTO getCoinByName(String coinName);

    String simpleChat(String prompt);
}
