package com.tcellpair3.customerservice.core.dtos.responses.customer;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SearchResultsResponse {
    private int id;

    private String firstName;


    private String lastName;


    private String middleName;

    private String nationalId;
}
