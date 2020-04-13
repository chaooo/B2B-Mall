package com.example.mall.service;

import com.example.mall.entity.PmsBrand;

import java.util.List;

/**
 * Description
 *
 * @author : Charles
 * @date : 2020/4/13
 */
public interface PmsBrandService {
    List<PmsBrand> listAllBrand();

    int createBrand(PmsBrand brand);

    int updateBrand(Long id, PmsBrand brand);

    int deleteBrand(Long id);

    List<PmsBrand> listBrand(int pageNum, int pageSize);

    PmsBrand getBrand(Long id);
}
