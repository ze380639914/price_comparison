package com.zewu.price.comparison.mbg.mapper;

import com.zewu.price.comparison.mbg.model.TradingSheetDetail;
import com.zewu.price.comparison.mbg.model.TradingSheetDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TradingSheetDetailMapper {
    int countByExample(TradingSheetDetailExample example);

    int deleteByExample(TradingSheetDetailExample example);

    int deleteByPrimaryKey(String id);

    int insert(TradingSheetDetail record);

    int insertSelective(TradingSheetDetail record);

    List<TradingSheetDetail> selectByExample(TradingSheetDetailExample example);

    TradingSheetDetail selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") TradingSheetDetail record, @Param("example") TradingSheetDetailExample example);

    int updateByExample(@Param("record") TradingSheetDetail record, @Param("example") TradingSheetDetailExample example);

    int updateByPrimaryKeySelective(TradingSheetDetail record);

    int updateByPrimaryKey(TradingSheetDetail record);
}