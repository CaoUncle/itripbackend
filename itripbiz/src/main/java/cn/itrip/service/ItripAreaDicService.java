package cn.itrip.service;

import cn.itrip.beans.pojo.ItripAreaDic;

import java.util.List;
import java.util.Map;

public interface ItripAreaDicService {
    List<ItripAreaDic> getItripAreaDicListByMap(Map<String, Object> param) throws Exception;
}
