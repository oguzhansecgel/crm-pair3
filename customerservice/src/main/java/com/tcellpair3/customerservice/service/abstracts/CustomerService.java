package com.tcellpair3.customerservice.service.abstracts;

import com.tcellpair3.customerservice.core.dtos.requests.customer.CreateCustomerRequest;
import com.tcellpair3.customerservice.core.dtos.requests.customer.UpdateCustomerRequest;
import com.tcellpair3.customerservice.core.dtos.responses.customer.*;
import com.tcellpair3.customerservice.entities.Customer;
import jakarta.persistence.criteria.CriteriaBuilder;

import java.util.List;
import java.util.Optional;

public interface CustomerService {

    CreateCustomerResponse createCustomer(CreateCustomerRequest request);
    UpdateCustomerResponse updateCustomer(int id, UpdateCustomerRequest request);
    void deleteCustomer(int id);
    List<GetAllCustomersResponse> getAllCustomers();
    Optional<GetByIdCustomerResponse> getByCustomerId(int id);
    List<GetAllCustomersResponse> findByFirstNameStartingWithIgnoreCase(String nameStart);
    List<SearchResultsResponse> findByFirstName(String firstName);
    List<SearchResultsResponse> findByLastName(String lastName);
    List<SearchResultsResponse> findByAccountNumber(Integer accountNumber);
    List<SearchResultsResponse> findByNationalId(String nationalId);
    List<SearchResultsResponse> findByContactMedium_MobilePhone(String mobilePhone);
}
