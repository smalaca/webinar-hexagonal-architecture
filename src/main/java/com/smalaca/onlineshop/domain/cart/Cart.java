package com.smalaca.onlineshop.domain.cart;

import com.smalaca.onlineshop.domain.offer.Offer;
import com.smalaca.onlineshop.domain.product.Product;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import static java.util.stream.Collectors.toList;
import static javax.persistence.FetchType.EAGER;

@Entity
@Table(name = "CARTS")
public class Cart {
    @Id
    @GeneratedValue
    private UUID cartId;

    private UUID buyerId;

    @OneToMany(fetch = EAGER)
    private List<CartItem> products = new ArrayList<>();

    public void add(Product product) {
        products.add(product.asCartItem());
    }

    public Offer offerFor(UUID buyerId, CreateOfferCommand command) {
        List<CartItem> productsInTheCart = productsInTheCart(command);

        if (areAllSelectedInTheCart(productsInTheCart, command)) {
            Offer.Builder builder = new Offer.Builder(buyerId);
            productsInTheCart.forEach(item -> {
                builder.product(item.getProductId(), item.getSellerId(), item.getPrice());
            });

            return builder.build();
        } else {
            List<UUID> productIds = productsInTheCart.stream()
                    .map(CartItem::getProductId)
                    .collect(toList());

            throw new ProductsNotInTheCartException(productIds, command.getProductIds());
        }
    }

    private boolean areAllSelectedInTheCart(List<CartItem> productsInTheCart, CreateOfferCommand command) {
        return productsInTheCart.size() == command.getProductIds().size();
    }

    private List<CartItem> productsInTheCart(CreateOfferCommand command) {
        List<UUID> productIds = command.getProductIds();

        return products.stream()
                .filter(cartItem -> cartItem.wasSelected(productIds))
                .collect(toList());
    }
}
