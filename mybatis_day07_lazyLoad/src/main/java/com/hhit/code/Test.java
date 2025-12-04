package com.hhit.code;

import com.hhit.mapper.PlayerMapper;
import com.hhit.model.Player;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.util.List;

public class Test {
    public static void main(String[] args) throws IOException {
        SqlSession session = new SqlSessionFactoryBuilder().
                build(Resources.getResourceAsReader("mybatis_config.xml")).openSession();
        PlayerMapper mapper = session.getMapper(PlayerMapper.class);
        List<Player> players = mapper.selectList();
        for (Player player : players) {
            System.out.println(player.getPname()+player.getTeam().getTname());
        }
        session.close();
    }
}
