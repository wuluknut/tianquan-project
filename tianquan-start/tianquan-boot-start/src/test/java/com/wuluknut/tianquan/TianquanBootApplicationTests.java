package com.wuluknut.tianquan;

import lombok.RequiredArgsConstructor;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Tianquan 单体测试类
 *
 * @author <a href="mailto:wuluknut@gmail.com" rel="nofollow">wuluknut</a>
 * @version 0.0.0
 */
@SpringBootTest
@RequiredArgsConstructor
class TianquanBootApplicationTests {

    @Test
    void contextLoads() {
        assertTrue(true, "Test Passed");
    }
}
