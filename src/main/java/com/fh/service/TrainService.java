package com.fh.service;

import com.fh.model.Train;

import java.util.List;

public interface TrainService {
    List<Train> queryTrainList();

    void addTrain(Train train);

    void deleteTrain(Integer id);

    Train getTrainById(Integer id);

    void updateTrain(Train train);
}
