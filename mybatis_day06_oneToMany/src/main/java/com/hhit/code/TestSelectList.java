package com.hhit.code;

import com.hhit.mapper.TeamMapper;
import com.hhit.model.Player;
import com.hhit.model.Team;
import com.hhit.util.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class TestSelectList {
    public static void main(String[] args) {
        SqlSession session = SqlSessionUtil.getSqlSession();
        TeamMapper mapper = session.getMapper(TeamMapper.class);
        List<Team> teams = mapper.selectList();
        for (Team team : teams) {
            List<Player> players = team.getPlayers();
            for (Player player : players) {
                System.out.println(player);
            }
        }
        session.close();
    }
}
