package com.GenSpark.RESTFulApp_2.Service;

import com.GenSpark.RESTFulApp_2.Dao.AirplaneDao;
import com.GenSpark.RESTFulApp_2.Entity.Airplane;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AirplaneServiceImpl implements AirplaneService{

    @Autowired
    private AirplaneDao airDao;

    @Override
    public List<Airplane> getAllAirplanes() {
        return this.airDao.findAll();
    }

    @Override
    public Airplane getAirplaneByID(int airID) {

        Optional<Airplane> a = this.airDao.findById(airID);
        Airplane airplane = null;
        if (a.isPresent())
        {
            if (a.get().status != false)
            {
                airplane = a.get();
            }
            else
            {
                System.out.println("Sorry. That airplane is not available");
            }
        }
        else
        {
            throw new RuntimeException("Could not find Airplane ID: " + airID);
        }

        return airplane;
    }

    @Override
    public Airplane addAirplane(Airplane plane) {
        return this.airDao.save(plane);
    }

    @Override
    public Airplane updateAirplane(Airplane airplane) {
        return this.airDao.save(airplane);
    }

    @Override
    public String buyAirplane(int airID) {
        Optional<Airplane> a = this.airDao.findById(airID);
        if (a.isPresent())
        {
            if (a.get().status != false)
            {
                return "Congratulations! The airplane is now yours!";
            }
            else
            {
                return "Sorry. That airplane is not available";
            }
        }
        else
        {
            return "Sorry. That ID doesn't exist.";
        }
    }

    @Override
    public String deleteAirplaneByID(int airID) {

        this.airDao.deleteById(airID);

        return "Deleted airplane";
    }
}
