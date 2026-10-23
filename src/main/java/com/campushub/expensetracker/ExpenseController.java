package com.campushub.expensetracker;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/expenses")
@RequiredArgsConstructor
public class ExpenseController {

    private final ExpenseRepository repo;

    @PostMapping
    public Expense add(@Valid @RequestBody Expense e) {
        return repo.save(e);
    }

    @GetMapping
    public List<Expense> all(@RequestParam(required = false) String category) {
        return category == null ? repo.findAll() : repo.findByCategory(category);
    }

    @PutMapping("/{id}")
    public Expense update(@PathVariable Long id, @Valid @RequestBody Expense e) {
        e.setId(id);
        return repo.save(e);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        repo.deleteById(id);
    }

    @GetMapping("/summary")
    public List<Object[]> summary() {
        return repo.totalByCategory();
    }
}