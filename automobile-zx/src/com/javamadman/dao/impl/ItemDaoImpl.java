package com.javamadman.dao.impl;

import com.javamadman.dao.ItemDao;
import com.javamadman.entitys.Item;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by IntelliJ IDEA
 * Date: 2018/4/14
 * Time: 10:41
 *
 * @author zx
 */
public class ItemDaoImpl implements ItemDao {
    @Override
    public int save(Item item) throws Exception {
        return 0;
    }

    @Override
    public int dele(Item item) {
        return 0;
    }

    @Override
    public int upda(Item item) {
        return 0;
    }

    @Override
    public List<Item> findAll() throws SQLException {
        return null;
    }

    @Override
    public Item findObjById(Long id) {
        return null;
    }
}
