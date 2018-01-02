package io.chaithanya.egen.repository;

import io.chaithanya.egen.entity.Readings;

public interface ReadingRepository {

    Readings saveReading(Readings readings);

    Readings findByVin(Readings readings);
}
