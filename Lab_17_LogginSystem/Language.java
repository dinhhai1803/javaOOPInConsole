public class Language {
    private String errType;
    private String errShow;

    public Language(String type, String show){
        this.errType = type;
        this.errShow = show;
    }
    
    public String getErrType() {
        return errType;
    }
    public String getErrShow() {
        return errShow;
    }
    public void setErrShow(String errShow) {
        this.errShow = errShow;
    }
    public void setErrType(String errType) {
        this.errType = errType;
    }

    public String toString(){
        return this.errType + " " + this.errShow;
    }
}
