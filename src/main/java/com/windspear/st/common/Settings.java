package com.windspear.st.common;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by wild on 16-7-16.
 */

@Component
@ConfigurationProperties(prefix = "config")
@Data
public class Settings {
    private String name;
    private int age;
}
