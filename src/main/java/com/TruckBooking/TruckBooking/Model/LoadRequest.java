package com.TruckBooking.TruckBooking.Model;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.NotBlank;

import com.TruckBooking.TruckBooking.Entities.Load.Status;

import lombok.Data;

@Data
public class LoadRequest {

	@NotBlank(message = "Loading Point Cannot Be Empty")
	private String loadingPoint;
	@NotBlank(message = "Loading Point City Cannot Be Empty")
	private String loadingPointCity;
	@NotBlank(message = "Loading Point State Cannot Be Empty")
	private String loadingPointState;
	@NotBlank(message = "PostLoad Id Cannot Be Empty")
	private String postLoadId;
	@NotBlank(message = "Unloading Point Cannot Be Empty")
	private String unloadingPoint;
	@NotBlank(message = "Unloading Point City Cannot Be Empty")
	private String unloadingPointCity;
	@NotBlank(message = "Unloading Point State Cannot Be Empty")
	private String unloadingPointState;
	@NotBlank(message = "Product Type Cannot Be Empty")
	private String productType;
	@NotBlank(message = "Truck Type Cannot Be Empty")
	private String truckType;
	@NotBlank(message = "Weight Cannot Be Empty")
	private String weight;

	private String noOfTrucks;
	private String noOfTyres;

	private String comment; // this should be an optional
	@NotBlank(message = "Load Date Cannot Be Empty")
	private String loadDate;
	private Long rate;

	@Enumerated(EnumType.STRING)
	private UnitValue unitValue;

	public enum UnitValue {
		PER_TON, PER_TRUCK
	}

	public Status status;
}
