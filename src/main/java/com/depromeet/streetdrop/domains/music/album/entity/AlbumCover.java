package com.depromeet.streetdrop.domains.music.album.entity;

import com.depromeet.streetdrop.domains.common.BaseTimeEntity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@Entity
public class AlbumCover extends BaseTimeEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "album_cover_id")
	private Long id;

	@OneToOne(mappedBy = "albumCover")
	private Album album;

	private String albumImage;

	private String albumThumbnail;
}
