package com.zk.jetcache;

/**
 * @Author Zhangk
 * @Date 16:18 2018/11/9
 * @Description
 */
public class UserServiceImpl implements UserService {
    @Override
    public User getUserById(long userId) {
        User user = new User();
        user.setAge(1);
        user.setId(1L);
        user.setName("1");
        return user;
    }
}
