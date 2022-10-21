package com.smalaca.onlineshop.domain.cart;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.UUID;

@Getter
@RequiredArgsConstructor
public class CreateOfferCommand {
    private final List<UUID> productIds;
}
