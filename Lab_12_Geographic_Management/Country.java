public class Country {
    private String countryCode;
    private String countryName;
    private float totalArea;

    public Country(){

    }

    public Country(String code, String name, float area){
        this.setCountryCode(code);
        this.setCountryName(name);
        this.setTotalArea(area);
    }

    public float getTotalArea() {
        return totalArea;
    }

    public void setTotalArea(float totalArea) {
        this.totalArea = totalArea;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    @Override
    public String toString(){
        return this.countryCode + "\t\t" + this.countryName + "\t\t" + this.totalArea;
    }
    
}
