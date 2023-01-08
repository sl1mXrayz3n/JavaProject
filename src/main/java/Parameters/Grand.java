package Parameters;

import com.opencsv.bean.CsvBindByPosition;


public class Grand {

    @CsvBindByPosition(position = 0)
    private String company;

    @CsvBindByPosition(position = 1)
    private String street;

    @CsvBindByPosition(position = 2)
    private String money;

    @CsvBindByPosition(position = 3)
    private String year;

    @CsvBindByPosition(position = 4)
    private String type;

    @CsvBindByPosition(position = 5)
    private String places;

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getMoney() {
        return money;
    }

    public void setMoney(String money) {
        this.money = money;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPlaces() {
        return places;
    }

    public void setPlaces(String places) {
        this.places = places;
    }
}
