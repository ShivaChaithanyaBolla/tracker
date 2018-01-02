package io.chaithanya.egen.service;

import io.chaithanya.egen.entity.Readings;

public interface ReadingService {

    Readings saveReading(Readings readings);

    Readings findByVin(Readings readings);
}
