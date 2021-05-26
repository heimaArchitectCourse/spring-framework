package myBatisRegister;

import org.apache.ibatis.annotations.Select;

/**
 * @Author: twc
 * @Date 2021/5/26 10:45
 **/
public interface UserMapper {

	  @Select("select*from user limit 1")
	  String queryUser();
}
