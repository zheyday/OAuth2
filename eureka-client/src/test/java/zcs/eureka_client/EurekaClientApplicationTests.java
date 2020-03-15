package zcs.eureka_client;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import zcs.commons.mapper.SeckillMapper;
import zcs.commons.model.Seckill;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EurekaClientApplicationTests {

    @Autowired
    private SeckillMapper seckillMapper;
    @Test
    public void contextLoads() {
        Seckill seckill = seckillMapper.selectById(1);
        System.out.println(seckill);
    }

}
