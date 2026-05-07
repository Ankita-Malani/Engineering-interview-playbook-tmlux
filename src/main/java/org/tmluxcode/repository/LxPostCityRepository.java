package org.tmluxcode.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.tmluxcode.entity.LxPostCity;

public interface LxPostCityRepository extends JpaRepository<LxPostCity, Long> {
    Page<LxPostCity> findByCountryId(Long countryId, Pageable pageable);
}
