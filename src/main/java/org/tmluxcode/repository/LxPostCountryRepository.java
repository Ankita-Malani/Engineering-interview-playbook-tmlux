package org.tmluxcode.repository;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.tmluxcode.entity.LxPostCountry;

public interface LxPostCountryRepository extends JpaRepository<LxPostCountry, Long> {

}
