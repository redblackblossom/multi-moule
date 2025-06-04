package com.depromeet.streetdrop.domains.area.city.entity;

import static jakarta.persistence.FetchType.*;
import static jakarta.persistence.GenerationType.*;

import java.util.List;

import com.depromeet.streetdrop.domains.area.state.entity.StateArea;
import com.depromeet.streetdrop.domains.area.village.entity.VillageArea;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@Entity
public class CityArea {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "city_id")
    private Long id;

    @Column(nullable = false)
    private String cityName;

    @Column(nullable = false)
    private int cityCode;

    @Column(nullable = false)
    private int version;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "state_id")
    private StateArea stateArea;

    @OneToMany(mappedBy = "cityArea")
     private List<VillageArea> villageAreas;

}
