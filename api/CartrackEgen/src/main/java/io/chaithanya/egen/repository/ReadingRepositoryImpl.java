package io.chaithanya.egen.repository;

import io.chaithanya.egen.entity.Readings;
import io.chaithanya.egen.service.ReadingService;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class ReadingRepositoryImpl implements ReadingRepository {

    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    public Readings saveReading(Readings readings) {

        if(findByVin(readings) != null){
            entityManager.merge(readings);
        }else{
            entityManager.persist(readings);
        }
        return readings;
    }

    public Readings findByVin(Readings readings) {
        return null;
    }
}
