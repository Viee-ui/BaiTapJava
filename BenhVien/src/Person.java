public class Person {

    private String name;
    private String namSinh;
    private String adress;

    public Person() {

    }

    public Person(String name, String namSinh, String adress) {
        this.name = name;
        this.namSinh = namSinh;
        this.adress = adress;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getNamSinh() {
        return namSinh;
    }
    public void setNamSinh(String namSinh) {
        this.namSinh = namSinh;
    }

    public String getAdress() {
        return adress;
    }
    public void setAdress(String adress) {
        this.adress = adress;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", namSinh=" + namSinh +
                ", adress='" + adress + '\'' +
                '}';
    }

}

