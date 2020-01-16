package demo.Mapper;

import demo.Entity.Role;
import demo.Entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface UserMapper {
    User loadUserByUserName(String username);
    List<Role> getUserRolesByUid(Integer id);
}
