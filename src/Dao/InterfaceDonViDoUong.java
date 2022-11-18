/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Model.DonviDoUong;
import java.util.List;

/**
 *
 * @author top1z
 */
public interface InterfaceDonViDoUong  {
     abstract public void insert(DonviDoUong dv);

    abstract public void update(DonviDoUong dv);

    abstract public void delete(String id);

    abstract public List<DonviDoUong> seleall();

    abstract public DonviDoUong selectID(String id);

    abstract public List<DonviDoUong> selectBysql(String sql, Object... agrs);
}
