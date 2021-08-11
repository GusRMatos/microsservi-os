package com.projeto_microsservissos.Shopping_cart.Model;

import org.springframework.data.redis.core.RedisHash;

@RedisHash("item")
public class Item {

    private Integer productid;
    private Integer amount;

    public Integer getProductid() {
        return productid;
    }

    public void setProductid(Integer productid) {
        this.productid = productid;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

}
