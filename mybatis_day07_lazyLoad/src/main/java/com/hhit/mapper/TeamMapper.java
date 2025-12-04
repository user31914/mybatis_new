package com.hhit.mapper;

import com.hhit.model.Player;
import com.hhit.model.Team;

import java.util.List;

public interface TeamMapper {
    Team selectById(int id);
    List<Team> teamList();
}
