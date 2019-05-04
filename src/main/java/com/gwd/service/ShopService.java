package com.gwd.service;

import com.gwd.entity.Shop;
import org.apache.ibatis.annotations.Param;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

public interface ShopService {
    List<Shop> getList(Integer collegeId);
    Integer login(String phone, String password, HttpServletResponse response);
}
