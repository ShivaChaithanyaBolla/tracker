package io.chaithanya.egen.service;

import io.chaithanya.egen.entity.Readings;
import io.chaithanya.egen.repository.ReadingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ReadingServiceImpl implements ReadingService {

    @Autowired
    ReadingRepository readingRepository;

    @Transactional
    public Readings saveReading(Readings readings) {
        return readingRepository.saveReading(readings);
    }

    public Readings findByVin(Readings readings) {
        return readingRepository.findByVin(readings);
    }
}
