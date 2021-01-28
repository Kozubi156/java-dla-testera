package enums;

public enum Gender {

    M("Meżczyzna"),
    F("Kobieta");

    private String gender;

    Gender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

}
