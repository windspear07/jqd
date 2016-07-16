package com.windspear.st.domain;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by wild on 16-7-13.
 */
@Component
@Data
public class D2 {

    @Value("${d2.name}")
    private String name;
}
