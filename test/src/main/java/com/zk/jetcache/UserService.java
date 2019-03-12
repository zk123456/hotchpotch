package com.zk.jetcache;

import com.alicp.jetcache.anno.CacheType;
import com.alicp.jetcache.anno.Cached;

/**
 * @Author Zhangk
 * @Date 16:17 2018/11/9
 * @Description
 */
public interface UserService {
    @Cached(expire = 100, cacheType = CacheType.REMOTE)
    User getUserById(long userId);
}
