package com.travel.train.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.travel.train.model.Train;
import com.travel.train.service.TrainService;


@RestController
@RequestMapping("/trains")
public class TrainController {

    @Autowired
    private TrainService trainService;
    
    private final Logger logger = LoggerFactory.getLogger(TrainController.class);


    @RequestMapping("/getTrains")
    public @ResponseBody List<Train> getTrainList() {
    	logger.info("######################");
    	logger.info("1. getTrains Controller");
        return trainService.getAllTrains();
    }
    
    @RequestMapping(value = "/addKiran", method = RequestMethod.POST)
	public void addKiran(@RequestParam("firstName")String firstName){

    	System.out.println("firstname ="+ firstName);
	}

    @RequestMapping(value = "/addTrain", method = RequestMethod.POST)
    public @ResponseBody void addTrain(@RequestBody Train train) {
    	logger.info("######################");
    	logger.info("1. addTrain Controller");
        trainService.addTrain(train);
        logger.info("######################");
    }

    @RequestMapping(value = "/updateTrain", method = RequestMethod.PUT)
    public @ResponseBody void updateTrain(@RequestBody Train train) {
    	logger.info("1. updateTrain Controller");
        trainService.updateTrain(train);
    }

    @RequestMapping(value = "/removeTrain/{id}", method = RequestMethod.DELETE)
    public @ResponseBody void removeTrain(@PathVariable("id") Long id) {
    	logger.info("1. removeTrain Controller");
        trainService.deleteTrainById(id);
    }

    @RequestMapping(value = "/removeAllTrains", method = RequestMethod.DELETE)
    public @ResponseBody void removeAllTrains() {
    	logger.info("1. removeAllTrains Controller");
        trainService.deleteAll();
    }

}
