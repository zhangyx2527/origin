package com.origin.common.core.util;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.metadata.OrderItem;
import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.origin.common.core.constant.PageConstants;
import com.origin.common.core.xss.SQLFilter;

import java.util.Map;

/**
 * 查询参数
 *
 * @author zhangyuxuan
 */
public class Query<T> {

    public IPage<T> getPage(Map<String, Object> params) {
        return this.getPage(params, null, false);
    }

    public IPage<T> getPage(Map<String, Object> params, String defaultOrderField, boolean isAsc) {
        //分页参数
        long curPage = 1;
        long limit = 10;

        if(params.get(PageConstants.PAGE) != null){
            curPage = Long.parseLong((String)params.get(PageConstants.PAGE));
        }
        if(params.get(PageConstants.LIMIT) != null){
            limit = Long.parseLong((String)params.get(PageConstants.LIMIT));
        }

        //分页对象
        Page<T> page = new Page<>(curPage, limit);

        //分页参数
        params.put(PageConstants.PAGE, page);

        //排序字段
        //防止SQL注入（因为sidx、order是通过拼接SQL实现排序的，会有SQL注入风险）
        String orderField = SQLFilter.sqlInject((String)params.get(PageConstants.ORDER_FIELD));
        String order = (String)params.get(PageConstants.ORDER);


        //前端字段排序
        if(StringUtils.isNotEmpty(orderField) && StringUtils.isNotEmpty(order)){
            if(PageConstants.ASC.equalsIgnoreCase(order)) {
                return  page.addOrder(OrderItem.asc(orderField));
            }else {
                return page.addOrder(OrderItem.desc(orderField));
            }
        }

        //没有排序字段，则不排序
        if(StringUtils.isBlank(defaultOrderField)){
            return page;
        }

        //默认排序
        if(isAsc) {
            page.addOrder(OrderItem.asc(defaultOrderField));
        }else {
            page.addOrder(OrderItem.desc(defaultOrderField));
        }

        return page;
    }
}
