package com.lksun.service1.entity;

import java.io.Serializable;
import lombok.Data;

@Data
public class Order implements Serializable {
    private Integer id;

    private Integer status;

    private static final long serialVersionUID = 1L;
}