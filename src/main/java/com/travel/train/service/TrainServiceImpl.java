package com.travel.train.service;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.travel.train.model.Train;
import com.travel.train.repository.TrainRepository;


@Service("trainService")
public class TrainServiceImpl implements TrainService {
	
    @Autowired
    private TrainRepository trainRepository;
    private static List<Train> trainList = new ArrayList<Train>();
    private final Logger logger = LoggerFactory.getLogger(TrainServiceImpl.class);

    @Override
    public List<Train> getAllTrains() {
    	logger.info("2-getAllTrains Service");
        return trainRepository.getAllTrains();
    }

    @Override
    public Train getTrainById(Long id) {
    	logger.info("2-getTrainById Service");
        return findTrainById(id);
    }

    @Override
    public void addTrain(Train train) {
    	logger.info("2-addTrain Service");
        trainRepository.addTrain(train);
    }

    @Override
    public void deleteTrainById(Long id) {
        logger.info("2-deleteTrain Service");
        trainRepository.deleteTrainById(id);
    }

    @Override
    public void deleteAll() {
    	logger.info("2-deleteAll Service");
    	trainRepository.deleteAll();
    }

    @Override
    public void updateTrain(Train train) {
    	logger.info("2-updateTrain Service");
    	trainRepository.updateTrain(train);
    }

    private Train findTrainById(Long id) {
    	logger.info("2-findTrainById Service");
        return trainRepository.getTrainById(id);
    }
}
