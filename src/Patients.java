public class Patients {
    private String name;
    private String surname;
    private int numberPalat;
    private String diagnosis;

    public Patients(String name, String surname, int numberPalat, String diagnosis) {
        this.name = name;
        this.surname = surname;
        this.numberPalat = numberPalat;
        this.diagnosis = diagnosis;
    }

    @Override
    public String toString() {
        return "Patients{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", numberPalat=" + numberPalat +
                ", diagnosis='" + diagnosis + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getNumberPalat() {
        return numberPalat;
    }

    public void setNumberPalat(int numberPalat) {
        this.numberPalat = numberPalat;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }
}
