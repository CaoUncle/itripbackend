package cn.itrip.service;

import cn.itrip.beans.pojo.ItripAreaDic;
import cn.itrip.dao.biz.ItripAreaDicMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service("itripAreaDicService")
public class ItripAreaDicServiceImpl implements ItripAreaDicService {
    @Resource
    private ItripAreaDicMapper itripAreaDicMapper;

    public List<ItripAreaDic>  getItripAreaDicListByMap(Map<String,Object> param)throws Exception{
        return itripAreaDicMapper.getItripAreaDicListByMap(param);
    }

}
