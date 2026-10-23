package com.campushub.expensetracker;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDate;
import java.util.List;

public interface ExpenseRepository extends JpaRepository<Expense, Long> {

    List<Expense> findByCategory(String category);

    List<Expense> findByDateBetween(LocalDate from, LocalDate to);

    @Query("select e.category, sum(e.amount) from Expense e group by e.category")
    List<Object[]> totalByCategory();
}