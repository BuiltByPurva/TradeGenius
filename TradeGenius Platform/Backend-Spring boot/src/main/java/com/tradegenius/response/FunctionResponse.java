package com.tradegenius.response;

import lombok.Data;

@Data
public class FunctionResponse {
    private String functionName;
    private String currencyName;
    private String currencyData;
}
