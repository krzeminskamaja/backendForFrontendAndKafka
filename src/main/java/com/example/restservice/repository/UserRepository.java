package com.example.restservice.repository;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;

import com.example.restservice.types.User;

public interface  UserRepository  extends JpaRepository<User, Integer> {


    public Optional<User> findByName(String name);

    public Optional<User> findByNameAndPass(String name, String pass);

    @Override
    public List<User> findAll();

    @Override
    public List<User> findAllById(Iterable<Integer> ids);

    @Override
    public <S extends User> List<S> saveAll(Iterable<S> entities);

    @Override
    public long count();

    @Override
    public void delete(User entity);

    @Override
    public void deleteAll();
    
}