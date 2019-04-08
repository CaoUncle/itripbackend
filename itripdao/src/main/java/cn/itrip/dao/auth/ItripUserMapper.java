package cn.itrip.dao.auth;

import cn.itrip.beans.pojo.ItripUser;
import org.mapstruct.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface ItripUserMapper {
    public List<ItripUser> getItripUserListByMap(Map<String,Object> param);

    public Integer addUser(ItripUser user);

    public Integer updateItripUser(ItripUser itripUser)throws Exception;
}
