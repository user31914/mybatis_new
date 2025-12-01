package com.hhit.coder;

import com.hhit.model.Teacher;
import com.hhit.util.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;

public class UpdateJob {
    public static void main(String[] args) {
        SqlSession session = SqlSessionUtil.getSqlSession(true);
        Teacher teacher = new Teacher();
        teacher.setAge(30).setJob("销售员");
        int row = session.update("updateJob", teacher);
        session.close();
        System.out.println(row>0?"修改成功":"修改失败");
    }
}
