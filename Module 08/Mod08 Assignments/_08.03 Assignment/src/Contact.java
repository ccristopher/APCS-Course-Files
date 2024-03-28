/**
 * Purpose: Contact Class
 *
 * @author Cristopher Encarnacion
 * @version 03/28/24
 *
 */

public class Contact {
    private String name;
    private String relation;
    private String birthdate;
    private String number;
    private String email;

    public Contact(String n, String r, String b, String num, String e) {
        name = n;
        relation = r;
        birthdate = b;
        number = num;
        email = e;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRelation() {
        return relation;
    }

    public void setRelation(String relation) {
        this.relation = relation;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String toString()
    {
        String str = String.format( "%-17s %-10s %-9s %-18s %-10s ", name,  relation , birthdate, number, email);
        return str;
    }
}