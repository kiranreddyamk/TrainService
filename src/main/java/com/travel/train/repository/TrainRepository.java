package com.travel.train.repository;

import java.util.List;

import com.travel.train.model.Train;

public interface TrainRepository {
    public List<Train> getAllTrains();

    public Train getTrainById(Long id);

    public void addTrain(Train train);

    public void deleteTrainById(Long id);

    public void deleteAll();

    public void updateTrain(Train train);
}
