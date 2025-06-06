package com.depromeet.streetdrop.domains.item.dto.request;

import org.springdoc.core.annotations.ParameterObject;
import org.springframework.validation.annotation.Validated;

import com.depromeet.streetdrop.domains.common.annotation.IsLatitude;
import com.depromeet.streetdrop.domains.common.annotation.IsLongitude;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Validated
@ParameterObject
public class NearItemRequestDto {
	private final static Double DEFAULT_DISTANCE = 500.0;

	@Schema(description = "경도", example = "127.123456")
	@IsLongitude
	@NotNull(message= "Longitude is required")
	private Double longitude;

	@Schema(description = "위도", example = "37.123456")
	@IsLatitude
	@NotNull(message= "Latitude is required")
	private Double latitude;

	@Schema(description = "거리 - (단위 - m)", example = "1000")
	private Double distance = DEFAULT_DISTANCE;
}
