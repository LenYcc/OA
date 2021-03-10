package com.dmc.oa.dao;

import com.dmc.oa.entity.Notice;
import com.dmc.oa.utils.MybatisUtils;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.*;

public class NoticeDaoTest {
    @Test
    public void testInsert(){
        MybatisUtils.executeUpdate(sqlSession -> {
            NoticeDao dao = sqlSession.getMapper(NoticeDao.class);
            Notice notice = new Notice();
            notice.setReceiverId(2l);
            notice.setContent("测试消息");
            notice.setCreateTime(new Date());
            dao.insert(notice);
            return null;
        });
    }

}