package com.tcellpair3.customerservice.core.dtos.responses.address;

import com.tcellpair3.customerservice.entities.City;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class GetByIdAddressResponse {

    private City city; //TO DO : TR de citylerin kontrolü için api?

    private String district;


    private String street;
    private boolean isDefault;
    private String houseFlatNumber;


    private String addressDescription;

    private int customerId;
}
