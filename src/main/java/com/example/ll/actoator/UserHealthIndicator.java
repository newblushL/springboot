
package com.example.ll.actoator;

import org.springframework.boot.actuate.health.AbstractHealthIndicator;
import org.springframework.boot.actuate.health.Health;
import org.springframework.stereotype.Component;
/**
 * @description: 扩展Actuator健康端点
 * @author: ll
 * @create: 2019-07-28 17:00
 */
@Component
public class UserHealthIndicator extends AbstractHealthIndicator {
    @Override
    protected void doHealthCheck(Health.Builder builder) throws Exception {
        //up健康状态，down不健康状态
        builder.up().withDetail("status",true);
        //builder.down().withDetail("status",false);
    }
}
