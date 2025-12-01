package com.hhit.coder;

import com.hhit.util.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;

public class DeleteEmp {
    public static void main(String[] args) {
        SqlSession session = SqlSessionUtil.getSqlSession(true);
        int row = session.delete("deleteEmp", 35);
        session.close();
        System.out.println(row>0?"删除成功":"删除失败");
    }
}
