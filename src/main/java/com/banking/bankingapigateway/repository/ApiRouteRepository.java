package com.banking.bankingapigateway.repository;

import com.banking.bankingapigateway.model.ApiRoute;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface ApiRouteRepository extends JpaRepository<ApiRoute, String> {
    List<ApiRoute> findByActiveTrue();
}
