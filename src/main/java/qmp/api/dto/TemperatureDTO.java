package qmp.api.dto;

public class TemperatureDTO {

  private int Value;
  private String Unit;
  private int UnitType;

  public TemperatureDTO(){
  }

  public int getValue() {
    return Value;
  }

  public void setValue(int value) {
    Value = value;
  }

  public String getUnit() {
    return Unit;
  }

  public void setUnit(String unit) {
    Unit = unit;
  }

  public int getUnitType() {
    return UnitType;
  }

  public void setUnitType(int unitType) {
    UnitType = unitType;
  }
}
