package com.budgeting.Backend.Service;

import com.budgeting.Backend.Model.Expense;
import com.budgeting.Backend.Repository.ExpenseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ExpenseService {

    private final ExpenseRepo expenseRepo;

    @Autowired
    public ExpenseService(ExpenseRepo expenseRepo) {
        this.expenseRepo = expenseRepo;
    }

    public List<Expense> getAll() {
        return expenseRepo.findAll();
    }

    public Expense addExpense(Expense expense) {
        return expenseRepo.save(expense);
    }

    public Expense updateExpense(Expense expense) {
        return expenseRepo.save(expense);
    }


    public void deleteExpenseById(Long id) {
        expenseRepo.deleteById(id);
    }

    public Optional<Expense> getById(Long id) {
        return expenseRepo.findById(id);
    }

}
