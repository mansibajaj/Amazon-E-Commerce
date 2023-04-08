package com.ChinaMarket.Chinamarket.RequestDto;

import com.ChinaMarket.Chinamarket.Enum.ProductCategory;
import com.ChinaMarket.Chinamarket.Enum.ProductStatus;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class ProductRequestDto {
    private int sellerId;
    private String productName;

    private int price;

    private int quantity;

    ProductCategory productCategory;
    ProductStatus productStatus;
}

