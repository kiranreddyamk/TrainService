package com.travel.train.repository;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.travel.train.model.Train;


@Repository("trainRepository")
public class TrainRepositoryImpl implements TrainRepository {
    private static List<Train> trainList = new ArrayList<Train>();
    private static Long id = 0L;
    private final Logger logger = LoggerFactory.getLogger(TrainRepositoryImpl.class);

    @Override
    public List<Train> getAllTrains() {
    	logger.info("3-getAllTrains Repository(DB)");
        return trainList;
    }

    @Override
    public Train getTrainById(Long id) {
        return findTrainById(id);
    }

    @Override
    public void addTrain(Train train) {
    	logger.info("3-addTrain Repository(DB)");
        train.setId(++id);
        trainList.add(train);
        logger.info("4- New Train added successfully");
        logger.info("5- Train Number is # :" + train.getId());
    }

    @Override
    public void deleteTrainById(Long id) {
    	logger.info("3-deleteTrainById Repository(DB)");
        Train foundTrain = findTrainById(id);
        if (foundTrain != null) {
            trainList.remove(foundTrain);
            id--;
        }
    }

    @Override
    public void deleteAll() {
    	logger.info("3-deleteAll Repository(DB)");
        trainList.clear();
        id = 0L;
    }

    @Override
    public void updateTrain(Train train) {
    	logger.info("3-updateTrain Repository(DB)");
        Train foundTrain = findTrainById(train.getId());
        if (foundTrain != null) {
            trainList.remove(foundTrain);
            trainList.add(train);
        }
    }

    private Train findTrainById(Long id) {
    	logger.info("3-findTrainById Repository(DB)");
        for (Train train : trainList) {
            if (train.getId() == id) {
                return train;
            }
        }
        return null;
    }
}
