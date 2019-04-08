package cn.itrip.service;

import cn.itrip.beans.pojo.ItripHotel;
import cn.itrip.beans.vo.hotel.HotelVideoDescVO;
import cn.itrip.beans.vo.hotel.ItripSearchDetailsHotelVO;
import cn.itrip.beans.vo.hotel.ItripSearchFacilitiesHotelVO;
import cn.itrip.beans.vo.hotel.ItripSearchPolicyHotelVO;

import java.util.List;

public interface ItripHotelService {


    public ItripHotel getItripHotelById(Long id)throws Exception;


    public HotelVideoDescVO getVideoDescByHotelId(Long id)throws Exception;
    /**
     * 根据酒店的id查询酒店的设施 -add by donghai
     * @param id
     * @return
     * @throws Exception
     */
    public ItripSearchFacilitiesHotelVO getItripHotelFacilitiesById(Long id)throws Exception;

    public ItripSearchPolicyHotelVO queryHotelPolicy(Long id)throws Exception;

    /**
     * 根据酒店的id查询酒店的特色和介绍 -add by donghai
     * @param id
     */
    public List<ItripSearchDetailsHotelVO> queryHotelDetails(Long id)throws Exception;

    public ItripHotel getItripHotelById1(Long id) throws Exception;
}
