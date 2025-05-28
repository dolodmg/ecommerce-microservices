package com.ej_ecommerce.carts.dto.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
public class CartItemRequestDTO {
    private Long idProduct;
    private int quantity;
}
