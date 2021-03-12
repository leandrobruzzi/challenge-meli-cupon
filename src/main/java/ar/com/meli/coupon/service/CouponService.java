package ar.com.meli.coupon.service;

import ar.com.meli.coupon.dto.CalculateCouponRequestDto;
import ar.com.meli.coupon.dto.CalculateCouponResponseDto;
import ar.com.meli.coupon.exceptions.InsufficientAmountException;

public interface CouponService {

    CalculateCouponResponseDto calculateProducts(CalculateCouponRequestDto calculateCouponRequestDto) throws InsufficientAmountException;

}
