package qmp.api.dto;

public class ClimaDTO {

  private String DateTime;
  private Long EpochDateTime;
  private int WeatherIcon;
  private String IconPhrase;
  private Boolean IsDaylight;
  private int PrecipitationProbability;
  private String MobileLink;
  private String Link;
  private TemperatureDTO temperatureDTO;

  public String getDateTime() {
    return DateTime;
  }

  public void setDateTime(String dateTime) {
    DateTime = dateTime;
  }

  public Long getEpochDateTime() {
    return EpochDateTime;
  }

  public void setEpochDateTime(Long epochDateTime) {
    EpochDateTime = epochDateTime;
  }

  public int getWeatherIcon() {
    return WeatherIcon;
  }

  public void setWeatherIcon(int weatherIcon) {
    WeatherIcon = weatherIcon;
  }

  public String getIconPhrase() {
    return IconPhrase;
  }

  public void setIconPhrase(String iconPhrase) {
    IconPhrase = iconPhrase;
  }

  public Boolean getDaylight() {
    return IsDaylight;
  }

  public void setDaylight(Boolean daylight) {
    IsDaylight = daylight;
  }

  public int getPrecipitationProbability() {
    return PrecipitationProbability;
  }

  public void setPrecipitationProbability(int precipitationProbability) {
    PrecipitationProbability = precipitationProbability;
  }

  public String getMobileLink() {
    return MobileLink;
  }

  public void setMobileLink(String mobileLink) {
    MobileLink = mobileLink;
  }

  public String getLink() {
    return Link;
  }

  public void setLink(String link) {
    Link = link;
  }

  public TemperatureDTO getTemperatureDTO() {
    return temperatureDTO;
  }

  public void setTemperatureDTO(TemperatureDTO temperatureDTO) {
    this.temperatureDTO = temperatureDTO;
  }

}
