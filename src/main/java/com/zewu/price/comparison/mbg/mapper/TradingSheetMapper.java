package com.zewu.price.comparison.mbg.mapper;

import com.zewu.price.comparison.mbg.model.TradingSheet;
import com.zewu.price.comparison.mbg.model.TradingSheetExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TradingSheetMapper {
    int countByExample(TradingSheetExample example);

    int deleteByExample(TradingSheetExample example);

    int deleteByPrimaryKey(String id);

    int insert(TradingSheet record);

    int insertSelective(TradingSheet record);

    List<TradingSheet> selectByExample(TradingSheetExample example);

    TradingSheet selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") TradingSheet record, @Param("example") TradingSheetExample example);

    int updateByExample(@Param("record") TradingSheet record, @Param("example") TradingSheetExample example);

    int updateByPrimaryKeySelective(TradingSheet record);

    int updateByPrimaryKey(TradingSheet record);
}