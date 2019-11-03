class Person implements Comparable<Person>{
    private int id;
    private String first_name, second_name, mail_index, phone_number;

    void setId(int id) { this.id = id; }
    void setFirstName(String first_name) { this.first_name = first_name; }
    void setSecondName(String second_name) { this.second_name = second_name; }
    void setMailIndex(String mail_index) { this.mail_index = mail_index; }
    void setPhoneNumber(String phone_number) { this.phone_number = phone_number; }

    int getId() { return id; }
    String getFirstName() { return first_name; }
    String getSecondName() { return second_name; }
    String getMailIndex() { return mail_index; }
    String getPhoneNumber() { return phone_number; }

    void show_info() {
        System.out.print("ID: " + getId() +
                "\nИмя: " + getFirstName() +
                "\nФамилия: " + getSecondName() +
                "\nПочтовый индекс: " + getMailIndex() +
                "\nТелефонный номер: " + getPhoneNumber() + "\n");
    }

    @Override
    public String toString() {
        return "User`s info {" + getId() + "; " + getFirstName() + "; " + getPhoneNumber() + "}";
    }

    @Override
    public int compareTo(Person o) {
        return getFirstName().compareTo(o.getFirstName());
    }
}