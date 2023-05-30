package com.yaron.builder.improve;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 杨宇
 * @Date 2022-05-25
 * @Version 1.0
 * @Description 产品
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class House {

 private String basic;
 private String wall;
 private String roofed;


}
