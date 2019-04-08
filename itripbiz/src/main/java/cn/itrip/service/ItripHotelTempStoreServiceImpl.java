package cn.itrip.service;

import cn.itrip.beans.pojo.ItripHotelRoom;
import cn.itrip.beans.vo.store.StoreVO;
import cn.itrip.common.EmptyUtils;
import cn.itrip.dao.biz.ItripHotelRoomMapper;
import cn.itrip.dao.biz.ItripHotelTempStoreMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service("itripHotelTempStoreService")
public class ItripHotelTempStoreServiceImpl implements ItripHotelTempStoreService{

    @Resource
    private ItripHotelRoomMapper itripHotelRoomMapper;

    @Resource
    private ItripHotelTempStoreMapper itripHotelTempStoreMapper;

    @Override
    public List<StoreVO> queryRoomStore(Map<String, Object> param) throws Exception {
        itripHotelTempStoreMapper.flushStore(param);
        return itripHotelTempStoreMapper.queryRoomStore(param);
    }


    @Override
    public ItripHotelRoom getItripHotelRoomById(Long id) throws Exception {
        return itripHotelRoomMapper.getItripHotelRoomById(id);
    }

    @Override
    public boolean validateRoomStore(Map<String, Object> param) throws Exception {
        Integer count = (Integer) param.get("count");
        itripHotelTempStoreMapper.flushStore(param);
        List<StoreVO> storeVOList = itripHotelTempStoreMapper.queryRoomStore(param);
        if(EmptyUtils.isEmpty(storeVOList)){
            return false;
        }
        for (StoreVO vo : storeVOList) {
            if (vo.getStore() < count) {
                return false;
            }
        }
        return true;
    }


}
