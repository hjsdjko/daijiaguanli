package com.dao;

import com.entity.DaijiaDingdanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.DaijiaDingdanView;

/**
 * 代驾订单 Dao 接口
 *
 * @author 
 */
public interface DaijiaDingdanDao extends BaseMapper<DaijiaDingdanEntity> {

   List<DaijiaDingdanView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
