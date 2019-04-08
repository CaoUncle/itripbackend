package cn.itrip.service;

import cn.itrip.beans.vo.order.ItripOrderLinkUserVo;

import java.util.List;
import java.util.Map;

public interface ItripOrderLinkUserService {
    public List<ItripOrderLinkUserVo> getItripOrderLinkUserListByMap(Map<String, Object> param)throws Exception;

    public List<Long> getItripOrderLinkUserIdsByOrder() throws Exception;
}
