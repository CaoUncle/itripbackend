package cn.itrip.service;

import cn.itrip.beans.pojo.ItripHotelRoom;
import cn.itrip.beans.vo.store.StoreVO;

import java.util.List;
import java.util.Map;

public interface ItripHotelTempStoreService {
    public ItripHotelRoom getItripHotelRoomById(Long id)throws Exception;

    public List<StoreVO> queryRoomStore(Map<String, Object> param)throws Exception;

    public boolean validateRoomStore(Map<String, Object> param)throws Exception;
}
