package com.atguigu.producterservice.service.impl;

import com.atguigu.producterservice.entity.TProduct;
import com.atguigu.producterservice.mapper.TProductMapper;
import com.atguigu.producterservice.service.TPRODUCTervice;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 商品表 服务实现类
 * </p>
 *
 * @author testjava
 * @since 2020-09-07
 */
@Service
public class TProductServiceImpl extends ServiceImpl<TProductMapper, TProduct> implements TPRODUCTervice {

}
