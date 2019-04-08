package cn.itrip.service;

import cn.itrip.beans.pojo.ItripLabelDic;
import cn.itrip.beans.vo.ItripLabelDicVO;
import cn.itrip.dao.biz.ItripLabelDicMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service("itripLabelDicService")
public class ItripLabelDicServiceImpl implements ItripLabelDicService {
    @Resource
    private ItripLabelDicMapper itripLabelDicMapper;

    public List<ItripLabelDic> getItripLabelDicListByMap(Map<String,Object> param)throws Exception{
        return itripLabelDicMapper.getItripLabelDicListByMap(param);
    }

    @Override
    public List<ItripLabelDicVO> getItripLabelDicByParentId(Long parentId) throws Exception {
        return itripLabelDicMapper.getItripLabelDicByParentId(parentId);
    }

}
