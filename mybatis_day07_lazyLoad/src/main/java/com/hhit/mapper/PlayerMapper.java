package com.hhit.mapper;

import com.hhit.model.Player;

import java.util.List;

public interface PlayerMapper {
    List<Player> selectList();
    List<Player> selectByTid(int tid);
}
