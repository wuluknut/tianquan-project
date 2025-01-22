package com.wuluknut.tianquan.core.config;

import com.wuluknut.tianquan.core.properties.TianquanProperties;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * Tianquan 核心配置类
 *
 * @author <a href="mailto:wuluknut@gmail.com" rel="nofollow">wuluknut</a>
 * @version 0.0.0
 */
@Configuration
@RequiredArgsConstructor
@EnableConfigurationProperties({TianquanProperties.class})
public class TianquanConfiguration {

    /**
     * Tianquan 核心属性
     */
    private final TianquanProperties properties;
}
