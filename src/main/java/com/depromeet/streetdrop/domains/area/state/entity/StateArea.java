package com.depromeet.streetdrop.domains.area.state.entity;

import static jakarta.persistence.FetchType.*;
import static jakarta.persistence.GenerationType.*;

import java.util.List;

import com.depromeet.streetdrop.domains.area.city.entity.CityArea;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@Entity
public class StateArea {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "state_id")
    private Long id;

    @Column(nullable = false)
    private String stateName;

    @Column(nullable = false)
    private int stateCode;

    @Column(nullable = false)
    private int version;

    @OneToMany(mappedBy = "stateArea", fetch = LAZY)
    private List<CityArea> cityAreas;

}