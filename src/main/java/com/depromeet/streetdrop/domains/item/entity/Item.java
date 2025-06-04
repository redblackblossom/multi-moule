package com.depromeet.streetdrop.domains.item.entity;

import static jakarta.persistence.FetchType.*;
import static jakarta.persistence.GenerationType.*;

import com.depromeet.streetdrop.domains.common.BaseTimeEntity;
import com.depromeet.streetdrop.domains.itemLocation.entity.ItemLocation;
import com.depromeet.streetdrop.domains.music.album.entity.AlbumCover;
import com.depromeet.streetdrop.domains.music.song.entity.Song;
import com.depromeet.streetdrop.domains.user.entity.User;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@Entity
public class Item extends BaseTimeEntity {

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "item_id")
	private Long id;

	@Column(length = 500)
	private String content;

	@OneToOne(fetch = LAZY, mappedBy = "item")
	private ItemLocation itemLocation;

	@ManyToOne(fetch = LAZY)
	@JoinColumn(name = "user_id")
	private User user;

	@ManyToOne(fetch = LAZY)
	@JoinColumn(name = "song_id")
	private Song song;

	@ManyToOne(fetch = LAZY)
	@JoinColumn(name = "album_cover_id")
	private AlbumCover albumCover;

}
