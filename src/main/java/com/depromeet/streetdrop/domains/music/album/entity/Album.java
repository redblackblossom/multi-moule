package com.depromeet.streetdrop.domains.music.album.entity;

import static jakarta.persistence.CascadeType.*;
import static jakarta.persistence.FetchType.*;
import static jakarta.persistence.GenerationType.*;

import java.util.ArrayList;
import java.util.List;

import com.depromeet.streetdrop.domains.common.BaseTimeEntity;
import com.depromeet.streetdrop.domains.music.artist.entity.Artist;
import com.depromeet.streetdrop.domains.music.song.entity.Song;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@Entity
public class Album extends BaseTimeEntity {

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "album_id")
	private Long id;

	private String name;

	@OneToOne
	@JoinColumn(name = "album_cover_id")
	private AlbumCover albumCover;

	@OneToMany(mappedBy = "album", fetch = LAZY, cascade = ALL, orphanRemoval = true)
	private List<Song> songs = new ArrayList<>();

	@ManyToOne(fetch = LAZY)
	@JoinColumn(name = "artist_id")
	private Artist artist;

}
