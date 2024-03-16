public class Main {
    public static void main (String []
    args) {
       Contact var1 = new Contact (100, "Ivan", "Ivanov", "Russia", "89309309393", "GDH");
       System.out.println(var1.toString());
     
       System.out.println(var1.toString());

    }

    public static class Contact {
        private int id;
        private String firstName;
        private String lastName ;
        private String address;
        private String phone;
        private String note;

    
        public Contact(int id, String firstName, String lastName, String address, String phone, String note) {
            this.id = id;
            this.firstName = firstName;
            this.lastName = lastName;
            this.address = address;
            this.phone = phone;
            this.note = note;
        }
    
        
        // Getters and Setters
        public int getId() {
            return id;
        }
    
        public void setId(int id) {
            this.id = id;
        }
    
        public String getFirstName() {
            return firstName;
        }
    
        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }
    
        public String getLastName() {
            return lastName;
        }
    
        public void setLastName(String lastName) {
            this.lastName = lastName;
        }
    
        public String getAddress() {
            return address;
        }
    
        public void setAddress(String address) {
            this.address = address;
        }
    
        public String getPhone() {
            return phone;
        }
    
        public void setPhone(String phone) {
            this.phone = phone;
        }
    
        public String getNote() {
            return note;
        }
    
        public void setNote(String note) {
            this.note = note;
        }
    
  
    
        @Override
        public String toString() {
            return "Contact{" +
                    "id=" + id +
                    ", firstName='" + firstName + '\'' +
                    ", lastName='" + lastName + '\'' +
                    ", address='" + address + '\'' +
                    ", phone='" + phone + '\'' +
                    ", note='" + note + '\'' +
                    '}';
        }
    }
}