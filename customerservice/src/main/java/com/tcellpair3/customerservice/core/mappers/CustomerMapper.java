package com.tcellpair3.customerservice.core.mappers;

import com.tcellpair3.customerservice.core.dtos.requests.customer.CreateCustomerRequest;
import com.tcellpair3.customerservice.core.dtos.requests.customer.UpdateCustomerRequest;
import com.tcellpair3.customerservice.core.dtos.responses.customer.GetByIdCustomerResponse;
import com.tcellpair3.customerservice.core.dtos.responses.customer.GetAllCustomersResponse;
import com.tcellpair3.customerservice.core.dtos.responses.customer.SearchResultsResponse;
import com.tcellpair3.customerservice.entities.Customer;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface CustomerMapper {
    CustomerMapper INSTANCE = Mappers.getMapper(CustomerMapper.class);

    @Mapping(target = "accountNumber", source = "accountNumber")
    Customer createCustomerMapper(CreateCustomerRequest request);

    GetByIdCustomerResponse getByIdCustomerMapper(Customer customer);

    GetAllCustomersResponse getAllCustomerMapper(Customer customer);
    SearchResultsResponse searchResultResponse(Customer customer);
    List<GetAllCustomersResponse> customersToListCustomerResponses(List<Customer> customers);


    @Mapping(target = "accountNumber", source = "accountNumber")
    Customer updateCustomerMapper(UpdateCustomerRequest customerRequest, @MappingTarget Customer customer);

}
