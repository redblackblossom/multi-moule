package com.depromeet.streetdrop.domains.area.village.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.depromeet.streetdrop.domains.area.village.entity.VillageArea;

public interface VillageAreaRepository extends JpaRepository<VillageArea, Long> {

    @Query(value = "select count(i.id) from ItemLocation i where i.villageArea.villageName = :villageAreaName")
    int countItemsByVillageName(String villageAreaName);

}