package com.hhit.code;

import com.hhit.mapper.TeamMapper;
import com.hhit.model.Player;
import com.hhit.model.Team;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.util.List;

public class TestOneToMany {
    public static void main(String[] args) throws IOException {
        SqlSession session = new SqlSessionFactoryBuilder().
                build(Resources.getResourceAsReader("mybatis_config.xml")).openSession();
        TeamMapper mapper = session.getMapper(TeamMapper.class);
        List<Team> teams = mapper.teamList();
        for (Team team : teams) {
            System.out.println(team.getTname());
            List<Player> players = team.getPlayers();
            for (Player player : players) {
                System.out.println(player.getPname());
            }
        }
        session.close();
    }
}
