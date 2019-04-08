package cn.itrip.service;

import cn.itrip.beans.pojo.ItripUserLinkUser;
import cn.itrip.beans.vo.order.ItripOrderLinkUserVo;
import cn.itrip.dao.biz.ItripOrderLinkUserMapper;
import cn.itrip.dao.biz.ItripUserLinkUserMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service("itripOrderLinkUserService")
public class ItripOrderLinkUserServiceImpl implements ItripOrderLinkUserService {

    @Resource
    private ItripOrderLinkUserMapper itripOrderLinkUserMapper;

    @Resource
    private ItripUserLinkUserMapper itripUserLinkUserMapper;

    @Override
    public List<ItripOrderLinkUserVo> getItripOrderLinkUserListByMap(Map<String, Object> param) throws Exception {
        return itripOrderLinkUserMapper.getItripOrderLinkUserListByMap(param);
    }


    public List<Long> getItripOrderLinkUserIdsByOrder() throws Exception{
        return itripOrderLinkUserMapper.getItripOrderLinkUserIdsByOrder();
    }



}
