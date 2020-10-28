package com.lksun.service2.entity;

import java.io.Serializable;
import lombok.Data;

/**
 * orders
 * @author 
 */
@Data
public class Orders implements Serializable {
    private Integer id;

    private Boolean status;

    private static final long serialVersionUID = 1L;
}