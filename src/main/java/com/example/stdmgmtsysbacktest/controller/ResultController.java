package com.example.stdmgmtsysbacktest.controller;

import com.example.stdmgmtsysbacktest.model.Result;
import com.example.stdmgmtsysbacktest.repository.ResultRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:3000")
public class ResultController {
    @Autowired
    ResultRepository stdRepo;
    @GetMapping("/result/{id}")
    public Result getStudentResult(@PathVariable Integer id){
        return stdRepo.findById(id).get();
    }
    @GetMapping("/listresult")
    public List<Result> getAllStudentResult(){
        return stdRepo.findAll();
    }
    @PostMapping("/result")
    public List<Result> postStudentResult(@RequestBody Result result){
        stdRepo.save(result);
        return stdRepo.findAll();
    }
    @PutMapping("/result/{id}")
    public List<Result> updateStudentResult(@RequestBody Result result, @PathVariable Integer id){
        Result std = stdRepo.findById(id).get();
        std.setName(result.getName());
        std.setResult(result.getResult());
        stdRepo.save(std);
        return stdRepo.findAll();
    }
    @DeleteMapping("/result/{id}")
    public List<Result> deleteStudentResult(@PathVariable Integer id){
        stdRepo.delete(stdRepo.findById(id).get());
        return stdRepo.findAll();
    }
}
