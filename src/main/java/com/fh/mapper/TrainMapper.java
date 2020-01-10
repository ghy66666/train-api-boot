package com.fh.mapper;


import com.fh.model.Train;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TrainMapper {
    List<Train> queryTrainList();

    void addTrain(Train train);

    void deleteTrain(Integer id);

    Train getTrainById(Integer id);

    void updateTrain(Train train);
}
