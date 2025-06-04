package com.depromeet.streetdrop.domains.area.village.service;

import org.springframework.stereotype.Service;

import com.depromeet.streetdrop.domains.area.village.dto.response.VillageItemsCountResponseDto;
import com.depromeet.streetdrop.domains.area.village.repository.VillageAreaRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class VillageItemService {

    private final VillageAreaRepository villageAreaRepository;

    public VillageItemsCountResponseDto countItemsByVillage(String villageName) {
        var response = villageAreaRepository.countItemsByVillageName(villageName);
        return new VillageItemsCountResponseDto(response);
    }

}
