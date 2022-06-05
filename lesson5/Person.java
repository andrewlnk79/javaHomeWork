package lesson5;

public class Person {
    private String fio;
    private int age;
    private String jobTitle;
    private String email;
    private String tel;
    private int salary;

    public Person(String fio, int age, String jobTitle, String email, String tel, int salary) {
        this.fio = fio;
        this.age = age;
        this.jobTitle = jobTitle;
        this.email = email;
        this.tel = tel;
        this.salary = salary;
    }


    @Override
    public String toString() {
        return "Person:" + fio + " ," + age + ", " + jobTitle + ", " + email + ", " + tel + ", " + salary;
    }

    public java.lang.String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}

