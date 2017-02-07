package com.alex.api;

import com.alex.api.entity.data.jpa.Ticket;
import com.alex.api.repository.data.jpa.TicketRepository;
import com.alex.api.util.RedisUtil;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Function:
 *
 * @author Alex
 * @date 2017/2/7
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class RedisTests {
    @Autowired
    private StringRedisTemplate stringRedisTemplate;
    @Autowired
    private RedisUtil redisUtil;
    @Autowired
    private TicketRepository ticketRepository;
    @Test
    public void test() {
        // 保存字符串
        stringRedisTemplate.opsForValue().set("aaa", "111");
        Assert.assertEquals("111", stringRedisTemplate.opsForValue().get("aaa"));
    }

    @Test
    public void object()  {
        redisUtil.set("alex",1);
        redisUtil.set("test", ticketRepository.findAllByScenicPointContains("温泉"),100L);
    }
}
