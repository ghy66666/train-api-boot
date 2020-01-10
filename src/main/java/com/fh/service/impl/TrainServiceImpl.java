package com.fh.service.impl;

import com.fh.mapper.TrainMapper;
import com.fh.model.Train;
import com.fh.service.TrainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrainServiceImpl implements TrainService {

    @Autowired
    private TrainMapper trainMapper;


    @Override
    public List<Train> queryTrainList() {
        return trainMapper.queryTrainList();
    }


    @Override
    public void addTrain(Train train) {
        trainMapper.addTrain(train);
    }

    @Override
    public void deleteTrain(Integer id) {
        trainMapper.deleteTrain(id);
    }

    @Override
    public Train getTrainById(Integer id) {
        return trainMapper.getTrainById(id);
    }

    @Override
    public void updateTrain(Train train) {
        trainMapper.updateTrain(train);
    }
}
