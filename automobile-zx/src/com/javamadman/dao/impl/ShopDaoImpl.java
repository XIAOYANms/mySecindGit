package com.javamadman.dao.impl;

import com.javamadman.dao.ShopDao;
import com.javamadman.entitys.Shop;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by IntelliJ IDEA
 * Date: 2018/4/14
 * Time: 10:42
 *
 * @author zx
 */
public class ShopDaoImpl implements ShopDao {
    @Override
    public int save(Shop shop) throws Exception {
        return 0;
    }

    @Override
    public int dele(Shop shop) {
        return 0;
    }

    @Override
    public int upda(Shop shop) {
        return 0;
    }

    @Override
    public List<Shop> findAll() throws SQLException {
        return null;
    }

    @Override
    public Shop findObjById(Long id) {
        return null;
    }
}
