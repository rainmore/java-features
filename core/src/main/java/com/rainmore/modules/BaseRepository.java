package com.rainmore.modules;

import com.rainmore.domains.Model;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface BaseRepository<T extends Model> extends JpaRepository<T, Long>, QuerydslPredicateExecutor<T> {

}