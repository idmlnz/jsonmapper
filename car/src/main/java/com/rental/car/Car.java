package com.rental.car;

/**
 * Created by imalonzo on 8/13/18.
 */
public class Car implements Comparable<Car>{
  private String make;

  private String model;

  private String vin;

  private Metadata metadata;

  private PerDayRent perdayrent;

  private Metrics metrics;

  public String getMake() {
    return make;
  }

  public void setMake(String make) {
    this.make = make;
  }

  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public String getVin() {
    return vin;
  }

  public void setVin(String vin) {
    this.vin = vin;
  }

  public Metadata getMetadata() {
    return metadata;
  }

  public void setMetadata(Metadata metadata) {
    this.metadata = metadata;
  }

  public PerDayRent getPerdayrent() {
    return perdayrent;
  }

  public void setPerdayrent(PerDayRent perdayrent) {
    this.perdayrent = perdayrent;
  }

  public Metrics getMetrics() {
    return metrics;
  }

  public void setMetrics(Metrics metrics) {
    this.metrics = metrics;
  }

  public int compareTo(Car car) {
    //int comparePrice = ((Car) car).getPerdayrent().getPrice();
    int comparePrice =  car.getPerdayrent().getPrice();
    int compareDiscount = car.getPerdayrent().getPrice() * (1 - (car.getPerdayrent().getDiscount() / 100));

    //ascending order
    return ( (this.getPerdayrent().getPrice() - comparePrice) &&
             (this.getPerdayrent().getDiscount() * (1 - (this.getPerdayrent().getDiscount() / 100))))
              ;

    //descending order
    //return comparePrice - this.getPerdayrent().getPrice();
  }
}
