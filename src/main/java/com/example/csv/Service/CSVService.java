package com.example.csv.Service;


import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.example.csv.Models.Transactions;
import com.example.csv.Repository.TransactionRepo;
import com.example.csv.CSVHelper.*;

@Service
public class CSVService {
  @Autowired
  TransactionRepo repository;

  public void save(MultipartFile file) {
    try {
      List<Transactions> tutorials = CSVHelper.csvToTutorials(file.getInputStream());
      repository.saveAll(tutorials);
    } catch (IOException e) {
      throw new RuntimeException("fail to store csv data: " + e.getMessage());
    }
  }

  public ByteArrayInputStream load() {
    List<Transactions> tutorials = repository.findAll();

    ByteArrayInputStream in = CSVHelper.tutorialsToCSV(tutorials);
    return in;
  }

  public List<Transactions> getAllTutorials() {
    return repository.findAll();
  }
}