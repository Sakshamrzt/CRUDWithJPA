package com.example.demo.repository;
import com.example.demo.model.Customer;
import java.util.List;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;
@Repository
public interface Repo extends CrudRepository<Customer, Long> {
}