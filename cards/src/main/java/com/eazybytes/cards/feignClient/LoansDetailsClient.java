package com.eazybytes.cards.feignClient;

import java.util.Optional;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.eazybytes.cards.dto.LoansDto;

import jakarta.validation.constraints.Pattern;

// @FeignClient(value="eureka-client-loans", path="/api") // value는 bean으로 등록될 이름,path는 요청보낼endpoint
@FeignClient(value="cha-loans-client", path="/api") // value는 bean으로 등록될 이름,path는 요청보낼endpoint
public interface LoansDetailsClient {

@GetMapping("/fetch")
public Optional<LoansDto> fetchLoanDetails(@RequestParam
@Pattern(regexp="(^$|[0-9]{10})",message = "Mobile number must be 10 digits")
String mobileNumber);

}
