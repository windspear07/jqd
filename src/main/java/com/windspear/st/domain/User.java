package com.windspear.st.domain;

import lombok.Data;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

/**
 * Created by wild on 16-7-13.
 */
@Data
@ToString(callSuper = true)
@Slf4j
public class User{

    private  String name;
    private  String id;
    private  int age;
}
