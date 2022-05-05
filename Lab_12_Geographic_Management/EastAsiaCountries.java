public class EastAsiaCountries extends Country implements Comparable<EastAsiaCountries>{
    private String countryCode;
    private String countryName;
    private float totalArea;
    private String countryTerrain;

    public EastAsiaCountries(){

    }

    public EastAsiaCountries(String code, String name, float area, String terrain){
        super(code, name, area);
        this.countryTerrain = terrain;
    }

    public String getCountryTerrain() {
        return countryTerrain;
    }
    public void setCountryTerrain(String countryTerrain) {
        this.countryTerrain = countryTerrain;
    }

    @Override
    public String toString(){
        return super.toString() + "\t\t" + this.countryTerrain;
    }

    @Override
    public int compareTo(EastAsiaCountries o){
        if(super.getCountryName().charAt(0) > o.getCountryName().charAt(0)){
            return 1;
        }
        else if(super.getCountryName().charAt(0) < o.getCountryName().charAt(0)){
            return -1;
        }
        else{
            return 0;
        }
    }
}
