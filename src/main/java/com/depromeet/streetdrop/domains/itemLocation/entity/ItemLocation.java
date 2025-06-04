package com.depromeet.streetdrop.domains.itemLocation.entity;

import static jakarta.persistence.FetchType.*;
import static jakarta.persistence.GenerationType.*;

import org.springframework.data.geo.Point;

import com.depromeet.streetdrop.domains.common.BaseTimeEntity;
import com.depromeet.streetdrop.domains.item.entity.Item;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@Entity
public class ItemLocation extends BaseTimeEntity {

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "item_location_id")
	private Long id;

	@Column(nullable = true)
	private String name;

	@Column(columnDefinition = "GEOMETRY")
	private Point point;

	@OneToOne(fetch = LAZY)
	@JoinColumn(name = "item_id")
	private Item item;

}
