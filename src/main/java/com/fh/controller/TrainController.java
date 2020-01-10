package com.fh.controller;

import com.fh.model.ServerResponse;
import com.fh.model.Train;
import com.fh.service.TrainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class TrainController {

    @Autowired
    private TrainService trainService;

    @RequestMapping("queryTrainList")
    public ServerResponse queryTrainList(){
        try {
            List<Train> trainList = trainService.queryTrainList();
            return ServerResponse.success(trainList);
        } catch (Exception e) {
            e.printStackTrace();
            return ServerResponse.error();
        }
    }


    @RequestMapping("addTrain")
    public ServerResponse addTrain(@RequestBody Train train){
        try {
            trainService.addTrain(train);
            return ServerResponse.success();
        } catch (Exception e) {
            e.printStackTrace();
            return ServerResponse.error();
        }
    }


    @RequestMapping("deleteTrain/{id}")
    public ServerResponse deleteTrain(@PathVariable("id")Integer id){
        try {
            trainService.deleteTrain(id);
            return ServerResponse.success();
        } catch (Exception e) {
            e.printStackTrace();
            return ServerResponse.error();
        }
    }


    @RequestMapping("getTrainById/{id}")
    public ServerResponse getTrainById(@PathVariable("id")Integer id){
        try {
            Train train = trainService.getTrainById(id);
            return ServerResponse.success(train);
        } catch (Exception e) {
            e.printStackTrace();
            return ServerResponse.error();
        }
    }

    @RequestMapping("updateTrain")
    public ServerResponse updateTrain(@RequestBody Train train){
        try {
            trainService.updateTrain(train);
            return ServerResponse.success();
        } catch (Exception e) {
            e.printStackTrace();
            return ServerResponse.error();
        }
    }



}
