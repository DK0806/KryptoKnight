package com.dhruv.service;

import com.dhruv.model.CoinDTO;
import com.dhruv.response.ApiResponse;

public interface ChatBotService {
    ApiResponse getCoinDetails(String coinName);

    CoinDTO getCoinByName(String coinName);

    String simpleChat(String prompt);
}
