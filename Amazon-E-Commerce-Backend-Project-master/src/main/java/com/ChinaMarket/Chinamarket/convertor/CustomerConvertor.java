package com.ChinaMarket.Chinamarket.convertor;

import com.ChinaMarket.Chinamarket.Model.Customer;
import com.ChinaMarket.Chinamarket.RequestDto.CustomerRequestDto;
import lombok.experimental.UtilityClass;

@UtilityClass
public class CustomerConvertor {

    public static  Customer CustomerRequestDtoToCustomer(CustomerRequestDto customerRequestDto){

        return Customer.builder()
                .name(customerRequestDto.getName())
                .age(customerRequestDto.getAge())
                .email(customerRequestDto.getEmail())
                .mobNo(customerRequestDto.getMobNo())
                .build();
    }
}
