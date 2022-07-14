package redis;

import redis.clients.jedis.Jedis;

/**
 * @ProjectName: interview_practice
 * @Package: redis
 * @ClassName: DistributeLock
 * @Description: []
 * @Author: [Shawn]
 * @Date: 2022/7/12 18:17
 * @Version: V1.0
 * @Copyright: 2022  Inc. All rights reserved.
 * @TODO: Nothing
 **/
public class DistributeLock {
    public static void getWrongLock(Jedis jedis,String lockKey,String requestId,int expireTime){
        Long result = jedis.setnx(lockKey, requestId);
        if (result == 1){
            jedis.expire(lockKey,expireTime);
        }
    }

}