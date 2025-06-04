package com.depromeet.streetdrop.domains.area.village.entity;

import static jakarta.persistence.FetchType.*;
import static jakarta.persistence.GenerationType.*;

import org.locationtech.jts.geom.MultiPolygon;
import org.locationtech.jts.geom.Point;

import com.depromeet.streetdrop.domains.area.city.entity.CityArea;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@Entity
public class VillageArea {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "village_id")
    private Long id;

    @Column(nullable = false)
    private String villageName;

    @Column(nullable = false)
    private int villageCode;

    @Column(nullable = false)
    private int version;

    @Column(nullable = false, columnDefinition = "MultiPolygon")
    private MultiPolygon villagePolygon;

    @Column(columnDefinition = "Point")
    private Point villageCenterPoint;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "city_id")
    private CityArea cityArea;

}
