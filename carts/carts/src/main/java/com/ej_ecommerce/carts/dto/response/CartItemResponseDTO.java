package com.ej_ecommerce.carts.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
public class CartItemResponseDTO {
    private Long idCartItem;
    private Long idProduct;
    private int quantity;
}
