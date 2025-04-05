package com.tradegenius.service;

import com.tradegenius.model.Coin;
import com.tradegenius.model.User;
import com.tradegenius.model.Watchlist;

public interface WatchlistService {

    Watchlist findUserWatchlist(Long userId) throws Exception;

    Watchlist createWatchList(User user);

    Watchlist findById(Long id) throws Exception;

    Coin addItemToWatchlist(Coin coin,User user) throws Exception;
}
