package com.zewu.price.comparison.mbg.mapper;

import com.zewu.price.comparison.mbg.model.BrickOrGoods;
import com.zewu.price.comparison.mbg.model.BrickOrGoodsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BrickOrGoodsMapper {
    int countByExample(BrickOrGoodsExample example);

    int deleteByExample(BrickOrGoodsExample example);

    int deleteByPrimaryKey(String id);

    int insert(BrickOrGoods record);

    int insertSelective(BrickOrGoods record);

    List<BrickOrGoods> selectByExample(BrickOrGoodsExample example);

    BrickOrGoods selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") BrickOrGoods record, @Param("example") BrickOrGoodsExample example);

    int updateByExample(@Param("record") BrickOrGoods record, @Param("example") BrickOrGoodsExample example);

    int updateByPrimaryKeySelective(BrickOrGoods record);

    int updateByPrimaryKey(BrickOrGoods record);
}