package com.fjm;

import org.apache.activemq.command.ActiveMQQueue;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class MyMQTest {

    @Autowired
    private JmsTemplate jmsTemplate;

    @Test
    public void jms() {
        jmsTemplate.convertAndSend(new ActiveMQQueue("myTest"), "测试消息");
    }
}
