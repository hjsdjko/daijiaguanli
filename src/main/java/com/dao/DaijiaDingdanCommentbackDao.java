package com.dao;

import com.entity.DaijiaDingdanCommentbackEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.DaijiaDingdanCommentbackView;

/**
 * 代驾订单评价 Dao 接口
 *
 * @author 
 */
public interface DaijiaDingdanCommentbackDao extends BaseMapper<DaijiaDingdanCommentbackEntity> {

   List<DaijiaDingdanCommentbackView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
