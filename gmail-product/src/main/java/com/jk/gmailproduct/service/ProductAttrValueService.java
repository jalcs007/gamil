package com.jk.gmailproduct.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.jk.common.utils.PageUtils;
import com.jk.gmailproduct.entity.ProductAttrValueEntity;

import java.util.Map;

/**
 * spuÊôÐÔÖµ
 *
 * @author jiangkun
 * @email kun5581@qq.com
 * @date 2020-06-07 22:48:47
 */
public interface ProductAttrValueService extends IService<ProductAttrValueEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

